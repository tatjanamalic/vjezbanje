package com.company.NIZOVI;

import java.util.Scanner;

public class VelicinaNiza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duzina = scanner.nextInt();
        int[] vrijednostNiza = new int[duzina];

        int pozicijaUNizuMaxVrj = 0;

        for (int i = 0; i < vrijednostNiza.length; i++) {
            System.out.println("Unesite na indexu  = " + i + " vrjednoszt");
            vrijednostNiza[i] = scanner.nextInt();
        }
        int max = vrijednostNiza[0];

//1 ,7,5
        for (int i = 0; i < vrijednostNiza.length; i++) {
            if (vrijednostNiza[i] > max) {
                max = vrijednostNiza[i];
                pozicijaUNizuMaxVrj = i;
            }
        }

        System.out.println(max);
        System.out.println(pozicijaUNizuMaxVrj);
    }
}

