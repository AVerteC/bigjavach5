public class phoneNumber {

    public phoneNumber(){
        String output = "";
    }

    public void numberConverter(String letters) {
        for (int c = 0; c < letters.length(); c++) {
            char letter = letters.charAt(c);
            //2 = ABC 3 = DEF 4 = GHI 5 = JKL
            //6 = MNO 7 = PRS 8 = TUV 9 = WXY

                if ((letter.contains("A")||(letter.contains("B")||(letter.contains("C")){
                    System.out.print(2);
                }

                else if((letter.contains("D")||(letter.contains("E")||(letter.contains("F")){
                    System.out.print(3);
                }

            System.out.println(letter);
        }

    }
}
