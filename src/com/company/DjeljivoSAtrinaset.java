package com.company;

import java.util.Scanner;

public class DjeljivoSAtrinaset {
    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);
        int unosODkorisnika = 100;
        int trinaest = 13;


        System.out.println("Unesite cijeli broj: ");
       // unosODkorisnika = unos.nextInt();

        for (int i =1; i<unosODkorisnika; i++) {
           if (i % trinaest==0){
               System.out.println("Ispis.."+i);
           }

        }
    }
}
