import java.util.Scanner;

public class ČetriOsamnaestKnjiga {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite dva karaktera: ");

        String unos = "M1";

        String odabir = "";

        if(unos.startsWith("M")){

            odabir += "Mathematica";
        }

        if(unos.startsWith("C")){
            odabir += "Computer";

        }

        if(unos.startsWith("I")){

            odabir += "Informatica";
        }

        if (unos.endsWith("1")){
            odabir += "Freshman";
        }

        if (unos.endsWith("2")){
            odabir += "Junior";
        }

        if (unos.endsWith("3")){
            odabir += "Senior";
        }
        if (unos.endsWith("4")){
            odabir += "Sophomore";
        }

    }
}
