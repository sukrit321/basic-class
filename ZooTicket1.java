import java.util.Scanner;

class  ZooTicket{
    public String name;
    int money = 100;
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    public ZooTicket(String name){
        this.name = name;
    }

    public void bookRide(){
        money += 40;
        c1++;
    }

    public void  bookSealShow(){
        money += 50;
        c2++;
    }

    public void bookTigerShow(){
        money += 65;
        c3++;
    }

    public void  summarize(){
        System.out.println(this.name);
        if(c1 == 1){
            System.out.println("Ride");
        }
        if(c2 == 1){
            System.out.println("Seal");
        }
        if(c3 == 1){
            System.out.println("Tiger");
        }
        System.out.println(money);
    }

}

public class ZooTicket1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        ZooTicket zt = new ZooTicket(name);
        for(;;){
            int x = sc.nextInt();
            if(x == 0){
                zt.summarize();
                break;
            }
            else if(x == 1){
                zt.bookRide();
            }
            else if(x == 2){
                zt.bookSealShow();
            }
            else {
                zt.bookTigerShow();
            }
        }
    }
}
