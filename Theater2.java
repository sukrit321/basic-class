import java.util.Scanner;
class Theater {
    public boolean threeD;
    public boolean luxury;
    public int numSeats;
    public int[] seats;
    String title;
    int basePrice;

    public Theater(boolean threeD, boolean luxury, int numSeats){
        this.threeD = threeD;
        this.luxury = luxury;
        this.numSeats = numSeats;
        this.seats = new int[numSeats];

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

    int reserveOne(int seatNumber){
        if(seatNumber <= 0 || seatNumber - 1 >= seats.length){
            System.out.println("sorry");
            return -1;
        }
        else  if(seats[seatNumber - 1] == 0){
            seats[seatNumber - 1] = 1;
            return this.basePrice;
        }
        else {
            System.out.println("sorry");
            return -1;
        }
    }

    int reserveMultiple(int numSeats, int seatNumber){
        boolean a = false;
        if(seatNumber <= 0 || seatNumber+numSeats - 1 > seats.length){
            System.out.println("sorry");
            return -1;
        }
        else {
            for(int i = 0; i < numSeats; i++){
                if(seats[seatNumber - 1 + i] == 1){
                    a = true;
                }
            }
            if(a){
                System.out.println("sorry");
                return -1;
            }
            else {
                for(int i = 0; i < numSeats; i++){
                    seats[seatNumber - 1 + i] = 1;
                }
                return basePrice * numSeats;
            }
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
// Do not modify the code below. You must leave it as is.
public class Theater2 {
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

        String dummy = scan.nextLine(); // throw away new line character
        String title = scan.nextLine();
        t.setTitle(title);

        int basePrice = scan.nextInt();
        t.setBasePrice(basePrice);

        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
        int numberOfSeats = scan.nextInt();
        int seatNumber = scan.nextInt();
        int totalPrice;
        if(numberOfSeats == 1)
        totalPrice = t.reserveOne(seatNumber);
        else
        totalPrice = t.reserveMultiple(numberOfSeats, seatNumber);
        if(totalPrice > 0)
        System.out.println(totalPrice);
        }

        t.printInfo();
    }
}