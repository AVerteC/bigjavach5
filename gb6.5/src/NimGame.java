import java.util.Random;
import java.util.Scanner;

public class NimGame
{
    int pilesize;

    public void NimGame() {
        Random rand = new Random();
        int smarts = (rand.nextInt(2));
        // 0 = smart 1 = dumb
        //smarts = 0;
         System.out.println(smarts);

        int firstturn = (rand.nextInt(2));
        // 0 = human turn first 1 = computer turn first
        // System.out.println(firstturn);
        //firstturn = 1;
        this.pilesize = (rand.nextInt(100) + 10);

        if (smarts == 1) {
            if (firstturn == 0) {
                System.out.println("The pile of marbles contains " + this.pilesize + " marbles.");
                while (this.pilesize > 0) {

                    playermove();

                    if (this.pilesize == 0) {
                        System.out.println("The computer wins!");
                    }

                    dumbmove();

                    if (this.pilesize == 0) {
                        System.out.println("The human wins!");
                    }

                }
            }

            if (firstturn == 1) {
                System.out.println("The pile of marbles contains " + this.pilesize + " marbles.");
                while (this.pilesize > 0) {

                    dumbmove();

                    if (this.pilesize == 0) {
                        System.out.println("The human wins!");
                    }

                    playermove();

                    if (this.pilesize == 0) {
                        System.out.println("The computer wins!");
                    }

                }
            }

        }
        if (smarts == 0) {
            if (firstturn == 0) {
                System.out.println("The pile of marbles contains " + this.pilesize + " marbles.");
                while (this.pilesize > 0) {

                    playermove();

                    if (this.pilesize == 0) {
                        System.out.println("The computer wins!");
                    }

                    smartmove();

                    if (this.pilesize == 0) {
                        System.out.println("The human wins!");
                    }

                }
            }

            if (firstturn == 1) {
                System.out.println("The pile of marbles contains " + this.pilesize + " marbles.");
                while (this.pilesize > 0) {

                    smartmove();

                    if (this.pilesize == 0) {
                        System.out.println("The human wins!");
                    }

                    playermove();

                    if (this.pilesize == 0) {
                        System.out.println("The computer wins!");
                    }


                }
            }
        }
    }



    public void dumbmove() {
    Random rand = new Random();
        int takenamount = (rand.nextInt(this.pilesize/2)+1);
        if(takenamount > this.pilesize){
            takenamount = this.pilesize;
        }
        this.pilesize = this.pilesize - takenamount;
        System.out.println("The computer has taken "+takenamount);
        System.out.println("The pile size is now "+this.pilesize);

    }

    public void smartmove() {

        if (this.pilesize> 63){
            System.out.println("The computer has taken " +(this.pilesize-63)+ " pieces." );
            this.pilesize = 63;
            System.out.println("The pile size is now "+this.pilesize);
        }
        else if (this.pilesize > 31){
            System.out.println("The computer has taken " +(this.pilesize-31)+ " pieces." );
            this.pilesize = 31;
            System.out.println("The pile size is now "+this.pilesize);
        }
        else if (this.pilesize > 15){
            System.out.println("The computer has taken " +(this.pilesize-15)+ " pieces." );
            this.pilesize = 15;
            System.out.println("The pile size is now "+this.pilesize);
        }
        else if (this.pilesize > 7){
            System.out.println("The computer has taken " +(this.pilesize-7)+ " pieces." );
            this.pilesize = 7;
            System.out.println("The pile size is now "+this.pilesize);
        }
        else if (this.pilesize > 3){
            System.out.println("The computer has taken " +(this.pilesize-3)+ " pieces." );
            this.pilesize = 3;
            System.out.println("The pile size is now "+this.pilesize);
        }

        else if((this.pilesize == 63) || (this.pilesize == 31) || (this.pilesize == 15) || (this.pilesize == 7) || (this.pilesize == 3)){
            dumbmove();

        }
    }

    public void playermove() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of marbles you want to take: ");
        int playertake = sc.nextInt();
        this.pilesize = this.pilesize - playertake;
        System.out.println("The pile now contains "+this.pilesize+" marbles.");
    }

}

