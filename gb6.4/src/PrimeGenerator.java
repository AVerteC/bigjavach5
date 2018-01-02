public class PrimeGenerator {
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        else if (n <= 3) {
            return true;
        }
        else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0){
            return false;}
        i = i + 6;
        }
        return true;
    }




    public int abovePrime(int n) {
        n = n + 1;
        while (isPrime(n) != true) {
            n++;
        }
        return n;
    }

    public void nextPrime(int n) {
        if (n >= 3) {
            System.out.println("2");
            System.out.println("3");
        }
        for (int x = 4; x < n; x++) {
            if (isPrime(x) == true) {
                System.out.println(x);
            }
        }
    }

}
