public class CombinationLock {
    String locknums = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String Combo = "";

    public void SetNumber(char letter) {
        if (!Character.isUpperCase(letter)) {
            letter = Character.toUpperCase(letter);
        }
        if (Combo.length() < 3) {
            this.Combo = this.Combo + letter;
        }
        else {
            this.Combo = this.Combo + letter;
            int number = this.Combo.charAt(this.Combo.length() - 1) + this.Combo.charAt(this.Combo.length() - 2) + this.Combo.charAt(this.Combo.length() - 3);
            System.out.println(number);
        }
    }

    public static void main(String[]args){
        CombinationLock CLock = new CombinationLock();
        CLock.SetNumber('A');
        CLock.SetNumber('B');
        CLock.SetNumber('C');
        CLock.SetNumber('D');
    }
}
