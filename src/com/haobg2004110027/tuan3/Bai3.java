package com.haobg2004110027.tuan3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] arr;
        int N;
        int tong = 0;

        do {
            System.out.print("Nhập kích thước của mảng số nguyên: ");
            N = input.nextInt();
        } while ((N < 0 && N > 100));
        arr = new int[N]; //Tạo mảng có số phần tử N
        
        for (int i = 0; i < N; i++) {
            System.out.printf("Nhập số nguyên thứ %d: ", i);
            arr[i] = input.nextInt();
        }

        //Sắp xếp và xuất mảng vừa nhập ra màn hình

        Arrays.sort(arr);
        System.out.print("\n=============================");
        System.out.println("\nSắp xếp mảng vừa nhập theo thứ tự thấp đến cao");
        for(int i = 0; i < arr.length; i++){
           System.out.print(arr[i] + "\t");
        }

        //Xuất phần tử có giá trị nhỏ nhất ra màn hình
        int Min = arr[0]; //Cách 1
        System.out.print("\n=============================");
        for (int i = 0; i < arr.length; i++) {
            Min = Math.min(Min, arr[i]);
        }
        /* 
        Cách 2
        System.out.print("\n=============================");
        System.out.printf("\n%d Là phần từ có giá trị nhỏ nhất!", arr[0]);
        */

        //Tính va xuất ra màn hình trung bình cộng các phần tử chia hết cho 3
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 3 == 0){
                tong = tong + arr[i];
            }
        }   
        System.out.format("\nTrung bình cộng các phần tử chia hết cho 3 = " + tong);
        input.close();
    }
}
