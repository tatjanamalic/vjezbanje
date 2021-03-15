package com.company;

public class Školarina7posto {

    public static void main(String[] args) {

        int skolarina = 5000;
        final double poskupljenje = 1.07;
        double dupla = skolarina * 2;
         int godina = 0;

        while (skolarina <= dupla) {

            skolarina *= poskupljenje;

            godina++;

        }

        System.out.println(godina);
    }
}
