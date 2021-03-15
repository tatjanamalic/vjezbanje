package com.company;



public class Bacanjekovanica {

    public static void main(String[] args) {



        int pismo = 0;
        int glava = 0;
        double broj = 0;

        for (int brojac = 1; brojac < 1000000000; brojac++) {

            broj = Math.random();
            if(broj < 0.5){
                pismo++;
            }
            else {
                glava++;
            }


        }

        System.out.println("Pismo: " + pismo);
        System.out.println("Glava: " + glava);
    }
}
