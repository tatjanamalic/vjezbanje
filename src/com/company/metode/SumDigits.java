package com.company.metode;

public class SumDigits {
    public static void main(String[] args) {

        System.out.println(count(234));
    }

    public static long count (long number){
        long suma = 0;
        while (number > 0){
            long  poslednjacifra = number % 10;
             suma += poslednjacifra;
             number = number / 10;
        }
        return suma;
    }

}
