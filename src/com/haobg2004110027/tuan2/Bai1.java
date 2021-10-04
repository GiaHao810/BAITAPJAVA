package com.haobg2004110027.tuan2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Double a, b, x;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập a: ");
        a = input.nextDouble();
        System.out.print("Nhập b: ");
        b = input.nextDouble();

        if(a == 0){
            if(b == 0){
                System.out.println("Phương trình vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        } else {
            x = -b / a;
            System.out.println("Nghiệm x = " + x);
        }

        input.close();
    }
}
