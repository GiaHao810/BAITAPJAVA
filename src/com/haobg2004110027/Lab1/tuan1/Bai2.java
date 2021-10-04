package com.haobg2004110027.Lab1.tuan1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Double longs, wide, chuvi, dientich, canhnhonhat;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhập chiều dài: ");
        longs = input.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        wide = input.nextDouble();

        chuvi = (longs + wide) * 2;
        System.out.println("Chu vi: " + chuvi);

        dientich = longs * wide;
        System.out.println("Diện tích: " + dientich);

        canhnhonhat = Math.min(longs, wide);
        System.out.println("Cạnh nhỏ nhất: " + canhnhonhat);

        input.close();
    }
}
