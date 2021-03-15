package com.company;

import java.util.Scanner;

public class Funte {

    public static void main(String[] args) {

       Scanner unos = new Scanner(System.in);

        double BAM;
        double funta;

       System.out.println("Unesite iznos funte: ");
        funta = unos.nextDouble();

        if (funta > 0){

            BAM = funta * 2.20;

        System.out.println("Vrijednost funte u KM iznosi: ");
        System.out.println(BAM);




            System.out.println("Pozitivno ");

        }

        else {

            System.out.println("Negativno ");
        }

    }



}
