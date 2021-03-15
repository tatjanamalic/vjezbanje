package com.company;

import java.util.Random;

public class IF_ELSE {

    public static void main(String[] args) {

        Random rand = new Random();

        int A;
        int B;

        A = rand.nextInt(10000);

        B = rand.nextInt(10000);

        if (B > A) {
            System.out.println(A);
            System.out.println(B);
        }
        else{

        }

    }
}
