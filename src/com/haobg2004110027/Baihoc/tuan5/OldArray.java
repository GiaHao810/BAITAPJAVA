package com.haobg2004110027.Baihoc.tuan5;

public class OldArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4};

        int newElement = 8;

        int n = arr.length;

        int [] newArr = new int[n + 1];

        for(int i = 0; i < n; i++){
            newArr[i] = arr[i];
        }
        System.out.print("Mảng cũ: ");
        for(int x : arr){
            System.out.println(x);
        }
        newArr[n] = newElement;
        System.out.print("Mảng mới: ");
        for(int x : newArr){
            System.out.println(x);
        }
    }
}
