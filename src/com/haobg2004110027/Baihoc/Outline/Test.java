package com.haobg2004110027.Baihoc.Outline;

import java.util.Scanner;

public class Test {
     public static void main(String[] args) throws ReflectiveOperationException {
          // int[] a = {9,6,2,4,7};
          // Scanner input = new Scanner(System.in);
          // searchIndex(a, input);
          // searchLNNN(a);  
          // int index = 1;
          // eraseIndex(a, index);
	}

     public static void searchIndex(int []a, Scanner input){
          System.out.print("Nhap gia tri can tim: ");
          int index = input.nextInt();

          for(int i = 0; i < a.length; i++){
               if(a[i] == index){
                    System.out.printf("Da tim thay gia tri %d o phan tu thu %d", a[i], i);
               }
          }
     }
     public static void searchLNNN(int []a) {
          int max = a[0];
          for(int i = 0; i < a.length - 1; i++){
               if(max > a[i]){
                    a[i] = max;
               }
          }
          System.out.println("Gia tri lon nhat: " + max);
     }
     public static void eraseIndex(int []a, int index){
          int newArr[] = new int[a.length];

          for(int i = 0; i < a.length; i++){
               newArr[i] = a[i];
          }

          a = newArr;
          
          for(int i = 0; i < a.length; i++){
               System.out.print(a[i] + " ");
          }
     }
}
