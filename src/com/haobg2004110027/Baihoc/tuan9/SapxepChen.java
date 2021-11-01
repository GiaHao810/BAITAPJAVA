package com.haobg2004110027.Baihoc.tuan9;

public class SapxepChen {
    public static void main(String[] args) {
        int[] arr = {5, 1, 12, -5, 16, 2, 12, 14};
        Chen(arr);
    }
    public static void Chen(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sắp xếp chèn (Tăng dần)");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }

}
