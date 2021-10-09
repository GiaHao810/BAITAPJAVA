package com.haobg2004110027.tuan4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            ArrayList<String> studenList = new ArrayList<>();

            String name = "", age = "", id = "";
            
            boolean flag = true;
            int soLuong;
            int key;
            
            do {
                System.out.print("Nhập số lượng sinh viên: ");
                soLuong = input.nextInt();
            } while (soLuong <= 0);

            while(flag){
                showMenu();
                System.out.print("Mời nhập lựa chọn: ");
                key = input.nextInt();
                switch (key) {
                    case 0:
                        System.out.println("Bạn đã chọn [0] - Chương trình đang đóng.");
                        input.close();
                        flag = false;
                        break;
                    case 1:
                        System.out.println("Bạn đã chọn [1]");
                        
                        cls();

                        for(int i = 1; i < soLuong; i++){
                            System.out.println("\nNhập thông tin sinh viên thứ " + i + ": ");
                            System.out.print("Tên: ");
                            name = input.next();
                            studenList.add(name);
                            System.out.print("ID: ");
                            id = input.next();
                            studenList.add(id);
                            System.out.print("Tuổi: ");
                            age = input.next();
                            studenList.add(age);
                        }

                        cls();
                        break;
                    case 2:
                        System.out.println("Bạn đã chọn [2]");
                        System.out.println(studenList);
                        break;
                    case 3:
                        System.out.println("Bạn đã chọn [3]");
                        break;
                    case 4:
                        System.out.println("Bạn đã chọn [4]");
                        break;
                    case 5:
                        System.out.println("Bạn đã chọn [5]");
                        break;
                    default:
                        System.out.println("Không có lựa chọn trên!");
                        break;
                }
            }
        }

        public static void showMenu() {
            System.out.println("=====================================");
            System.out.println("1. Nhập danh sách họ và tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("0. Thoát chương trình");
            System.out.println("=====================================");
        }
        public static void cls() {
            System.out.print("\033[H\033[2J");
            System.out.flush(); 
        }
        public static void nhap(String id, String name, String age) {
            Scanner input = new Scanner(System.in);
            

            input.close();
        }
        public void xuat() {
            
        }
        public void xuatRand() {
            
        }
        public void sapxep() {
            
        }
        public void xoa() {
            
        }
    }