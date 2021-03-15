package com.company;

import java.util.Scanner;

public class nasumicni {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        int broj1 =(int) Math.random()*10;
        int broj2 =(int) Math.random()*10;



        System.out.println("Unesite rezultat dva broja: ");
        System.out.println(broj1+broj2);


        // uzmes odgovor od korisnika

          int rez = broj1+broj2;

        if (rez == broj1 + broj2){

            System.out.println("Odgovor koji ste unijeli je tačan. Svaka čast! ");

        }
        else {
            System.out.println("Odgovor koji ste unijeli nije tačan. Tačan odgovor je: " );
        }
    }
}
