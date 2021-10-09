package com.haobg2004110027.tuan4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            int soLuong;
            int key;
            
            do {
                System.out.println("Nhập số lượng sinh viên: ");
                soLuong = input.nextInt();
            } while (soLuong <= 0);
            
            showMenu();
            
            while(true){
                key = input.nextInt();
                switch (key) {
                    case 0:
                        System.out.println("Bạn đã chọn [0]");
                        input.close();
                        break;
                    case 1:
                        System.out.println("Bạn đã chọn [1]");
                        
                        break;
                    case 2:
                        System.out.println("Bạn đã chọn [2]");
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
        public void cls() {
            System.out.print("\033[H\033[2J");
            System.out.flush(); 
        }
        public void nhap(int ID, String N, int T) {
            Scanner input = new Scanner(System.in);
            ArrayList<> studenList = new ArrayList<>();
            cls();
            System.out.println("Nhập ID: ");
            studenList.add(ID);
            System.out.println("Nhập Tên: ");
            N = input.next();
            System.out.println("Nhập Tuổi: ");
            T = input.nextInt();

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