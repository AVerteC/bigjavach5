import java.util.Scanner;

public class PrimePrinter {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Calculate primes up to the number: ");
        int i = sc.nextInt();
        PrimeGenerator Page = new PrimeGenerator();
        Page.nextPrime(i);

    }
}
