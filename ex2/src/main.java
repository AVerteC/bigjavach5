import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lexorder lorder = new lexorder();
        //lorder.alphaorder("a","b");
        //lorder.intorder(10,5);

        System.out.println("Which letters to order in lexographic order?");
        System.out.print("w: ");
        String w = sc.nextLine();
        System.out.print("x: ");
        String x = sc.nextLine();
        lorder.alphaorder(w,x);


        System.out.println("Which numbers to order from least to greatest?");
        System.out.print("W: ");
        double W = sc.nextDouble();
        System.out.print("X: ");
        double X = sc.nextDouble();
        System.out.print("Y: ");
        double Y = sc.nextDouble();
        System.out.print("Z: ");
        double Z = sc.nextDouble();
        lorder.realorder(W,X,Y,Z);
    }
}
