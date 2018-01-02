public class FactorGenerator {

    public FactorGenerator(int numberToFactor) {
        if (numberToFactor < 2) {
            System.out.println(numberToFactor);
        }
        while (numberToFactor%2 == 0){
            System.out.println(2);
            numberToFactor/=2;
        }
        for (int i = 3; i<=Math.sqrt(numberToFactor);i+=2){
        while (numberToFactor%i==0){
            System.out.println(i);
            numberToFactor/=i;

            }
        }

    }

    public int nextFactor(int numberToFactor) {

        if (numberToFactor < 2) {
            return numberToFactor;
        }
        if (numberToFactor%2 == 0){
            System.out.println(2);
            numberToFactor/=2;
        }
        for (int i = 3; i<=Math.sqrt(numberToFactor);i+=2){
            if (numberToFactor%i==0){
                return i;


            }
        }

    }


    public boolean hasMoreFactors(int num){
        if (num > 1){
            return true;
        }
        else{
            return false;
        }
    }


}
