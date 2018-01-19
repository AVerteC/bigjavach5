import java.util.Scanner;

public class TaxMan {
    public void FinalCalculations(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you calculating [S]ingle, Married Filing Jointly or a [W]idower, [M]arried Filing Separately, or [H]ead of Household?\nEnter S/W/M/H. ");
        String cType = sc.nextLine();
        System.out.println("What is your taxable income?");
        String incomeAmt = sc.nextLine();
        incomeAmt = incomeAmt.replaceAll(",","");
        //System.out.println(incomeAmt);
        double incomeInt = Integer.parseInt(incomeAmt);
        double finalTaxAmount = 0;

        if (incomeInt <= 0) {
            System.out.println("Income must be non-zero.");
            System.exit(1);
        }

        if (cType.equals("S")){
            //System.out.println("S input detected");
            if (incomeInt <= 9325) {
                finalTaxAmount = incomeInt*0.10;
            }
            if (incomeInt >= 9325 && incomeInt <= 37950){
                finalTaxAmount = 932.50 + ((incomeInt - 9325) * 0.15);
            }
            if (incomeInt >= 37950 && incomeInt <= 91900){
                finalTaxAmount = 5226.25 + ((incomeInt - 37950) * 0.25);
            }
            if (incomeInt >= 91900 && incomeInt <= 191650){
                finalTaxAmount = 18713.75 + ((incomeInt - 91900) * 0.28);
            }
            if (incomeInt >= 191650 && incomeInt <= 416700){
                finalTaxAmount = 46643.75 + ((incomeInt - 191650) * 0.33);
            }
            if (incomeInt >= 416700 && incomeInt <= 418400){
                finalTaxAmount = 120910.25 + ((incomeInt - 416700) * 0.35);
            }
            if (incomeInt > 418400){
                finalTaxAmount = 121505.25 + ((incomeInt - 418400) * 0.396);
            }
        }
        if (cType.equals("W")){
            //System.out.println("W input detected");
            if (incomeInt <= 18650) {
                finalTaxAmount = incomeInt*0.10;
            }
            if (incomeInt >= 18650 && incomeInt <= 75900){
                finalTaxAmount = 1865 + ((incomeInt - 18650) * 0.15);
            }
            if (incomeInt >= 75900 && incomeInt <= 153100){
                finalTaxAmount = 10452.50 + ((incomeInt - 75900) * 0.25);
            }
            if (incomeInt >= 153100 && incomeInt <= 233350){
                finalTaxAmount = 29752.50 + ((incomeInt - 153100) * 0.28);
            }
            if (incomeInt >= 233350 && incomeInt <= 416700){
                finalTaxAmount = 52222.50 + ((incomeInt - 233350) * 0.33);
            }
            if (incomeInt >= 416700 && incomeInt <= 418400){
                finalTaxAmount = 112728 + ((incomeInt - 416700) * 0.35);
            }
            if (incomeInt > 470700){
                finalTaxAmount = 131628 + ((incomeInt - 418400) * 0.396);
            }
        }
        if (cType.equals("M")){
            //System.out.println("M input detected");
            if (incomeInt <= 9325) {
                finalTaxAmount = incomeInt*0.10;
            }
            if (incomeInt >= 9325 && incomeInt <= 37950){
                finalTaxAmount = 932.50 + ((incomeInt - 9325) * 0.15);
            }
            if (incomeInt >= 37950 && incomeInt <= 76550){
                finalTaxAmount = 5226.25 + ((incomeInt - 37950) * 0.25);
            }
            if (incomeInt >= 91900 && incomeInt <= 116675){
                finalTaxAmount = 14876.25 + ((incomeInt - 76550) * 0.28);
            }
            if (incomeInt >= 116675 && incomeInt <= 208350){
                finalTaxAmount = 26111.25 + ((incomeInt - 116675) * 0.33);
            }
            if (incomeInt >= 208350 && incomeInt <= 235350){
                finalTaxAmount = 56364 + ((incomeInt - 208350) * 0.35);
            }
            if (incomeInt > 235350){
                finalTaxAmount = 65814 + ((incomeInt - 235350) * 0.396);
            }
        }
        if (cType.equals("H")){
            //System.out.println("H input detected");
            if (incomeInt <= 13350) {
                finalTaxAmount = incomeInt*0.10;
            }
            if (incomeInt >= 13350 && incomeInt <= 50800){
                finalTaxAmount = 1335 + ((incomeInt - 13350) * 0.15);
            }
            if (incomeInt >= 50800 && incomeInt <= 131200){
                finalTaxAmount = 6952.50 + ((incomeInt - 50800) * 0.25);
            }
            if (incomeInt >= 131200 && incomeInt <= 212500){
                finalTaxAmount = 27052.50 + ((incomeInt - 131200) * 0.28);
            }
            if (incomeInt >= 212510 && incomeInt <= 416700){
                finalTaxAmount = 49816.50 + ((incomeInt - 212500) * 0.33);
            }
            if (incomeInt >= 416700 && incomeInt <= 444550){
                finalTaxAmount = 117202.50 + ((incomeInt - 416700) * 0.35);
            }
            if (incomeInt > 444550){
                finalTaxAmount = 126950 + ((incomeInt - 444550) * 0.396);
            }
        }

        System.out.println("Income after tax is $" + finalTaxAmount);
    }

    public static void main(String[] args){
        TaxMan person = new TaxMan();
        person.FinalCalculations();
    }
}
