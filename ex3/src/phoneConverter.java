import java.util.Scanner;

public class phoneConverter {
    public static void main(String args[]) {
        phoneNumber numconverter = new phoneNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Which letters do you want to convert?");
        String y = sc.nextLine();
        String x = numconverter.numberConverter(y);
        System.out.println(x);
    }
}
