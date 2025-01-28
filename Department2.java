import java.util.Scanner;

class Dept1{
    public int personnel;
    public int student;
    public int ministryBudget = 0;
    public int eduFee = 0;
    public int serviceFee = 0;
    public int donation = 0;
    public int salary = 0;
    public int elec = 0;
    public int eduCost = 0;
    public int totalin = 0;
    public int totalex = 0;
    // public int num = totalin - totalex;

    public Dept1(int personnel, int student){
        this.personnel = personnel;
        this.student = student;
    }

    public int computeIncome(int personnel, int student){
        ministryBudget = (personnel * 500000) + (student * 3000);
        eduFee = (student * 5000);
        serviceFee = 300000;
        donation = 100000;
        totalin = ministryBudget + eduFee + serviceFee + donation;
        return totalin;
    }
    
    public int computeExpense(int personnel, int student){
        salary = personnel * 600000;
        elec = (personnel + student) * 2000;
        eduCost = student * 4000;
        totalex = salary + elec + eduCost;
        return totalex;
    }

    public void printReport(){
        // System.out.println("income - expense = " + num);
        System.out.println("ministry budget = " + ministryBudget);
        System.out.println("education fee = " + eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = " + donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = " + elec);
        System.out.println("educational cost = " + eduCost);
    }
}

public class Department2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int personnel = sc.nextInt();
        int student = sc.nextInt();

        Dept1 dp = new Dept1(personnel, student);
        int totalin = dp.computeIncome(personnel, student);
        int totalex = dp.computeExpense(personnel, student);
        int money = totalin - totalex;
        dp.computeExpense(personnel, student);
        // System.out.println("income - expense = " + totalin - totalex);
        System.out.println("total income = " + totalin);
        System.out.println("total expense = " + totalex);
        System.out.println("income - expense = " + money);
        dp.printReport();
    }
}
