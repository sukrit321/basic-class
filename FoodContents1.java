import java.util.Scanner;

class Food{
    public String foodname;
    public String[] ingredient;
    public int wei;
    int conut = 0;

    public Food(String foodname, String ingredient, int wei){
        this.foodname = foodname;
        this.ingredient = new String[3];
        this.ingredient[conut] = ingredient;
        this.wei = wei;
        conut++;
    }

    public void addContent(String ingredient2, int wei2){
        this.ingredient[conut] = ingredient2;
        this.wei += wei2;
        conut++;
    }
    

    public void printInfo(){
        System.out.println(this.foodname);
        System.out.println(this.wei);
        for(int i = 0; i < conut; i++){
            System.out.print(this.ingredient[i] + " ");
        }
        System.out.println();
    }

}



public class FoodContents1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String foodname = sc.next();
        String ingredient = sc.next();
        int wei = sc.nextInt();


        Food fd = new Food(foodname, ingredient, wei);
        for(;;){
            int x = sc.nextInt();
            if(x == 0){
                break;
            }
            if(x == 1){
                fd.printInfo();
            }
            else {
                String ingredient2 = sc.next();
                int wei2 = sc.nextInt();
                fd.addContent(ingredient2, wei2);
            }
        }

    }
}
