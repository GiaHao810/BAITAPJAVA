package com.haobg2004110027.tuan4.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int n;
        Double number, sum = 0.0;

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> doubles = new ArrayList<>();

        System.out.print("Nhập số lượng số thực (n-1): ");
        n = scanner.nextInt();

        for(int a = 1; a < n; a++){
            System.out.print("Số thực thứ " + a + ": ");
            number = scanner.nextDouble();
            doubles.add(number);
        }
        for(double element  : doubles){
            sum += element;
        }
        System.out.println("Danh sách các số thực vừa nhập: " + doubles);
        System.out.println("Tổng của các số thực vừa nhập: " + sum);
        scanner.close();
    }
}
