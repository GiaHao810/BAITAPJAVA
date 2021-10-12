package com.haobg2004110027.tuan4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai3 {
    static ArrayList<SanPham> dsSP = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        boolean flag = true;

        while (flag) {
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
                    flag = false;
                    break;
                case 1:
                    System.out.println("Đã chọn [1].");
                    inputInfo();
                    break;
                case 2:
                    System.out.println("Đã chọn [2].");
                    sapxep();
                    printInfo();
                    break;
                case 3:
                    System.out.println("Đã chọn [3].");
                    break;
                case 4:
                    System.out.println("Đã chọn [4].");
                    break;
                default:
                    break;
            }
        }
    }

    public static void inputInfo() {
        System.out.print("Số lượng sản phẩm cần nhập: ");
        int a = input.nextInt();

        for(int i = 1; i <= a; i++){
            System.out.printf("Nhập tên sản phẩm thứ %d : ", i);
            String name = input.next();
            System.out.print("Nhập đơn giá: ");
            Double price = input.nextDouble();
            dsSP.add(new SanPham(name, price));
        }
    }

    public static void printInfo(){
        for(SanPham sanPham : dsSP){
            sanPham.inThongtin();
        }
    }

    public static void sapxep() {
        Comparator<SanPham> comp = new Comparator<SanPham>(){

            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.donGia, o2.donGia);
            }
        };
        Collections.sort(dsSP, comp);
        Collections.reverse(dsSP);
    }

    public static SanPham find(ArrayList<SanPham> dsSP) {
        
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String a = input.next();

        for(SanPham sanPham : dsSP){
            if(sanPham.tenSP.equals(a)){
                SanPham result = sanPham;
            }
        }
        return null;
    }

    public static void erase(SanPham result, ArrayList<SanPham> dsSP) {
        
        SanPham sanPham = find(dsSP);

        dsSP.remove(sanPham);

    }
}