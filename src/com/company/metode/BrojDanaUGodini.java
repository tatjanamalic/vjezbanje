package com.company.metode;

public class BrojDanaUGodini {

    public static void main(String[] args) {
    int godina=    brojdanaugodini(2000); //više puta se može pozvati metoda
        System.out.println("godina = " + godina);
        System.out.println(brojdanaugodini(2000));
    }


    public static int brojdanaugodini(int g) {
        if (g % 4 == 0 && g % 100 != 0 || g % 400 == 0) {
            return 366;
        }
        return 365;

    }
}
