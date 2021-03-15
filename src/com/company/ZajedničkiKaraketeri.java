package com.company;

public class ZajedničkiKaraketeri {

    public static void main(String[] args) {

        String firstString =  "Welcome to C++";
        String secondString = "Welcome to programming";
        String commonPrefix = "";
        int duzinaManjegStringa = Math.min (firstString.length(), secondString.length());


        for (int i = 0; i < duzinaManjegStringa; i++){

            if (firstString.charAt(i) == secondString.charAt(i)){
                commonPrefix += firstString.charAt(i);

            }
            else {

                break;

            }
        }
        System.out.println("commonPrefix " + commonPrefix);
    }
}
