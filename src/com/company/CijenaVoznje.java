package com.company;

import java.util.Scanner;

public class CijenaVoznje {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        double distanca;
        double potrosnja;
        double cijena;
        double voznja;

        System.out.println("Unesite vrijednosti distance, potrošnju goriva u litrama i cijenu goriva po l: ");
        distanca = unos.nextDouble();
        potrosnja = unos.nextDouble();
        cijena = unos.nextDouble();

        voznja = distanca * cijena * potrosnja / 100;

        System.out.println("Cijena vožnje iznosi: ");
        System.out.println(voznja);


    }
}
