import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        double visina = 0;
        double tezina = 0;

        double BMI = 0;

        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite vrijednosti visine i težine: ");
        visina = unos.nextDouble();
        tezina = unos.nextDouble();

        BMI = tezina / (visina * visina);

        System.out.println("Vaš BMI izosi: " + BMI);

        if (BMI < 18.5){
            System.out.println("Uderweight");
        }
        if (BMI >= 18.5 && BMI <= 25.0 ){
            System.out.println("Normal");
        }
        if (BMI >= 25.0 && BMI <= 30.0){
            System.out.println("Overweight");
        }
        if (BMI > 30.0){
            System.out.println("Obese");
        }



    }
}
