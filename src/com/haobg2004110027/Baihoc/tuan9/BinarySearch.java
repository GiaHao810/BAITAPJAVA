package com.haobg2004110027.Baihoc.tuan9;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 7, 20, 24 , 31, 42, 56};

        Scanner input = new Scanner(System.in);

        System.out.print("Nhập X cần tìm: ");
        int x = input.nextInt();
        int search = binarySearch(arr, x);

        if(arr[search] == x){
            System.out.println("Đã tìm thấy " + arr[search]);
        } else {
            System.out.println("Can't found!");
        }
        input.close();
    }

    public static int binarySearch(int[] arr, int x) {
        int left = 0, right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - 1) / 2;

            // Check if x is present at mid
            if(arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if(arr[mid] < x)
                left = mid + 1;

            // If x is smaller, ignore right half
            else
                right = mid - 1;
        }
        return -1;
    }

}
