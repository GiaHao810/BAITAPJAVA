package com.haobg2004110027.tuan3;

public class AccountTestDrive {
    public static void main(String[] args) {
        /*
            Account taikhoan;
            taikhoan = new Account();
        */
        Account taikhoan = new Account();

        taikhoan.owner = "Hà Anh Tuấn";
        taikhoan.balance = 400000000;
        taikhoan.number = 9299422;

        System.out.println("Tên chủ tài khoản: " + taikhoan.owner + "\nSố tài khoản: " + taikhoan.number + "\nSố dư tài khoản: " + taikhoan.balance + " Đồng");
    }
}