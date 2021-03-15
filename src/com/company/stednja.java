package com.company;

import java.util.Scanner;

public class stednja {

    public static void main(String[] args) {

        // varijable ks, iznos;
        // korisnik unosi podatak o mjesečnoj štednji
        // kamatna stopa
        // formula za vrijendost nakon 6 mjeseci =
        // ((((iznos * ks) / 100 ) / 12) + iznos) * 6;
        // rezultat

        Scanner unos = new Scanner(System.in);

        double kamatnastopa;
        double mjesecni_iznos;
        double prvi_mjesec;
        double drugi_mjesec;
        double treci_mjesec;
        double cetvrti_mjesec;
        double peti_mjesec;
        double sesti_mjesec;

        System.out.println("Unesite iznos mjesečne štednje: ");
        mjesecni_iznos = unos.nextDouble();

        kamatnastopa = 0.05 / 12;

        Math.exp(6);

        prvi_mjesec = (mjesecni_iznos * kamatnastopa + mjesecni_iznos);
        //System.out.println(prvi_mjesec);

      drugi_mjesec = (prvi_mjesec + mjesecni_iznos) * (1 + kamatnastopa);
      //System.out.println(drugi_mjesec);

      treci_mjesec = (drugi_mjesec + mjesecni_iznos) * (1 + kamatnastopa);
      //  System.out.println(treci_mjesec);

        cetvrti_mjesec = (treci_mjesec + mjesecni_iznos) * ( 1 + kamatnastopa);
     //   System.out.println(cetvrti_mjesec);

        peti_mjesec = (cetvrti_mjesec + mjesecni_iznos) * ( 1 + kamatnastopa);
      //  System.out.println(peti_mjesec);


        sesti_mjesec = (peti_mjesec + mjesecni_iznos) * (1 + kamatnastopa);
        System.out.println(sesti_mjesec);



    }
}
