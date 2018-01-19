import java.util.Scanner;

public class GuessNumber {
    public void InitialAsk() {

    }

    public void guessGame(){
        Scanner scano = new Scanner(System.in);
            System.out.print("What are your initials? ");
            String initials = scano.nextLine();
            int Slen = initials.length();
            boolean b = false;
            if (Slen != 2) {
                 b = false;
            }
            else {
                 b = true;
            }
            while (b == false){


            }
        }


    public static void main(String[]args){
        GuessNumber gg = new GuessNumber();
        gg.guessGame();
    }
}

