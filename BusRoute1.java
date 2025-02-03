import java.net.Socket;
import java.util.Scanner;
class Route{
    public String[] name;
    public int[] distan;

    
    public Route(String[] name, int[] distan){
        this.name = name;
        this.distan = distan;
    }
    public void getStopInfo(int x, int n){
        if(x <= 0 || x > n){
            System.out.println("invalid number");
        }
        else {
            System.out.println(name[x - 1] + " " + distan[x - 1]);
        }
        
    }
    
}
    
public class BusRoute1 {
        
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
            int x = sc.nextInt();
            st.getStopInfo(x, n);
        }

    }
}
