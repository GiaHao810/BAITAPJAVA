package com.haobg2004110027.tuan3.baitapthem;

public class ComputerTestDrive {
    public static void main(String[] args) {
        /*
        Computer com;
        com = new Computer();
        */
        Computer com = new Computer();

        com.nhaSX = "Asus";
        com.namSX = "2010";
        com.cpu = "Intel Core I3 8145U";
        com.hdh = "Windows 10";
        com.price = 13000000;
        com.ram = "8";
        com.namBH = "2030";

        System.out.println("\nNhà sản xuất: " + com.nhaSX + "\nNăm sản xuất: " + com.namSX + "\nHệ điều hành: " + com.hdh +
         "\nRam: " + com.ram + " GB" + "\nCPU: " + com.cpu + "\nGiá: " + com.price + " Đồng" + "\nNăm bảo hành: " + com.namBH);
    }    
}