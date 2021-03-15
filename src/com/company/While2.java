package com.company;

import java.util.Scanner;

public class While2 {

    public static void main(String[] args) {

        //Korisnik mora unijeti cijele brojeve
        //Ako unese nulu, treba nam zbir i prosjek svih unesenih brojeva

        Scanner unos = new Scanner(System.in);

        int broj = -1;
        int zbir = 0;
        double prosjek = 0;
        double brojac = -1;

        System.out.println("Unesite cijele brojeve");
        broj = unos.nextInt();

        while (broj != 0){

            broj = unos.nextInt();

            zbir = broj + zbir;

            brojac = brojac +1;
            //brojac++;


        }
        System.out.println("Zbir unesenih brojeva " + zbir);

        prosjek = zbir / brojac;
        System.out.print("Prosjek je ");
        System.out.println(prosjek);

    }
}
