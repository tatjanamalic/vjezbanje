package com.company;

import java.util.Scanner;

public class Milijarda {

    public static void main(String[] args) {

        // Korisnik unosi minute
        // formula: minute/60 da dobijemo sate
        //          sate / 24 da dobijemo dane
        //          dane / 365 da dobijemo broj godina
        // računar ispisuje minute u godinama i preostalim danima

        Scanner unos = new Scanner(System.in);

        long minute;
        long sat;
        long dan;
        long godina;
        long ostatak;


        System.out.println("Unesite broj minuta: ");
        minute = unos.nextLong();

        sat = minute / 60;
        dan = sat / 24;
        godina = (dan / 365);
        ostatak = dan % 365;

        System.out.print(minute + " minuta iznosi " + godina + " godina ");
        System.out.println(" i " +ostatak + " dana ");

    }
}
