/*import java.util.Scanner;
class Theater {
    public boolean threeD;
    public boolean luxury;
    public int numSeats;
    String title;
    int basePrice;

    public Theater(boolean threeD, boolean luxury, int numSeats){
        this.threeD = threeD;
        this.luxury = luxury;
        this.numSeats = numSeats;
    }

    public void setTitle(String title){
        if(title == null || title.length() == 0) {
            System.out.println("invalid title");
        }
        else {
            this.title = title;
        }

    }

    public void setBasePrice(int basePrice){
        if(basePrice <= 0){
            System.out.println("invalid price");
        }
        else {
            this.basePrice = basePrice;
        }
    }

    public void printInfo(){
        if(this.threeD){
            System.out.println("3D");
        }
        else {
            System.out.println("No 3D");
        }
        if(this.luxury){
            System.out.println("Luxury");
        }
        else {
            System.out.println("Standard");
        }
        System.out.println(this.numSeats);
        if(title == null){
            System.out.println("title is not set");
        }
        else {
            System.out.println(this.title);
        }
        if(this.basePrice > 0){
            System.out.println(this.basePrice);
        }
        else {
            System.out.println("price is not set");
        }
    }
}
public class Theater1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int threeD1 = scan.nextInt();
        int luxury1 = scan.nextInt();
        int numSeats = scan.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if(threeD1 == 1)
        threeD = true;
        if(luxury1 == 1)
        luxury = true;
        Theater t = new Theater(threeD, luxury, numSeats);

        String dummy = scan.nextLine();// throw away a new line character
        String title = scan.nextLine();
        if(title.compareTo("-1") == 0)
        t.setTitle(null);
        else
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);
        t.printInfo();
    }
}*/