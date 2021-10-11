package com.haobg2004110027.tuan4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai3 {
    static ArrayList<String> dsSP = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        showMenu();
    }
    public static void showMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("[1] Nhập danh sách sản phẩm");
        System.out.println("[2] Sắp xếp và xuất giá giảm dần");
        System.out.println("[3] Xóa sản phẩm theo tên");
        System.out.println("[4] Xuất giá trị trung bình của sản phẩm");
        System.out.println("[0] Thoát chương trình.");
        System.out.println("========================================");
        System.out.print("Nhập lựa chọn: ");
        int key = input.nextInt();

        switch (key) {
            case 0:
                System.out.println("Đã chọn [0] - Chương trình đang đóng.");
                input.close();
                break;
            case 1:
                System.out.println("Đã chọn [1].");
                inputInfo();
                break;
        
            default:
                break;
        }
    }
    public static void inputInfo() {

        for(String a : dsSP){
            System.out.print("Nhập tên: ");
            dsSP.add(input.next());
            System.out.print("Nhập giá:");
            dsSP.add(input.next());
        }
    }
    public static void 
}
