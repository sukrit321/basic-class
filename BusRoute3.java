import java.util.Scanner;

class Route{
    public String[] name;
    public int[] distan;
    int sumdis = 0;

    
    public Route(String[] name, int[] distan){
        this.name = name;
        this.distan = distan;
    }

    void getTripInfo(int start, int end, int n){
        int sum = 0;
        if(start <= 0 || end > n){
            System.out.println("invalid number");
        }
        else if(start > end || start == end){
            System.out.println("invalid number");
        }
        else {
            for(int i = start; i < end; i++){
                sum += distan[i];
            }
            System.out.println(this.name[start - 1] + " " + this.name[end - 1] + " " + sum);
        }
    }

    
}

public class BusRoute3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] name = new String[n];
        int[] distan = new int[n];
        for(int i = 0; i < n; i++){
            name[i] = sc.next();
            distan[i] = sc.nextInt();
        }
        Route st = new Route(name, distan);
        int k = sc.nextInt();
        for(int i = 0; i < k; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            st.getTripInfo(start, end, n);
        }


    }
}