package com.haobg2004110027.tuan3;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] hoTen;
        Double[] diem;
        int N;

        System.out.print("Nhập số lượng sinh viên: ");
        N = input.nextInt();

        hoTen = new String[N]; //Tạo mảng có số phần tử N (Số lượng sinh viên)
        diem = new Double[N];

        for(int i = 0; i < N; i++){
            System.out.printf("Nhập họ tên của sinh viên thứ %d: ", i);
            hoTen[i] = input.next();
            System.out.print("Nhập điểm của sinh viên: ");
            diem[i] = input.nextDouble();
        }

        System.out.println("===========================");
        for(int i = 0; i < N; i++){
            System.out.printf("Sinh viên thứ %d\n", i);
            System.out.println("Họ tên: " + hoTen[i]);
            System.out.println("Điểm: " + diem[i]);
            if(diem[i] < 5){
                System.out.println("Học lực: Yếu");
            } else if (diem[i] == 5 || diem[i] < 6.5) {
                System.out.println("Học lực: Trung  bình");
            } else if (diem[i] == 6.5 || diem[i] < 7.5){
                System.out.println("Học lực: Khá");
            } else if (diem[i] == 7.5 || diem[i] < 9){
                System.out.println("Học lực: Giỏi");
            } else {
                System.out.println("Học lực: Xuất sắc");
            }
        }

        System.out.println("===========================");
        
        for(int i = 0; i < diem.length - 1; i++){
            for (int j = i + 1; j < diem.length; j++) {
                if(diem[i] > diem[j]){
                    Double temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;
                }
            }
        }
        System.out.println("Danh sách sắp xếp sinh viên theo ĐIỂM tăng dần");
        for(int i = 0; i < N; i++){
            System.out.println(diem[i]);
        }

        input.close();
    }
}
/*
o	Yếu: điểm < 5
o	Trung bình: 5 <= điểm < 6.5
o   Khá: 6.5 <= điểm < 7.5
o	Giỏi: 7.5<= điểm < 9
o	Xuất sắc: điểm >= 9
*/