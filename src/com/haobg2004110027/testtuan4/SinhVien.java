package com.haobg2004110027.testtuan4;

public class SinhVien {
    int mssv,age;

    String name, queQuan;

    public SinhVien(int m, String n, int a, String q){
        mssv = m;
        name = n;
        age = a;
        queQuan = q;
    }
    void inThongtin(){
        System.out.println("Mã số sinh viên: " + mssv + "\tTên sinh viên: " + name + "\tTuổi: " + age + "\tQuê quán: " + queQuan);
    }
}
