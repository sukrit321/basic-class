import java.util.Scanner;

class  ZooTicket1{
    public String name;
    int money = 100;
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    public ZooTicket1(String name){
        this.name = name;
    }

    public void bookRide(){
        money += 40;
        c1++;
    }

    public void  bookSealShow(){
        money += 50;
        c2++;
    }

    public void bookTigerShow(){
        money += 65;
        c3++;
    }

    public void summarize(){
        System.out.println(this.name);
        if(c1 == 1){
            System.out.println("Ride");
        }
        if(c2 == 1){
            System.out.println("Seal");
        }
        if(c3 == 1){
            System.out.println("Tiger");
        }
        System.out.println(money);
    }

    public boolean useRide(){
        if(c1 == 1){
            System.out.println("okay");
            c1 = 0;
            return true;
        }
        else {
            System.out.println("no");
            return false;
        }

    }

    public boolean enterSealShow(){
        if(c2 == 1){
            System.out.println("okay");
            c2 = 0;
            return true;
        }
        else {
            System.out.println("no");
            return false;
        }
    }

    public boolean enterTigerShow(){
        if(c3 == 1){
            System.out.println("okay");
            c3 = 0;
            return true;
        }
        else {
            System.out.println("no");
            return false;
        }
    }



}

public class ZooTicket2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        ZooTicket1 zt = new ZooTicket1(name);
        for(;;){
            int x = sc.nextInt();
            if(x == 0){
                zt.summarize();
                break;
            }
            else if(x == 1){
                zt.bookRide();
            }
            else if(x == 2){
                zt.bookSealShow();
            }
            else {
                zt.bookTigerShow();
            }
        }

        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int a = sc.nextInt();
            if(a == 1){
                boolean rid = zt.useRide();
                System.out.println(rid);
            }
            else if(a == 2){
                boolean sea = zt.enterSealShow();
                System.out.println(sea);
            }
            else {
                boolean tig = zt.enterTigerShow();
                System.out.println(tig);
            }
        }
    }
}
