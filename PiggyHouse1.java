import java.util.Scanner;
class House {
    public int wide;
    public int lon;
    public int space;
    public int pig = 0;

    public House(int w, int l){
        this.wide = w;
        this.lon = l;
        this.space = w * l;
    }

    static void encourage(){
        System.out.println("Piggy Together STRONG!");
    }

    void  printPiggies(){
        int spa = this.pig * 9;
        if(this.pig * 9 <= this.space){
            System.out.println("Piggies " + this.pig + ", Space " + spa);
        }
        else{
            System.out.println("no space, need a new house");
        }
    } 
        
}
    public class PiggyHouse1 {
    public static void main(String[] args) {
        House.encourage();
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int l = sc.nextInt();
        House h = new House(w, l);
        while(true){
        int K = sc.nextInt();
            if((K + h.pig) * 9 <= h.space){
                h.pig += K;
                h.printPiggies();
            }
            else{
                h.pig += K;
                h.printPiggies();
                break;
            }
        }
    }
}