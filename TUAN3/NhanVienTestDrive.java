public class NhanVienTestDrive {
    public static void main(String[] args) {
        /*
        NhanVien nhanvien;
        nhanvien = new NhanVien();
        */
        NhanVien nhanvien = new NhanVien();

        nhanvien.address = "78 Hoàng Văn Thụ";
        nhanvien.dateOB = "22/09/2021";
        nhanvien.name = "Hà Anh Tuấn";
        nhanvien.salary = 2500000;
        nhanvien.wpart = "Manager";

        System.out.println("\nTên nhân viên: " + nhanvien.name + "\nLương: " + nhanvien.salary + " Đồng" +
        "\nĐịa chỉ: " + nhanvien.dateOB + "\nBộ phận làm việc: " + nhanvien.wpart + "\nNgày sinh: " + nhanvien.dateOB);
    }
}