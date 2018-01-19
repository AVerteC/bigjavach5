import java.util.Scanner;

public class TaxMan {
    public void FinalCalculations(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you calculating Single, Married Filing Jointly or a Widower, Married Filing Separately, or Head of Household? Enter S/W/M/H. ");
        String cType = sc.nextLine();
    }

    public static void main(String[] args){
        TaxMan person = new TaxMan();
        person.FinalCalculations();
    }
}
