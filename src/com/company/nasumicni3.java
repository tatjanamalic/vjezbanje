package com.company;

import java.util.Scanner;

public class nasumicni3 {

    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);

        int broj1 = (int) (Math.random() * 10);

        int broj2 = (int) (Math.random() * 10);

        int rez;


        if (broj1 > broj2) {
            rez = broj1 - broj2;
            System.out.println("koliko je " + broj1 + "-" + broj2);
        }

        else{
            System.out.println("koliko je " + broj2 + "-" + broj1);
            rez = broj2 - broj1;
            System.out.println(rez);

        }

        int unosOdKorisnika;

        do {
             unosOdKorisnika = unos.nextInt() ;

        }
        while (unosOdKorisnika !=rez);

    }
}
