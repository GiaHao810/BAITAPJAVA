package com.haobg2004110027.tuan2;

public class Bai4 {
    public static void main(String[] args) {
        
        int a = 0;

        Scanner input = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("1. Giải phương trình bậc nhất.");
        System.out.println("2. Giải phương trình bậc 2.");
        System.out.println("3. Tính tiền điện.");
        System.out.println("0. Thoát chương trình.");
        System.out.println("==============================");
        switch (a = 0) {
            case 0:
                System.out.println("Bạn đã chọn thoát chương trình!");
                break;
            case 1:
                System.out.println("Bạn đã chọn giải phương trình bậc nhất!");
                break;
            case 2:
                System.out.println("Bạn đã chọn giải phương trình bậc 2!");
                break;
            case 3:
                System.out.println("Bạn đã chọn tính tiền điện!");
                break;
            default:
                break;
        }
    }
}
