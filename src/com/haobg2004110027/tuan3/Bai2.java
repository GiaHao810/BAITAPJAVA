package com.haobg2004110027.tuan3;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int x;

        Scanner input = new Scanner(System.in);

        System.out.print("Nhập đề xuất của bạn: ");
        x = input.nextInt();

        for(int i = 1; i <= x; i++){
           for(int y = 1; y <= 10; y++){
            System.out.printf("%d * %d = %d\n", i, y, i*y);
            if(y == 10){
                System.out.println("===========");
            }
           }
       }
        input.close();
    }
}
