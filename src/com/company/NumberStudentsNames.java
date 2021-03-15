package com.company;

import java.util.Scanner;

public class NumberStudentsNames {

    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite broj studenata: ");
        int brStudenata = unos.nextInt();

        String prviStudent = "";
        String drugiStudent = "";

        int brBodovaPrvi = 0;
        int brBodovaDrugi = 0;

        for (int i = 0; i < brStudenata; i++){

            System.out.println("Uneiste ime studenta: ");
            String uneseniStudent = unos.next();
            System.out.println("Unesite broj bodova: ");
            int brUnesenihBodova = unos.nextInt();

            if (brUnesenihBodova > brBodovaPrvi) {
                drugiStudent = prviStudent;
                prviStudent = uneseniStudent;
                brBodovaDrugi = brBodovaPrvi;
                brBodovaPrvi = brUnesenihBodova;
            }
            else if(brUnesenihBodova > brBodovaDrugi){
                brBodovaDrugi = brUnesenihBodova;
                drugiStudent = uneseniStudent;
            }



        }

        System.out.println("Prvi student " + prviStudent);
        System.out.println("Broj bodova: " + brBodovaPrvi);
        System.out.println("Drugi student " + drugiStudent);
        System.out.println("Broj bodova: " + brBodovaDrugi);
    }
}
