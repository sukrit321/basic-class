import java.util.Scanner;

class Route{
    public String[] name;
    public int[] distan;
    int sumdis = 0;

    
    public Route(String[] name, int[] distan){
        this.name = name;
        this.distan = distan;
    }

    void summarizeRoute(){
        for(int i = 0; i < distan.length; i++){
            sumdis += distan[i];
        }
        System.out.println(this.name[0] + " " + this.name[name.length - 1] + " " + sumdis);
    }

    
}

public class BusRoute2 {
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
        st.summarizeRoute();


    }
}
