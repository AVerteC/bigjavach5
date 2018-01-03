import java.util.Scanner;

public class RandoRunner {
    public static void main(String []args){
        RandoGenera rando = new RandoGenera();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value for r-old: ");
        int x = sc.nextInt();
        rando.Genera(x);
    }
}
