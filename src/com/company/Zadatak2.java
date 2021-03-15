package com.company;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        // definisati varijable
        // korisnik unosi podatke
        // formula
        // rezultat

        Scanner unos = new Scanner(System.in);

        double stopa;
        double metar;

        System.out.println(" Unesite vrijednost stope: ");
        stopa = unos.nextDouble();

       metar = stopa * 0.305;

        System.out.println("Vrijednost stope u metrima iznosi: ");

        System.out.println(metar);
    }
}
