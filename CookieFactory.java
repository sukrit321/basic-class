import java.util.Scanner;
class CookiePlanner {
    public int bags = 0;
    public int flour = 0;
    public int butter = 0;
    public int useflour;
    public int usebutter;

    public CookiePlanner(int F, int B){
        this.useflour = F;
        this.usebutter = B;
    }

    int calculate(){
        int f = this.flour / this.useflour;
        int b = this.butter / this.usebutter;
        int max = 0;
        if(f < b){
            max = f;
            return max;
        }
        else {
            max = b;
            return max;
        }
        
    }

    boolean produce(int A){
        int f = this.flour / this.useflour;
        int b = this.butter / this.usebutter;
        int max = 0;
        if(f < b){
            max = f;
        }
        else {
            max = b;
        }
        if(A <= max){
            this.bags += A;
            this.flour -= (A * this.useflour);
            this.butter -= (A * this.usebutter);
            System.out.println(this.bags + " true");
            return true;
        }
        else {
            int y = calculate();
            System.out.println("Max capacity = " + y + " bags, but " + A + " bags requested false");
            return false;
        }
    }

    boolean addFlour(int A){
        if(A <= 0){
            System.out.println("Invalid flour quantity false");
            return false;
        }
        else {
            this.flour += A;
            System.out.println(this.flour + " true");
            return true;
        }
    }

    boolean addButter(int A){
        if(A <= 0){
            System.out.println("Invalid butter quantity false");
            return false;
        }
        else {
            this.butter += A;
            System.out.println(this.butter + " true");
            return true;
        }
    }

    void reportProduction(){
        System.out.println("Cookie bags: " + this.bags);
        System.out.println("Flour left: " + this.flour);
        System.out.println("Butter left: " + this.butter);
    }

}
public class CookieFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int F = scan.nextInt();
        final int B = scan.nextInt();
        CookiePlanner planner = new CookiePlanner(F, B);

        final int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
        int K = scan.nextInt();
        int A = scan.nextInt();
            if(K == 1){
                boolean x = planner.addFlour(A);
            }
            else if(K == 2){
                boolean x = planner.addButter(A);
            }
            else {
                boolean x = planner.produce(A);
            }
        }
        planner.reportProduction();
    }
}
