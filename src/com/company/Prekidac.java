package com.company;

import java.util.Scanner;

public class Prekidac {

    public static void main(String[] args) {

        // Od korisnika da unese neki broj između 1 i 7
        //paralelno tome, ispišite dan u sedmici

        Scanner unos = new Scanner(System.in);

        int dan = 5;

        switch (dan) {

            case 1: {

                System.out.println("ponedeljak");
                break;
            }

            case 2: {
                System.out.println("utorak");
                break;
            }

            case 3: {
                System.out.println("srijeda");
                break;
            }



        }
    }
}
