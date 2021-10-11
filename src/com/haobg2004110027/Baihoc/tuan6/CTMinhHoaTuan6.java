package com.haobg2004110027.Baihoc.tuan6;

public class CTMinhHoaTuan6 {
    public static void main(String[] args) {
        Integer a = 5, b = 6;

        swap(a,b);

        System.out.println("A = " + a + " B = " + b);
    }
    public static void swap(Integer a, Integer b) {
        Integer temp;
        temp = a;
        a = b;
        b = temp;

    }
}
