package com.haobg2004110027.Baihoc.tuan9;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 12, -5, 16, 2, 12, 14};
        int[] arr2 = {1, 2, 3, 4, 7, 12, 45, 88, 5, 9};
        bubbleSort(arr);
        bubbleSort(arr2);
    }
    public static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Bubble Sort (Tăng dần)");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
