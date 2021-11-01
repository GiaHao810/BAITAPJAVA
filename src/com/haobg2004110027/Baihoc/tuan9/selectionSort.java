package com.haobg2004110027.Baihoc.tuan9;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 12, -5, 16, 2, 12 , 14};
        SC(arr);
        SCI(arr);
    }
    public static void SC(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            int index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j; //Tìm phần tử nhỏ nhất trong mảng
                }
            }
            int smallerNum = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNum;
        }
        System.out.println("Selection Sort (Tăng dần)");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
    public static void SCI(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            int index = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > arr[index]){
                    index = j; //Tìm phần tử nhỏ nhất trong mảng
                }
            }
            int smallerNum = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNum;
        }
        System.out.println("\nMảng sắp xếp giảm dần");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
