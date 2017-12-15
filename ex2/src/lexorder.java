import java.util.*;

public class lexorder {
    int x;
    int y;
    String a;
    String b;

    public int[] intorder(int x, int y) {
        int[] morder = new int[2];

        if (x > y) {
            morder[0] = y;
            morder[1] = x;
        } else if (y < x) {
            morder[0] = x;
            morder[1] = y;
        }
        System.out.println(Arrays.toString(morder));
        return morder;
    }

    public String[] alphaorder(String a, String b) {
        String[] alphao = new String[2];

        if (a.compareTo(b) > 0) {
            alphao[0] = b;
            alphao[1] = a;
        } else if (a.compareTo(b) < 0) {
            alphao[0] = a;
            alphao[1] = b;
        } else {
            alphao[0] = a;
            alphao[1] = a;
        }
        System.out.println(Arrays.toString(alphao));
        return alphao;
    }

    double[] realorder(double w, double x, double y, double z) {
        double[] rorder = new double[4];

        double min = 99999999;
        double[] irorder = new double[4];
        irorder[0] = w;
        irorder[1] = x;
        irorder[2] = y;
        irorder[3] = z;
        Arrays.sort(irorder);
        System.out.println(Arrays.toString(irorder));
        return irorder;

    }



}


