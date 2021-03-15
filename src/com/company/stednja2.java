package com.company;

import java.util.Scanner;

public class stednja2 {

    public static void main(String[] args) {

        Scanner unos = new Scanner(System.in);

        double glavnica;
        double kamatna_stopa;
        double iznos6;

        System.out.println("Unesite iznos mjesečne glavnice: ");
        glavnica = unos.nextDouble();

        kamatna_stopa = 0.05 / 12;

        iznos6 = (glavnica * kamatna_stopa + glavnica) * (6 + 6 * kamatna_stopa);
        System.out.println(iznos6);
    }
}
