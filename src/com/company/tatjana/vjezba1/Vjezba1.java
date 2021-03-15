package com.company.tatjana.vjezba1;

import java.util.Scanner;

public class Vjezba1 {

    public Vjezba1 (){
    }

    public void Zadatak1 (){

        System.out.println("Zadatak 1: ");

        double Celzijus;
        double Farenhajt;

        Scanner unos = new Scanner(System.in);

        System.out.print(" Unesite vrijednost celzijusa: ");
        Celzijus = unos.nextDouble();

        Farenhajt =  (9.0 / 5) * Celzijus + 32;
        System.out.print(Celzijus);
        System.out.print(" Celzijusa je ");
        System.out.print(Farenhajt);
        System.out.print(" Farenhajta. ");

    }

    public void Zadatak2(){

        Scanner unos = new Scanner(System.in);

        System.out.println(" Zadatak 2: ");

        double radius;
        double length;
        double area;
        double volume;

        System.out.print( " Unesite vrijednosti radijusa i dužine cilindra: ");
        radius = unos.nextDouble();
        length = unos.nextDouble();

        area = radius * radius * Math.PI;
        System.out.print(" Površina iznosi: ");
        System.out.println(area);

        volume = area * length;
        System.out.print(" Zapremina cilindra iznosi: ");
        System.out.print(volume);

    }

    public void Zadatak3(){

        Scanner unos = new Scanner(System.in);

        System.out.println(" Zadatak 3: ");

        double feet;
        double metar;


        System.out.print(" Unesite vrijednost stope: ");

       feet = unos.nextDouble();

        metar = 0.305 * feet;


        System.out.print(feet);
        System.out.print (" stopa iznosi ");
        System.out.print(metar);
        System.out.print(" metara. ");


    }

    public void Zadatak4(){

        Scanner unos = new Scanner(System.in);

        System.out.println(" Zadatak 4: ");

        double pound;
        double kilogram;

        System.out.print(" Unesite vrijednost: ");
        pound = unos.nextDouble();

        kilogram =  0.454 * pound;

        System.out.print(pound);
        System.out.print(" pounds iznosi ");

        System.out.print(kilogram);
        System.out.print(" kilograma. ");
    }

    public void Zadatak5(){


        Scanner unos = new Scanner(System.in);

        System.out.println(" Zadatak 5: ");

        double subtotal;
        double baksisstopa;
        double baksis;
        double ukupno;

        System.out.println(" Unesite iznos i stopu napojnice: ");
        subtotal = unos.nextDouble();
        baksisstopa = unos.nextDouble();

        baksis = subtotal * baksisstopa / 100;

        System.out.print("Napojnica iznosi $");
        System.out.print(baksis);

        ukupno = baksis + subtotal;

        System.out.print(", a ukupan iznos je $");
        System.out.print(ukupno);
    }


}
