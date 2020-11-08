package com.company;

public class MathUtil {

    public static int x;
    public static int facktorial;
    public static int geometry;
    public static int arifmethik;

    public static void setFacktorial(){
        x = 1;
        facktorial = 5;
        facktorial = x * (x+x) * (x+x+x) * (x+x+x+x) * (x+x+x+x+x);
        System.out.println(facktorial);

    }

    public static void setGeometry(){
        x = 1;
        geometry = 5;
        geometry = x * geometry * geometry * geometry;
        System.out.println(geometry);

    }

    public static void setArifmethik(){
        x = 1;
        arifmethik = 5;
        arifmethik = x + arifmethik + arifmethik + arifmethik;
        System.out.println(arifmethik);

    }
}
