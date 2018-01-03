public class RandoGenera
{

    public void Genera(int rold)
    {
        int a = 32310901;
        int b = 1729;
        for (int x = 0; x < 100; x++) {

            int rn = ((a * rold) + b);
            System.out.println(rn);
            rold = rn;
        }

    }
}