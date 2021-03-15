package com.company.metode;

public class IndividualniKarakteri {

    public static void main(String[] args) {

        ispisiKaraktere('a', 'y', 3);
    }

    public static void ispisiKaraktere(char pocetniKarakter, char zavrsniKarakter, int brojPOliniji) {

        int brojac =0;

        for (char i = pocetniKarakter; i <= zavrsniKarakter; i++) {
            System.out.print(i + " ");

            brojac++;


           if (brojac == brojPOliniji){
               System.out.println();
               brojac = 0;
           }
        }


    }
}
