package com.company.metode;

import java.util.Scanner;

public class Ocjene {

    public static void ocjene(double bodovi) {

        if (bodovi >= 90) {
            System.out.println("Ocjena je 10. ");

        }

        if (bodovi < 90 && bodovi >= 80) {

            System.out.println("Ocjena je 9. ");
        }

        if (bodovi < 80 && bodovi >= 70) {

            System.out.println("Ocjena je 8. ");
        }

        if (bodovi < 70 && bodovi >= 60) {

            System.out.println("Ocjena je 7. ");
        }

        if (bodovi < 60 && bodovi >= 50) {

            System.out.println("Ocjena je 6. ");

        }

        if (bodovi < 50) {

            System.out.println("Niste položili. ");
        }
    }


    public static void main(String[] args) {

        ocjene(234);
        ocjene(5);
        ocjene(86);
        ocjene(56);
    }
}

