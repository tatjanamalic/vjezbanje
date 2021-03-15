import java.util.Scanner;

public class TAX {
    public static void main(String[] args) {

        double income = 0;
        double taxRate = 0;
        double totalTax = 0;

        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite bruto platu");
        income = unos.nextDouble();


        if (income < 8350.0 ){
            taxRate = 0.10;
            totalTax = income * taxRate;

        }
        else if (income < 33950.0) {
            taxRate = 0.15;
            double tax10 = ( income - (income - 8350.0) ) * 0.10;
            totalTax =  (income - 8350.0) * taxRate + tax10;
        }
   /*     else if (income < 82250.0){
            taxRate = 0.25;
            double tax15 = ((income - 33950.0) - 8350.0) * 0.15;
            double tax10 = ( income - (income - 8350.0) ) * 0.10;
            totalTax = (income - 33950.0) * taxRate + tax15 + tax10;
        }
        else if (income < 171550.0){
            taxRate = 0.28;
            double tax25 = ((income - 82250.0) - 33950.0) * 0.28;
            double tax15 = ((income - 33950.0) - 8350.0) * 0.15;
            double tax10 = ( income - (income - 8350.0) ) * 0.10;
            totalTax = (income - 82250.0)* taxRate + tax10 + tax15 + tax25;
        }
*/


        System.out.println(totalTax);


    }
}
