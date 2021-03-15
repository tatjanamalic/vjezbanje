package com.company;

import java.util.Scanner;

public class Svašta {

    public static void main(String[] args) {

        int broj1 = (int) (Math.random() * 10);
        int broj2 = (int) (Math.random() * 10);

        Scanner unos = new Scanner(System.in);


        System.out.println("Koliko je " + broj1 + " + " + broj2 + "?: ");
        int odgovor = unos.nextInt();

        while (odgovor != broj1 + broj2){
            System.out.println("Unijeli ste pogrešan odgovor, pokušajte ponovo.");

            System.out.println("Koliko je " + broj1 + " + " + broj2 + "?: ");
            odgovor = unos.nextInt();
        }


        System.out.println("Čestitamo, unijeli ste tačan odgovor!");
    }
}
