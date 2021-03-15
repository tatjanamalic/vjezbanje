package com.company.metode;

public class SabiranjeDvacijelaIDvadecimalna {


    public static void main(String[] args) {

        sabiranje(1, 2);

        sabiranje(1.5, 5.5);

        System.out.println(sabiranje(1.5,5.5));

    }

    public static double sabiranje(double prvi, double drugi) {
        return prvi + drugi;
    }

    public static int sabiranje(int prvi, int drugi) {
        return prvi + drugi;
    }
}
