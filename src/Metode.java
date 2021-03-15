public class Metode {


    public static int sumaBrojeva (int pocetnibr, int zavrsnibr){

        int suma = 0;
        for (int i = pocetnibr; i < zavrsnibr; i++){
            suma += i;
        }
        return suma;
    }


    public static void main(String[] args) {

        int v =45;
        System.out.println("sumaBrojeva () = " + sumaBrojeva(2 ,v));

        int suma = 0;
        for (int i = 0; i <10; i++){
            suma += i;
        }
    }
}
