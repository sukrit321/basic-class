import java.util.Scanner;
class Pond {
    public int d;
    public int r;
    public int n;

    public Pond(int d, int r){
        this.d = d;
        this.r = r;
        this.n = 20 * (d * r);
        printInfo();
    }

    public void reproductive(int H){
        this.n += (H * r *d)/4 + (H * n)/3;
    }

    public void takeFish(int K){
        if(this.n - K <= 0){
            this.n = 0;
        }
        else {
            this.n -= K;
        }
    }

    public void expand(int P){
        if(this.r + P >= 50){
            this.r = 50;
        }
        else {
            this.r += P;
        }
    }

    public void printInfo(){
        System.out.println("Depth " + this.d + ", Radius " + this.r + ", Fish " + this.n);
    }
}
public class FishyPond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int r = sc.nextInt();
        
        Pond pond = new Pond(d, r);
        while (true) {
            int C = sc.nextInt();
            if (C == 0) {
                break;
            } 
            else if (C == 1) {
                int K = sc.nextInt();
                pond.takeFish(K);
            }
            else if (C == 2) {
                int H = sc.nextInt();
                pond.reproductive(H);
            } 
            else if (C == 3) {
                int P = sc.nextInt();
                pond.expand(P);
            }
            pond.printInfo();
            
        }
    }
}