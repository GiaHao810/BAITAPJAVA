package com.haobg2004110027.Baihoc.tuan9;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(50);
        }
        System.out.println("Before: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + "\t");
        }
        bubbleSortTest(numbers);

        //int[] arr = {5, 1, 12, -5, 16, 2, 12, 14};
        //int[] arr2 = {1, 2, 3, 4, 7, 12, 45, 88, 5, 9};

        //bubbleSortTest(arr);
        //bubbleSortTest(arr2);

        //bubbleSort(arr);
        //bubbleSort(arr2);
    }
    public static void bubbleSortTest(int[] arr){
        boolean key = true;

        do {
            key = false;
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    key = true;
                }
            }
        } while (key);
        
        System.out.println("\nBubble Sort (Tăng dần)");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
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
        System.out.println("\nBubble Sort (Tăng dần)");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
