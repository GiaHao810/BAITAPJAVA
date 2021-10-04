package com.haobg2004110027.tuan2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Double soDien;
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số điện sử dụng: ");
        soDien = input.nextDouble();
        
        if(soDien < 50){
            soDien = soDien * 1000;
        } else {
            soDien = 50 * 1000 + (soDien - 50) * 1200;
        }

        input.close();
    }
}
