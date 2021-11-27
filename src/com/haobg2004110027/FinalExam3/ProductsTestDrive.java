package com.haobg2004110027.FinalExam3;

import java.util.Scanner;

public class ProductsTestDrive {
    public static void main(String[] args) {
        Products products = new Products();

        //Temp Info
        Products tempProducts = new Products();
        //nameProduct, typeProduct, idProduct, priceProduct, inventory, date , month, year
        tempProducts.add("Táo", "Thực phẩm", 236, 2000, 2600, 12, 5, 2021); tempProducts.add("Dứa", "Thực phẩm", 502, 3600, 3540, 8, 12, 2021); 
        tempProducts.add("Dưa hấu", "Thực phẩm", 172, 21600, 2610, 30, 11, 2021); tempProducts.add("Xoài", "Thực phẩm", 936, 16500, 2643, 20, 11, 2020);
        tempProducts.add("Cam", "Thực phẩm", 334, 12300, 4862, 10, 6, 2020); tempProducts.add("Kiwi", "Thực phẩm", 40, 16400, 3795, 15, 2, 2020); tempProducts.add("Quả dâu", "Thực phẩm", 929, 13400, 2648, 27, 9, 2020); tempProducts.add("Cherry", "Thực phẩm", 731, 10200, 4924, 20, 1, 2021);
        tempProducts.add("Đào Chuồn Bát Tràng", "Sành sứ", 141, 523000, 10, 20, 4 , 2019); tempProducts.add("Men Bát Tràng", "Sành sứ", 603, 583000, 20, 18, 3, 2019); tempProducts.add("Hoa Sen Bát Tràng", "Sành sứ", 579, 596000, 20, 4, 9 , 2019); tempProducts.add("Hoa Dây Bát Tràng", "Sành sứ", 57, 542000, 82, 19, 5, 2020);
        tempProducts.add("Hoa Trắng Bát Tràng", "Sành sứ", 295, 621000, 50, 28, 8, 2020); tempProducts.add("Gốm Xanh", "Sành sứ", 505, 604000, 50, 1, 1, 2021); tempProducts.add("Mát Ghi Bát Tràng", "Sành sứ", 645, 420000, 29, 19, 5, 2020); tempProducts.add("iPhone", "Điện máy", 796, 32000000, 1000, 10, 11, 2021); 
        tempProducts.add("SamSung", "Điện máy", 839, 16000000, 800, 8, 2, 2021); tempProducts.add("Huawei", "Điện máy", 741, 8000000, 600, 4, 7, 2021); tempProducts.add("ViVo", "Điện máy", 148, 4000000, 286, 5, 9, 2021); tempProducts.add("BlackBerry", "Điện máy", 275, 1600000, 4, 9, 4, 2021);

        Scanner input = new Scanner(System.in);
//TempInfo
        int Z = 1000;
        int L = 52300;
        String Y = "TTTT";
        int X = 172;
//**************************/
        boolean key = true;
        do {
            products.showMenu();
            System.out.print("Nhập lựa chọn: ");
            int options = input.nextInt();
            switch (options) {
                case 1:
                    System.out.println("\n [Thêm Hàng Hóa] \n");
                    
                    products.addImport();
                    break;
                case 2:
                    System.out.println("\n [Xóa Hàng Hóa] \n");
                    //products.importRemove();

                    tempProducts.importRemove();

                    products.delay();
                    break;
                case 3:
                    System.out.println("\n [Sửa Hàng Hóa] \n");
                    //products.importReplace();

                    tempProducts.replace(X);
                    
                    products.delay();
                    break;
                case 4:
                    System.out.println("\n [Tìm kiếm theo (1 - LOẠI) (2 - GIÁ) (3 - NGÀY NHẬP)] \n");
                    System.out.print("Chọn loại tìm kiếm: ");
                    int boo = input.nextInt();
                    boolean key2 = true;

                    while(key2){
                        switch (boo) {
                            case 1:
                                System.out.println("\n [Tìm kiếm theo loại]");

                                //products.importfindType();
                                
                                tempProducts.findType(Y);

                                key2 = false;

                                products.delay();
                                break;
                            case 2:
                                System.out.println("\n [Tìm kiếm theo giá]");

                                //products.importfindPrice();

                                tempProducts.findPrice(Z, L);

                                key2 = false;

                                products.delay();
                                break;
                            case 3:
                                System.out.println("\n [Tìm kiếm theo ngày nhập]");

                                key2 = false;

                                products.delay();
                                break;
                            default:
                                System.out.println("Chức năng không tồn tại!");
                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("\n [Sắp xếp theo (1 -TĂNG DẦN) (2 - GIẢM DẦN) (3 - LOẠI & NGÀY NHẬP) (4 - LOẠI & GIÁ)] \n");
                    System.out.print("Chọn loại tìm kiếm: ");
                    int booo = input.nextInt();
                    boolean key3 = true;

                    while(key3){
                        switch (booo) {
                            case 1:
                                System.out.println("\n [Sắp xếp tăng dần] \n");

                                tempProducts.sortDown();

                                key3 = false;

                                products.delay();
                                break;
                            case 2:
                                System.out.println("\n [Sắp xếp giảm dần] \n");
                                
                                tempProducts.sortDown();

                                key3 = false;

                                products.delay();
                                break;
                            case 3:
                                System.out.println("\n [Sắp xếp theo loại & ngày nhập] \n");

                                key3 = false;

                                products.delay();
                                break;
                            case 4:
                                System.out.println("\n [Sắp xếp theo loại & giá] \n");
                                
                                key3 = false;

                                products.delay();
                                break;
                            default:
                                System.out.println("Chức năng không tồn tại!");
                                key3 = false;
                                break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("\n [6] Thống kê (1 - Tổng Số Lượng Hàng Hóa) (2 - Tổng Giá Trị Nhập Kho) (3 - Số Lượng Từng Loại Hàng) \n");
                    System.out.print("Chọn loại thống kê: ");
                    int boooo = input.nextInt();
                    boolean key4 = true;

                    while(key4){
                        switch (boooo) {
                            case 1:
                                System.out.println("\n [Thống kê theo tổng số lượng hàng hóa] \n");

                                //products.statProducts();

                                tempProducts.statProducts();

                                key4 = false;

                                products.delay();
                                break;
                            case 2:
                                System.out.println("\n [Thống kê theo tổng giá trị nhập kho] \n");

                                //products.statPrice();

                                tempProducts.statPrice();

                                key4 = false;

                                products.delay();
                                break;
                            case 3:
                                System.out.println("\n [Thống kê theo số lượng từng loại hàng] \n");

                                //products.statType();

                                tempProducts.statType();

                                key4 = false;

                                products.delay();
                                break;
                            default:
                                System.out.println("Chức năng không tồn tại!");

                                key4 = false;
                                
                                break;
                        }
                    }
                    break;
                case 7:
                    //Temp Info
                    //tempInfo(tempProducts);

                    tempInfo(tempProducts);

                    products.delay();
                    break;
                case 0:
                    System.out.println("Chương trình đang đóng!");
                    key = false;
                    break;

                default:
                    System.out.println("Chức năng không tồn tại!\n");
                    break;
            }
        } while (key);

        input.close();
    }

    static void tempInfo(Products tempProducts){
        tempProducts.inThongTin();
    }
}
// Ngày tháng chưa được thông minh
// 