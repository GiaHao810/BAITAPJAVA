package com.haobg2004110027.Baihoc.tuan9;

import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        int[] arr = {5, 1, 12, -5, 16, 2, 12, 14};
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập X cần tìm: ");
        int x = input.nextInt();
        int result = search(arr, x);

        if(arr[result] == x){
            System.out.println("Đã tìm thấy => " + arr[result]);
        } else {
            System.out.println("Can't found!");
        }
        input.close();
    }
    //Tìm kiếm tuyến tính
    public static int search(int[] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return 0;

    }
}
