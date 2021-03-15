package com.company;

public class Findthesmallest {

    public static void main(String[] args) {

        int broj = 0;
        int kvadrat = 0;

        while ( kvadrat < 12000){
             broj++;
             kvadrat = broj * broj;

        }
        System.out.println(broj);
    }
}
