package com.haobg2004110027.Baihoc.tuan4;

public class SinhVienTestRun {
    public static void main(String[] args) {
        SinhVien[] danhSachSV = new SinhVien[10];

        SinhVien sinhVien1 = new SinhVien(199, "Nguyễn Văn A", 20, "HCM");
        SinhVien sinhVien2 = new SinhVien(200, "Nguyễn Văn B", 21, "HCM-A");
        SinhVien sinhVien3 = new SinhVien(210, "Nguyễn Văn C", 22, "HCM-B");
        
        danhSachSV[0] = sinhVien1;
        danhSachSV[1] = sinhVien2;
        danhSachSV[2] = sinhVien3;
        
        for(int i = 0; i < danhSachSV.length; i++){
            danhSachSV[i].inThongtin();
        }
    }
}
