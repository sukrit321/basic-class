import java.util.Scanner;

class Dept{
    public int personnel;
    public int student;
    public int ministryBudget;
    public int eduFee;
    public int serviceFee;
    public int donation;

    public Dept(int personnel, int student){
        this.personnel = personnel;
        this.student = student;
    }

    public void computeIncome(int personnel, int student){
        this.ministryBudget = (personnel * 500000) + (student * 3000);
        this.eduFee = (student * 5000);
        this.serviceFee = 300000;
        this.donation = 100000;
    }

    public void printReport(){
        System.out.println("ministry budget = " + this.ministryBudget);
        System.out.println("education fee = " + this.eduFee);
        System.out.println("service fee = " + this.serviceFee);
        System.out.println("donation = " + this.donation);
    }
}

public class Department1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personnel = sc.nextInt();
        int student = sc.nextInt();

        Dept dp = new Dept(personnel, student);
        dp.computeIncome(personnel, student);
        dp.printReport();
    }
}
