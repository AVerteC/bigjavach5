import sun.misc.GC;

import java.util.Scanner;

public class GrainComputer {

    private int maxVolume = 20000;
    private int currentVolume = 0;
    //private int safeHold = 0;

    public void depositGrain(int amount) {
        if (amount % 100 != 0) {
            System.out.println("The deposit must be in multiples of 100.");
        }
        else if (amount % 100 == 0) {
            this.currentVolume = this.currentVolume + amount;
            System.out.println(this.currentVolume + " Tons of grain remain.");
        }

        else if ((this.currentVolume + amount) > maxVolume) {
            System.out.println("Error: Tank was not filled because it will overflow.");
        }

    }

    public void shipGrain(int amount) {
        if (amount < 50) {
            System.out.println("Shipments must be at least 50 tons");
        }

        else {
            //this.safeHold = this.currentVolume;
            if ((this.currentVolume - amount)<0) {
             System.out.println("Error: You cannot ship more than you have stored.");
            }
            else {
                this.currentVolume = this.currentVolume - amount;
                System.out.println(this.currentVolume + " Tons of grain remain.");
            }
        }

    }

    public int getcurrentVolume() {
        return this.currentVolume;
    }

    public static void main(String [] args){
        GrainComputer GC = new GrainComputer();
        Scanner scan = new Scanner(System.in);
        while (GC.getcurrentVolume() == 0) {
            System.out.println("How many tons of grain start in the elevator today?");
            int morn = scan.nextInt();
            GC.depositGrain(morn);
            //System.out.println(GC.getcurrentVolume() + " tons of grain are available.");
        }


        while (( GC.getcurrentVolume() > 0)) {
            //System.out.println(GC.getcurrentVolume());

            String binput = scan.nextLine();
            if (binput.equals("D")){
                System.out.println("How much do you want to deposit?");
                int dinput = Integer.parseInt(scan.nextLine());
                GC.depositGrain(dinput);
                //break;
            }
            if (binput.equals("S")){
                System.out.println("How much do you want to ship?");
                int sinput = Integer.parseInt(scan.nextLine());
                GC.shipGrain(sinput);
                //break;
            }

            if (GC.getcurrentVolume() > 0) {
                System.out.println("[D]eposit or [S]hip? Enter D or S.");
                //break;
            }
            if (GC.getcurrentVolume() == 0) {
                break;
            }

        }


    }

}





