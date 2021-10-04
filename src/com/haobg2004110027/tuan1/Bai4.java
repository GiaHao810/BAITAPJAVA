package com.haobg2004110027.tuan1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Double a, b, c, delta;
        
        Scanner input = new Scanner(System.in);

        System.out.println("A^2 + B + C");
        System.out.print("A = ");
        a = input.nextDouble();
        System.out.print("B = ");
        b = input.nextDouble();
        System.out.print("C = ");
        c = input.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta = " + delta);
        System.out.println("Căn Delta = " + Math.sqrt(delta));

        input.close();
    }
}
