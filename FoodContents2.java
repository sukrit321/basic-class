import java.util.Scanner;

class Food1{
    public String foodname;
    public String[] ingredient;
    public int wei;
    public int cal;
    int conut = 0;

    public Food1(String foodname, String ingredient, int wei, int cal){
        this.foodname = foodname;
        this.ingredient = new String[3];
        this.ingredient[conut] = ingredient;
        this.wei = wei;
        this.cal = cal * wei;
        conut++;
    }

    public void addContent(String ingredient2, int wei2, int cal2){
        this.ingredient[conut] = ingredient2;
        this.wei += wei2;
        this.cal += cal2 * wei2;
        conut++;
    }
    

    public void printInfo(){
        System.out.println(this.foodname);
        System.out.print(this.wei + " ");
        System.out.println(this.cal);
        for(int i = 0; i < conut; i++){
            System.out.print(this.ingredient[i] + " ");
        }
        System.out.println();
    }

}



public class FoodContents2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String foodname = sc.next();
        String ingredient = sc.next();
        int wei = sc.nextInt();
        int cal = sc.nextInt();

        Food1 fd = new Food1(foodname, ingredient, wei, cal);
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
                int cal2 = sc.nextInt();
                fd.addContent(ingredient2, wei2, cal2);
            }
        }

    }
}
