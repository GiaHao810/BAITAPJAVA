package com.haobg2004110027.Baihoc.Outline;

import java.util.Scanner;

public class Giaithua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập N: ");
        int n = input.nextInt();

        gt(n);

        input.close();
    }

    public static void gt(int abc){
        int gt = 1;

        for(int i = 1; i <= abc; i++){
            gt *= i;
        }

        System.out.println("Giai thừa của " + abc + " = " + gt);
    }
}
