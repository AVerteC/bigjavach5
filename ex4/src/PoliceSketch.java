import java.util.Scanner;

public class PoliceSketch {
    public static void sketcher(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choices of hair style follow \n (1) parted \n (2) brush cut \n (3) balding");
        System.out.print("enter choice:");
        int o1 = sc.nextInt();
        System.out.println("Choices of eye style follow \n (1) beady - eyed \n (2) wide - eyed \n (3) wears glasses");
        System.out.print("enter choice:");
        int o2 = sc.nextInt();
        System.out.println("Choices of mouth style follow \n (1) smiling \n (2) straightfaced \n (3) surprised");
        System.out.print("enter choice:");
        int o3 = sc.nextInt();

        if (o1 == 1){
            System.out.println("    |||||||////////");
        }
        if (o1 == 2){
            System.out.println("    //////////\\\\");
        }
        if (o1 == 3){
            System.out.println("    |_____|_|_|____|");
        }
        if (o2 == 3){
            System.out.println("    |              |");
            System.out.println("    | ---     ---  |");
            System.out.println("    |---|o|--|o|---|");

            System.out.println("    | ---     ---  |");
            System.out.println("   _|              |_");
            System.out.println("  |_                _|");
        }
        if (o2 == 2){
            System.out.println("    |              |");
            System.out.println("    | ---     ---  |");
            System.out.println("    || O |   | O | |");
            System.out.println("    | ---     ---  |");
            System.out.println("   _|              |_");
            System.out.println("  |_                _|");
        }
        if (o2 == 1){
            System.out.println("    |              |");
            System.out.println("    | ---     ---  |");
            System.out.println("    |  o       o   |");
            System.out.println("    | ---     ---  |");
            System.out.println("   _|              |_");
            System.out.println("  |_                _|");
        }


        if (o3 == 3){
            System.out.println("    |       o      |");
            System.out.println("    |              |");
        }
        if (o3 == 1){
            System.out.println("   | |           | |");
            System.out.println("   |  |_________|  |");
        }
        if (o3 == 2){
            System.out.println("    |      ____    |");
            System.out.println("    |              |");

        }

    }

}