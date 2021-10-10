package com.haobg2004110027.tuan4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {
        static  ArrayList<String> studentList = new ArrayList<String>();

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            boolean flag = true;
            int key;

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
                        nhap();

                        do{
                            System.out.print("Ấn Y để quay lại MENU: ");
                        } while (input.next().equals("N"));
                        
                        break;
                    case 2:
                        System.out.println("Bạn đã chọn [2]");
                        xuat();
                        loop();

                        break;
                    case 3:
                        System.out.println("Bạn đã chọn [3]");
                        xuatRand();
                        loop();

                        break;
                    case 4:
                        System.out.println("Bạn đã chọn [4]");
                        sapxep();
                        loop();

                        break;
                    case 5:
                        System.out.println("Bạn đã chọn [5]");
                        xoa();
                        loop();

                        break;
                    default:
                        System.out.println("Không có lựa chọn trên!");
                        break;
                }
            }
        }

        public static void showMenu() {
            System.out.println("=====================================");
            System.out.println("[1] Nhập danh sách họ và tên");
            System.out.println("[2] Xuất danh sách vừa nhập");
            System.out.println("[3] Xuất danh sách ngẫu nhiên");
            System.out.println("[4] Sắp xếp giảm dần và xuất danh sách");
            System.out.println("[5] Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("[0] Thoát chương trình");
            System.out.println("=====================================");
        }

        public static void loop() {
            Scanner input = new Scanner(System.in);

            do{
                System.out.print("Ấn Y để quay lại MENU: ");
            } while (input.next().equals("N"));

            input.close();
        }
        
        public static void nhap(){
            Scanner input = new Scanner(System.in);

                while (true) {
                    System.out.print("Nhập họ và tên: ");
                    String name = input.nextLine();
                    studentList.add(name);

                    System.out.print("Nhập thêm (Y/N): ");
                    if(input.nextLine().equals("N")){
                    break;
                }
            }
            input.close();
        }

        public static void xuat(){
            for (String aString : studentList) {
                    System.out.println("Họ và tên sinh viên: " + aString);
            }
        }

        public static void sapxep() {
            Collections.sort(studentList);
            Collections.reverse(studentList);
            xuat();
        }

        public static void xuatRand() {
            Collections.shuffle(studentList);
            xuat();
        }

        public static void xoa() {
            Scanner input = new Scanner(System.in);

            System.out.print("Nhập tên cần xóa: ");
            String name = input.next();

            for(String bString : studentList){
                if(bString == name){
                    studentList.remove(bString);
                    System.out.println("Đã xóa thành công!");
                } else {
                    System.out.println("Không tìm thấy tên cần xóa!");
                }
            }

            input.close();
        }
}