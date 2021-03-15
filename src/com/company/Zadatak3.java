package com.company;

import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {

        //

        Scanner unos = new Scanner(System.in);

      //  int uneseni;
        int prvi;
        int drugi;
        int treci;
        int zbir;

        System.out.println("Unesite broj: ");
        final int uneseni = unos.nextInt();

       prvi = uneseni / 100;
        System.out.println(" prvi broj =" + prvi);

       drugi = uneseni / 10 % 10 ;
        System.out.println("drugi = " + drugi);

       treci = uneseni % 10;
        System.out.println("treci broj = " + treci);




        zbir = prvi + drugi + treci;

        System.out.println(" Zbir: ");
        System.out.println(zbir);




    }
}
