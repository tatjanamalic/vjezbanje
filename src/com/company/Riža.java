package com.company;

import java.util.Scanner;

public class Riža {

    public static void main(String[] args) {


        int tezina1 = 50;
        double cijena1 = 24.59;

        int tezina2 = 25;
        double cijena2 = 11.99;

        double cijenapokg1;
        double cijenapokg2;

        cijenapokg1 = cijena1 / tezina1;

        cijenapokg2 = cijena2 / tezina2;

        System.out.println("Cijena prva po kg:");
        System.out.println(cijenapokg1);

        System.out.println("Cijena druga po kg");
        System.out.println(cijenapokg2);


        if(cijenapokg1 < cijenapokg2){

            System.out.println("Prvi proizvod ima bolju cijenu. ");
        }

        else{

            System.out.println("Drugi proizvod ima bolju cijenu. ");
        }
    }
}
