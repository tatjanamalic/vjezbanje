package com.company;

public class ┼ákolarina {

    public static void main(String[] args) {

        double skolarina = 10000;
        final double poskupljenje = 1.05;
        double cijenaposlednjecetirigodine = 0;

        for (int godina = 1; godina <= 14; godina++){

            skolarina *= poskupljenje;

            if (godina == 10){
                System.out.println("┼ákolarina poslije 10 godine " + godina);
            }

            else{

            }
        }
    }
}
