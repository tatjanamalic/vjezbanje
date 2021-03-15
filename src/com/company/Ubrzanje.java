package com.company;

import java.util.Scanner;

public class Ubrzanje {

    public static void main(String[] args) {

        double pocetna;
        double poslednja;
        double vrijeme;
        double ubrzanje;

        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite vrijednosti početne i krajnje vrijednosti brzine i vrijeme: ");
        pocetna = unos.nextDouble();
        poslednja = unos.nextDouble();
        vrijeme = unos.nextDouble();

        ubrzanje = (poslednja - pocetna) / vrijeme;

        System.out.print("Prosječno ubrzanje je: ");
        System.out.println(ubrzanje);
    }
}
