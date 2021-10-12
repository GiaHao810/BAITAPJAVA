package com.haobg2004110027.tuan4;

public class SanPham {
    String tenSP;
    Double donGia;

    SanPham(){

    }

    public SanPham(String tenSP, Double donGia){
        this.donGia = donGia;
        this.tenSP = tenSP;
    }

    void inThongtin(){
        System.out.println("Tên sản phẩm: " + tenSP);
        System.out.println("Đơn giá: " + donGia);
    }

    public String getTen() {
        return this.tenSP;
    }

    public double getDonGia() {
        return this.donGia;
    }
}
