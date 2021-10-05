package com.haobg2004110027.tuan3.baitapthem;

public class XETestDrive {
    public static void main(String[] args) {
        /*
        XE car;
        car = new XE();
        */
        XE car = new XE();

        car.owner = "Hà Anh Tuấn";
        car.hSanxuat = "Toyota";
        car.type = "Vios";
        car.license = "Yes";
        car.capacity = 100;
    
        System.out.println("\nTên chủ xe: " + car.owner + "\nHãng sản xuất: " + car.hSanxuat + "\nDòng: " + car.type + 
        "\nGiấy phép: " + car.license + "\nDung tích xăng: " + car.capacity + " Lít");
    }
}