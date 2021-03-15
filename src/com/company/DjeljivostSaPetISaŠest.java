package com.company;

public class DjeljivostSaPetISaŠest {

    public static void main(String[] args) {

        int desetaLinija = 0;


        for (int i = 100; i < 1000; i++) {


            if (i % 5 == 0 ^ i % 6 == 0) {
                System.out.print(" " + i);
                desetaLinija++;

                if (desetaLinija == 10) {
                    System.out.println();
                    desetaLinija = 0;
                }
            }

        }


    }
}
