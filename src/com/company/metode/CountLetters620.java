package com.company.metode;

public class CountLetters620 {
    public static void main(String[] args) {

        String nekaRjec = "Java";
 //      System.out.println(nekaRjec.length());

        System.out.println(countLetters(nekaRjec,'a'));

    }

    public static int countLetters(String rjec,char karakter) {
        int brojac = 0;
        for (int i = 0; i < rjec.length(); i++) {
            char c = rjec.charAt(i);
            System.out.println(c);

            if (c==karakter)
                brojac++;
        }
        return brojac;
    }


}
