package com.haobg2004110027.kiemtragiuaky;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleTestDriveAL {
    static ArrayList<Apple> khoTao = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        showMenu();
    }

    public static void AddApple() {
        System.out.print("Bạn muốn nhập bao nhiêu loại Táo? ");
        int soLuong = input.nextInt();

        for(int i = 1; i <= soLuong; i++){
            System.out.printf("Nhập thông tin táo thứ %d\n",i);

            System.out.print("ID: ");
            int id = input.nextInt();

            System.out.print("Weight: ");
            Double weight = input.nextDouble();

            System.out.print("Color: ");
            String color = input.next();

            khoTao.add(new Apple(id, weight, color));
        }
    }

    public static void print() {
        for(Apple apple : khoTao){
            apple.inThongtin();
        }
    }

    public static void FindApple() {
        System.out.print("Tìm táo theo Màu: ");
        String find = input.next();

        for(Apple a : khoTao){
            if((a.color).equals(find)){
                a.inThongtin();
                break;
            } else {
                System.out.println("Không tìm thấy Táo hoặc không tồn tại!");
            }
        }
    }

    public static void showMenu() {
        boolean flag = true;

        while (flag) {
            System.out.println("========================================");
            System.out.println("[1] Nhập Táo");
            System.out.println("[2] In Táo");
            System.out.println("[3] Tìm Táo");
            System.out.println("[0] Thoát chương trình.");
            System.out.println("========================================");
            System.out.print("Nhập lựa chọn: ");
            int key = input.nextInt();

            switch (key) {
                case 0:
                    System.out.println("Đã chọn [0] - Chương trình đang đóng.");
                    flag = false;
                    break;
                case 1:
                    System.out.println("Đã chọn [1].");
                    AddApple();
                    break;
                case 2:
                    System.out.println("Đã chọn [2].");
                    print();
                    break;
                case 3:
                    System.out.println("Đã chọn [3].");
                    FindApple();
                    break;
                default:
                    break;
            }
        }
    }
}
