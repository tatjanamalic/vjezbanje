package com.company.metode;

public class Geometrija {

    public static void main(String[] args) {
        System.out.println(area(5,6.5));
    }

    public static double area (int n, double side){
        double  djeljenik = n* Math.pow(side,2);
        double djelilac = 4* Math.tan(Math.PI/n);
        double area= djeljenik / djelilac;

        return area;
    }
}
