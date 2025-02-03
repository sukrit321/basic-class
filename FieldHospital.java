import java.util.Scanner;

class FieldManager {
    public int N;
    public int bed[];

    public FieldManager(int N){
        this.N = N;
        this.bed = new int[N];
    }

    int reserveBed(){
        boolean a = false;
        int s = 0;
        for(int i = 0; i < N; i++){
            if(this.bed[i] == 0){
                s = i;
                this.bed[i] = 1;
                a = true;
                break;
            }
        }
        if(a){
            System.out.println("Bed " + (s + 1) + " reserved");
            return s; 
        }
        else {
            System.out.println("No bed vacancy");
            return -1;
        }
    }

    boolean  discharge(int A){
        if(this.bed[A - 1] == 0){
            System.out.println("Invalid bed number");
            return false;
        }
        else {
            System.out.println("Patient discharged");
            this.bed[A - 1] = 0;
            return true;
        }
    }

    void reportBed(){
        int sum = 0;
        for(int i = 0; i < N; i++){
            if(this.bed[i] == 1){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
public class FieldHospital {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        FieldManager fm = new FieldManager(N);

        final int Q = scan.nextInt();
        for(int i = 0; i < Q; ++i) {
            int K = scan.nextInt();
            int A = scan.nextInt();
            if(K == 1){
                int bad = fm.reserveBed();
            }
            else if(K == 2){
                boolean dis = fm.discharge(A);
            }
            else {
                fm.reportBed();
            }
        
        }
    }
}