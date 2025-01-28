import java.util.Scanner;
class Theater {
    public boolean threeD;
    public boolean luxury;
    public int numSeats;

    public Theater(boolean threeD, boolean luxury, int numSeats){
        this.threeD = threeD;
        this.luxury = luxury;
        this.numSeats = numSeats;
    }

    public void setTitle(String title){

    }

    public void setBasePrice(int basePrice){

    }

    public void printInfo(){
        
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
}