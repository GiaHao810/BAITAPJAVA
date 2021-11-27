package com.haobg2004110027.Baihoc.Outline;

import java.util.Scanner;

public class Snt {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);

//        System.out.print("Nhập N: ");
//        int n = input.nextInt();

        int n = 41;

        ktSnt(n);

        input.close();
    }

    public static void ktSnt(int n){
        
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i - 1; j++){
                if(i % j == 0){
                    break;
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
