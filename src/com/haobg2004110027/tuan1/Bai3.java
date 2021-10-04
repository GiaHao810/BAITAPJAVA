package com.haobg2004110027.tuan1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Double canh, thetich;

        Scanner input = new Scanner(System.in);

        System.out.print("Nhập cạnh của một khối lập phương: ");
        canh = input.nextDouble();
        
        thetich = canh * canh * canh;
        System.out.println("Thể tích cạnh lập phương: " + thetich);

        input.close();
    }
}
