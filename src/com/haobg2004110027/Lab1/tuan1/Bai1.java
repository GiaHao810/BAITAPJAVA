package com.haobg2004110027.Lab1.tuan1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        double grade;

        System.out.printf("Nhập họ và tên sinh viên: ");
        name = scanner.next();
        System.out.printf("Nhập điểm trung  bình: ");
        grade = scanner.nextDouble();

        System.out.println("\nTên sinh viên:" + name + "\nĐiểm trung bình: " + grade);

        scanner.close();
    }
}
