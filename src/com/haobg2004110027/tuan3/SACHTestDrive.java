package com.haobg2004110027.tuan3;

public class SACHTestDrive {
    public static void main(String[] args) {
        /*
        SACH sach;
        sach = new SACH();
        */
        SACH sach = new SACH();
        
        sach.gia = 150000;
        sach.loai = "Thiếu Nhi";
        sach.nXuatban = "Nhi Đồng";
        sach.namXuatban = 2002;
        sach.soLuong = 1000;
        System.out.println("\nGiá: " + sach.gia + " Đồng" + "\nNăm xuất bản: " + sach.nXuatban +
         "\nSố lượng: " + sach.soLuong + " Cuốn" + "\nLoại: " + sach.loai + "\nNhà xuất bản: " + sach.nXuatban);
    }
}