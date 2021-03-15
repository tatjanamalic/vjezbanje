package com.company.niz;

import java.util.Scanner;

public class niz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int duzinaNiza = scanner.nextInt();

        int [] nizslucajnihbrojeva = new int[duzinaNiza];


        for (int i = 0; i < nizslucajnihbrojeva.length; i++){
            nizslucajnihbrojeva[i] = (int) (Math.random()*10);
            System.out.println(nizslucajnihbrojeva[i]);

        }
    }
}
