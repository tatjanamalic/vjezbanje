package com.company;

import java.util.Scanner;

public class Vježbanje2 {

    public static void main(String[] args) {

        // Identifikovati varijable
        // Tražiti od korisnika da unese vrijednost varijable
        // Formula
        // Rezultat

        Scanner unos = new Scanner(System.in);

        double celsius;
        double fahrenheit;



        System.out.println(" Unesite vrijednost Celzijusa");
        celsius = unos.nextDouble();

        fahrenheit = (9.0 / 5) * celsius +32;

        System.out.println(fahrenheit);



    }
}
