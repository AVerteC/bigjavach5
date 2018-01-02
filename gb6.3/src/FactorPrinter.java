import java.util.Scanner;

public class FactorPrinter{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number to factor: ");
        int i = sc.nextInt();
        FactorGenerator Fage = new FactorGenerator(i);

    }
}
