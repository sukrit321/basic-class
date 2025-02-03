import java.util.Scanner;
class FoodOrder {
    String name;
    int foodTotal = 0;
    int grandTotal = 0;

    public FoodOrder(String name){
        this.name = name;
    }

    void addFood(int price){
        foodTotal += price;
    }

    void finalizeReceipt(){
        System.out.println(this.name);
        System.out.println(this.foodTotal);
        if(this.foodTotal <= 50){
            System.out.println(20);
            System.out.println(this.foodTotal + 20);
            this.grandTotal = this.foodTotal + 20;
        }
        else if(this.foodTotal <= 150){
            System.out.println(10);
            System.out.println(this.foodTotal + 10);
            this.grandTotal = this.foodTotal + 10;
        }
        else {
            System.out.println(0);
            System.out.println(this.foodTotal + 0);
            this.grandTotal = this.foodTotal;
        }
        
    }

    void  distribIncome(){
        if(this.grandTotal <= 200){
            System.out.println("Rider: 20");
            int total = (this.foodTotal * 3) / 10;
            System.out.println("GrabPanda: " + total);
            int seller = this.grandTotal - 20 - total;
            System.out.println("Food Seller: " + seller); 
        }
        else {
            System.out.println("Rider: 30");
            int total = (this.foodTotal * 3) / 10;
            System.out.println("GrabPanda: " + total);
            int seller = this.grandTotal - 30 - total;
            System.out.println("Food Seller: " + seller);
        }
    }
}
public class GrabPanda2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int N = scan.nextInt();

        FoodOrder order = new FoodOrder(name);
        for(int i = 0; i < N; ++i) {
            int price = scan.nextInt();
            order.addFood(price);
        }
        order.finalizeReceipt();
        order.distribIncome();
    }
}