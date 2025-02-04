import java.util.Scanner;

class Wardrobe{
    String name;
    String[] Brand = new String[20];
    int[] numBrand = new int[20];
    int[] numproducts = new int[4];
    int n = 0;

    public Wardrobe(String name){
        this.name = name;
        System.out.println(this.name + " is created");
    }

    void addProduct(String brand, int numproducts){
        this.Brand[n] = brand;
        this.numBrand[n] = numproducts;
        if(brand.indexOf("shirt") != -1){
            this.numproducts[0] += numproducts;
        }
        else if(brand.indexOf("pants") != -1){
            this.numproducts[1] += numproducts;
        }
        else if(brand.indexOf("trouser") != -1){
            this.numproducts[2] += numproducts;
        }
        else {
            this.numproducts[3] += numproducts;
        }
        n++;
    }

    void summary(){
        System.out.println("Name: " + this.name);
        for(int i = 0; i < n; i++){
            System.out.print(this.Brand[i] + " ");
            System.out.println(this.numBrand[i]);
        }
    }

    int computeValue(){
        int sum = 0;
        sum += (this.numproducts[0] * 1200) + (this.numproducts[1] * 900) + (this.numproducts[2] * 1500) + (this.numproducts[3] * 500);
        return sum;
    }
}

public class ClothingShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Wardrobe ward = new Wardrobe(name);

        for(;;){
            int x = sc.nextInt();
            if(x == 0){
                break;
            }
            else if(x == 1){
                String brand = sc.next();
                int numproducts = sc.nextInt();
                ward.addProduct(brand, numproducts);
            }
            else if (x == 2){
                ward.summary();
            }
            else if (x == 3){
                int s = ward.computeValue();
                System.out.println(s);
            }
        }

    }
}
