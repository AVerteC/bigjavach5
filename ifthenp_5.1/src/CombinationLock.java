import java.util.Scanner;

public class CombinationLock {
    String locknums = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String Combo = "";
    private String longCombo = "";

    public char nabLetter(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char c = input.charAt(0);
        return c;
    }

    public boolean unLock(String input) {
        Boolean x = false;
        if (Combo.length() == 3) {
            if (input.equals(this.Combo)) {
                x = true;
            }
        }
        else if (Combo.length() > 3) {
            if (input.equals(this.longCombo)) {
                x =  true;
            }
        }
    return x;
    }

    public void setLetter(char letter) {
        if (Character.isLetter(letter)!= true){
            System.out.println("Please input a letter.");
        }
        if (!Character.isUpperCase(letter)) {
            letter = Character.toUpperCase(letter);
        }
        if (Combo.length() < 3) {
            this.Combo = this.Combo + Character.toString(letter);
        }
        else {
            this.Combo = this.Combo + Character.toString(letter);
            this.longCombo = Character.toString(this.Combo.charAt(this.Combo.length() - 3)) +
                    Character.toString(this.Combo.charAt(this.Combo.length() - 2)) +
                    Character.toString(this.Combo.charAt(this.Combo.length() - 1));
        }
    }

    /*public void getCombo() {
        if (Combo.length() <= 3) {
            System.out.println(this.Combo);
        } else {
            System.out.println(this.longCombo);
        }
    }
       */
    public static void main(String [] args ){
        CombinationLock CLock = new CombinationLock();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please one letter to set the combination lock.");
        CLock.setLetter(CLock.nabLetter());

        System.out.println("Please another letter to set the combination lock.");
        CLock.setLetter(CLock.nabLetter());

        System.out.println("Please one more letter to set the combination lock.");
        CLock.setLetter(CLock.nabLetter());
        //CLock.getCombo();
        System.out.println("Do you want to add more [L]etters, [U]nlock the combination lock, or [E]xit?");
        System.out.println("Please enter L/U/E");
        String answer = sc.nextLine();
        while (answer.equals("E") == false) {


            if (answer.equals("L")) {
                System.out.println("Enter another letter for the combination");
                CLock.setLetter(CLock.nabLetter());
            } else if (answer.equals("U")) {
                System.out.println("Enter the combination.");
                //CLock.getCombo();
                String input = sc.nextLine();
                if (CLock.unLock(input) == false) {
                    System.out.println("The combination is incorrect. Try again.");
                    CLock.unLock(sc.nextLine());
                }

                    if (CLock.unLock(input) == true) {
                        System.out.println("The lock has been unlocked.");
                        System.out.println("The lock has also been closed.");
                    }

            }
            System.out.println("Do you want to add more [L]etters, [U]nlock the combination lock, or [E]xit?");
            System.out.println("Please enter L/U/E");
            answer = sc.nextLine();
        }


    }
}
