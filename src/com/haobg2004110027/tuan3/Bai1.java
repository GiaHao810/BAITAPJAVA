package com.haobg2004110027.tuan3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int soNhap;
        boolean check = true;

        System.out.print("Nhập một số nguyên: ");
        soNhap = input.nextInt();

        for(int i = 2; i < soNhap - 1; i++){
            if(soNhap % i == 0){
                check = false;
            }
            i++;
        }
        if(check == false){
            System.out.println(soNhap + " Không phải là số nguyên tố!");
        } else {
            System.out.println(soNhap + " Là số nguyên tố!");
        }
        input.close();
    }
}
