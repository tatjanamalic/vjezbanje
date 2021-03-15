package com.company;

import java.util.Scanner;

public class PetljaZadatak2 {

    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);

        int slucajniBroj;
        int korisnikovPokusaj;

        slucajniBroj = (int) (Math.random() * 11);
        System.out.println(slucajniBroj);

        System.out.println("Pogodite koji je broj generisan: ");
        korisnikovPokusaj = unos.nextInt();

        while (korisnikovPokusaj != slucajniBroj ){

            if (korisnikovPokusaj > slucajniBroj){
                System.out.println("Unesite manji broj: ");
                korisnikovPokusaj = unos.nextInt();

            }

            else {
                System.out.println("Unesite veći broj: 8");
                korisnikovPokusaj = unos.nextInt();
                ;
            }

        }

        System.out.println("Kraj! ");
    }
}
