import java.util.Scanner;
class ContactBook{
    public String name[];
    public String number[];
    public int n;

    public ContactBook(String[] name, String[] number, int n){
        this.name = new String[n];
        this.number = new String[n];
        this.name = name;
        this.number = number;
        this.n = n;
    }

    public void getContact(String name1){
        boolean a = false;
        for(int i = 0; i < this.n; i++){
            if(this.name[i].equals(name1) == true){
                System.out.println(this.number[i]);
                a = true;
            }
        }
        if(!a){
            System.out.println("Invalid contact");
        }

    }

    static boolean onlyDigits(String number1){
        boolean a = true;
        if((number1.length() >= 9 && number1.length() <= 10) && number1.charAt(0) == '0'){
            for(int i = 0; i < number1.length(); i++){
                if(Character.isDigit(number1.charAt(i)) == false){
                    a = false;
                }
            }
            if(a){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public void editNumber(String name1, String number1){
        boolean a = false;
        int b = 0;
        for(int i = 0; i < this.n; i++){
            if(this.name[i].equals(name1) == true){
                a = true;
                b = i;
            }
        }
        if(a){
            boolean z = ContactBook.onlyDigits(number1);
            if(z){
                this.number[b] = number1;
                System.out.println(this.name[b] + " new number is " + this.number[b]);
            }
            else{
                System.out.println("Invalid number");
            }
        }
        else {
            System.out.println("Invalid contact");
        }
    }

    public void getAllContact(){
        for(int i = 0; i < this.n; i++){
            System.out.println(this.name[i] + " " + this.number[i]);
        }
    }

}
public class ContactManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        String[] number = new String[n];
        for(int i = 0; i < n; i++){
            name[i] = sc.next();
            number[i] = sc.next();
        }
        ContactBook conbook = new ContactBook(name, number, n);
        int K = sc.nextInt();
        for(int i = 0; i < K; i++){
            int x = sc.nextInt();
            if(x == 1){
                String name1 = sc.next();
                conbook.getContact(name1);
            }
            else if (x == 2){
                String name1 = sc.next();
                String number1 = sc.next();
                conbook.editNumber(name1, number1);
            }
            else if(x == 3){
                conbook.getAllContact();
            }
            else {
                System.out.println("Invalid command");
            }
        }

    }
}
