public class phoneNumber {

    public phoneNumber(){
    }

    public String numberConverter(String letters) {
        String input = "";
        String output = "";
        for (int c = 0; c < letters.length(); c++) {
            char letter = letters.charAt(c);
            input = Character.toString(letter);
            //2 = ABC 3 = DEF 4 = GHI 5 = JKL
            //6 = MNO 7 = PRS 8 = TUV 9 = WXY

                if (input.contains("A")||input.contains("B")||input.contains("C")) {
                    output = (output + "2");
                    //System.out.print(output);
                }
                else if (input.contains("D")||input.contains("E")||input.contains("F")) {
                    output = (output + "3");
                    //output = Integer.parseInt(output);
                }
                else if (input.contains("G")||input.contains("H")||input.contains("I")) {
                    output = (output + "4");
                }
                else if (input.contains("J")||input.contains("K")||input.contains("L")) {
                    output = (output + "5");
                }
                else if (input.contains("M")||input.contains("N")||input.contains("O")) {
                    output = (output + "6");
                }
                else if (input.contains("P")||input.contains("Q")||input.contains("R")||input.contains("S")) {
                    output = (output + "7");
                }
                else if (input.contains("V")||input.contains("T")||input.contains("U")) {
                    output = (output + "8");
                }
                else if (input.contains("W")||input.contains("X")||input.contains("Y")||input.contains("Z")) {
                    output = (output + "9");
                }


        }
        return output;
    }
}
