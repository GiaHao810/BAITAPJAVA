package com.haobg2004110027.FinalExam3;

import java.text.ParseException;
import java.util.Scanner;

public class ProductsTestDrive {
    public static void main(String[] args) throws ParseException{
        Scanner input = new Scanner(System.in);

        Products listProducts = new Products();

        //Temp Products
        Products tempProducts = new Products();

        boolean loopCondition = true;
        
        do {
            System.out.println("*********************************");
            System.out.println("1. Chương trình đã có dữ liệu sẵn");
            System.out.println("2. Chương trình trống dữ liệu");
            System.out.println("0. Đóng chương trình");
            System.out.println("*********************************");
            System.out.print("Nhập lựa chọn: ");
            int user_Option = input.nextInt();

            switch (user_Option) {
            case 1:
                TempProducts(tempProducts);
                TempMenu(tempProducts, input);
                loopCondition = false;
                break;
            case 2:
                MainMenu(listProducts , input);
                loopCondition = false;
                break;
            case 0:
                System.out.println("Chương trình đang đóng!");
                loopCondition = false;
                break;
            default:
                System.out.println("Lựa chọn không tồn tại!");
                break;
            }
        } while (loopCondition);
        
    
        input.close();
    }

    private static void TempMenu(Products tempProducts, Scanner input) throws ParseException {
        boolean loopCondition = true;
        do {
            tempProducts.showMenu();
            System.out.print("Nhập lựa chọn: ");
            int userOption = input.nextInt();
            switch (userOption) {
                case 1:
                    System.out.println("\n [Thêm Hàng Hóa] \n");

                    tempProducts.addImport();

                    tempProducts.delay();
                    break;
                case 2:
                    System.out.println("\n [Xóa Hàng Hóa] \n");

                    tempProducts.importRemove();

                    tempProducts.delay();
                    break;
                case 3:
                    System.out.println("\n [Sửa Hàng Hóa] \n");

                    tempProducts.importReplace();
                    
                    tempProducts.delay();
                    break;
                case 4:
                    System.out.println("\n [Tìm kiếm theo (1 - LOẠI) (2 - GIÁ) (3 - NGÀY)] \n");
                    System.out.print("Chọn loại tìm kiếm: ");
                    int userOption_Case4 = input.nextInt();
                    boolean loopCondition_Case4 = true;

                    while(loopCondition_Case4){
                        switch (userOption_Case4) {
                            case 1:
                                System.out.println("\n [Tìm kiếm theo loại]");
                                
                                tempProducts.importfindType();

                                loopCondition_Case4 = false;

                                tempProducts.delay();
                                break;
                            case 2:
                                System.out.println("\n [Tìm kiếm theo GIÁ (1 - GIÁ NHẬP) (2 - KHOẢNG GIÁ)]");
                                System.out.print("Chọn loại tìm kiếm: ");
                                int option_Case4_2 = input.nextInt();
                                boolean loopCondition_Case4_2 = true;

                                while(loopCondition_Case4_2){
                                    switch (option_Case4_2) {
                                        case 1:
                                            tempProducts.importFindPrice();

                                            loopCondition_Case4_2 = false;

                                            tempProducts.delay();
                                            break;
                                        case 2:
                                            tempProducts.importfindPriceFT();

                                            loopCondition_Case4_2 = false;

                                            tempProducts.delay();
                                            break;
                                        default:
                                            System.out.println("Chức năng không tồn tại!");

                                            loopCondition_Case4_2 = false;

                                            break;
                                    }
                                }

                                loopCondition_Case4 = false;

                                tempProducts.delay();
                                break;
                            case 3:
                                System.out.println("\n [Tìm kiếm theo NGÀY (1 - NGÀY) (2 - KHOẢNG NGÀY)");
                                System.out.print("Chọn loại  tìm kiếm: ");
                                boolean loopCondition_Case4_3 = true;
                                int userOption_Case4_3 = input.nextInt();

                                while(loopCondition_Case4_3){
                                    switch (userOption_Case4_3) {
                                        case 1:    
                                            tempProducts.importFindDateFT();
    
                                            loopCondition_Case4_3 = false;
                                            
                                            tempProducts.delay();
                                            break;
                                        case 2:   
                                            tempProducts.importFindDateFT();
    
                                            loopCondition_Case4_3 = false;

                                            tempProducts.delay();
                                            break;                                
                                        default:
                                            System.out.println("Chức năng không tồn tại!");

                                            loopCondition_Case4_3 = false;

                                            break;
                                    }
                                }
                                
                                loopCondition_Case4 = false;

                                tempProducts.delay();
                                break;
                            default:
                                System.out.println("Chức năng không tồn tại!");
                                
                                loopCondition_Case4 = false;

                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("\n [Sắp xếp theo (1 -TĂNG DẦN) (2 - GIẢM DẦN) (3 - NGÀY) (4 -  LOẠI ) (5 - LOẠI & NGÀY ) (6 - LOẠI & GIÁ)] \n");
                    System.out.print("Chọn loại sắp xếp: ");
                    int userOption_Case5 = input.nextInt();
                    boolean loopCondition_Case5 = true;

                    while(loopCondition_Case5){
                        switch(userOption_Case5) {
                            case 1:
                                System.out.println("\n [Sắp xếp tăng dần] \n");

                                tempProducts.sortPriceUp();

                                loopCondition_Case5 = false;

                                tempProducts.delay();
                                break;
                            case 2:
                                System.out.println("\n [Sắp xếp giảm dần] \n");  

                                tempProducts.sortPriceDown();

                                loopCondition_Case5 = false;

                                tempProducts.delay();
                                break;
                            case 3:
                                System.out.println("\n [Sắp xếp theo NGÀY (1 - TĂNG DẦN) (2 - GIẢM DẦN)] \n");
                                System.out.print("Chọn kiểu sắp xếp: ");
                                int userOption_Case5_3 = input.nextInt();
                                boolean loopCondition_Case5_3 = true;

                                while(loopCondition_Case5_3){
                                    switch (userOption_Case5_3) {
                                        case 1:
                                            tempProducts.sortDateUp();

                                            loopCondition_Case5_3 = false;

                                            tempProducts.delay();

                                            break;
                                        case 2:
                                            tempProducts.sortDateDown();

                                            loopCondition_Case5_3 = false;
                                            
                                            tempProducts.delay();

                                            break;
                                        default:

                                            loopCondition_Case5_3 = false;

                                            break;
                                    }
                                }

                                loopCondition_Case5 = false;

                                break;
                            case 4:
                                System.out.println("\n [Sắp xếp theo LOẠI] \n");

                                tempProducts.sortType(tempProducts);
                                
                                loopCondition_Case5 = false;

                                tempProducts.delay();
                                break;
                            case 5:
                                System.out.println("\n [Sắp xếp theo LOẠI & NGÀY (1 - TĂNG DẦN) (2 - GIẢM DẦN)] \n");
                                System.out.print("Chọn kiểu sắp xếp LOẠI & NGÀY: ");
                                int userOption_Case5_5 = input.nextInt();

                                tempProducts.sortTypeDate(tempProducts, userOption_Case5_5);

                                loopCondition_Case5 = false;

                                tempProducts.delay();
                                break;
                            case 6:
                                System.out.println("\n [Sắp xếp theo LOẠI & GIÁ (1 - TĂNG DẦN) (2 - GIẢM DẦN) ] \n");
                                System.out.print("Chọn kiểu sắp xếp LOẠI & GIÁ: ");
                                int userOption_Case5_6 = input.nextInt();

                                tempProducts.sortTypePrice(tempProducts, userOption_Case5_6);

                                loopCondition_Case5 = false;

                                tempProducts.delay();
                                break;
                            default:
                                System.out.println("Chức năng không tồn tại!");

                                loopCondition_Case5 = false;

                                break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("\n [6] Thống kê (1 - Tổng Số Lượng Hàng Hóa) (2 - Tổng Giá Trị Nhập Kho) (3 - Số Lượng Từng Loại Hàng) \n");
                    System.out.print("Chọn loại thống kê: ");
                    int userOption_Case6 = input.nextInt();
                    boolean loopCondition_Case6 = true;

                    while(loopCondition_Case6){
                        switch (userOption_Case6) {
                            case 1:
                                System.out.println("\n [Thống kê theo tổng số lượng hàng hóa] \n");

                                tempProducts.statProducts();

                                loopCondition_Case6 = false;

                                tempProducts.delay();
                                break;
                            case 2:
                                System.out.println("\n [Thống kê theo tổng giá trị nhập kho] \n");

                                tempProducts.statPrice();

                                loopCondition_Case6 = false;

                                tempProducts.delay();
                                break;
                            case 3:
                                System.out.println("\n [Thống kê theo số lượng từng loại hàng] \n");

                                tempProducts.statType();

                                loopCondition_Case6 = false;

                                tempProducts.delay();
                                break;
                            default:
                                System.out.println("Chức năng không tồn tại!");

                                loopCondition_Case6 = false;
                                
                                break;
                        }
                    }
                    break;
                case 7:
                    System.out.println("\n [7] In thông tin sản phẩm \n");

                    tempProducts.inThongTin();

                    tempProducts.delay();
                    break;
                case 0:
                    System.out.println("Chương trình đang đóng!");

                    loopCondition = false;
                    
                    break;
                default:
                    System.out.println("Chức năng không tồn tại!\n");

                    break;
            }
        } while (loopCondition);
    }

    private static void MainMenu(Products listProducts , Scanner input) throws ParseException {
        boolean loopCondition = true;
        do {
            listProducts .showMenu();
            System.out.print("Nhập lựa chọn: ");
            int userOption = input.nextInt();
            switch (userOption) {
                case 1:
                    System.out.println("\n [Thêm Hàng Hóa] \n");
                    
                    listProducts.addImport();

                    listProducts.delay();
                    break;
                case 2:
                    System.out.println("\n [Xóa Hàng Hóa] \n");
                    
                    listProducts.importRemove();

                    listProducts.delay();
                    break;
                case 3:
                    System.out.println("\n [Sửa Hàng Hóa] \n");
                    
                    listProducts.importReplace();
                    
                    listProducts.delay();
                    break;
                case 4:
                    System.out.println("\n [Tìm kiếm theo (1 - LOẠI) (2 - GIÁ) (3 - NGÀY)] \n");
                    System.out.print("Chọn loại tìm kiếm: ");
                    int userOption_Case4 = input.nextInt();
                    boolean loopCondition_Case4 = true;

                    while(loopCondition_Case4){
                        switch (userOption_Case4) {
                            case 1:
                                System.out.println("\n [Tìm kiếm theo loại]");

                                listProducts.importfindType();

                                loopCondition_Case4 = false;

                                listProducts.delay();
                                break;
                            case 2:
                                System.out.println("\n [Tìm kiếm theo GIÁ (1 - GIÁ NHẬP) (2 - KHOẢNG GIÁ)]");
                                System.out.print("Chọn loại tìm kiếm: ");
                                int option_Case4_2 = input.nextInt();
                                boolean loopCondition_Case4_2 = true;

                                while(loopCondition_Case4_2){
                                    switch (option_Case4_2) {
                                        case 1:
                                            listProducts.importFindPrice();

                                            loopCondition_Case4_2 = false;

                                            listProducts.delay();
                                            break;
                                        case 2:
                                            listProducts.importfindPriceFT();

                                            loopCondition_Case4_2 = false;

                                            listProducts.delay();
                                            break;
                                        default:
                                            System.out.println("Chức năng không tồn tại!");

                                            loopCondition_Case4_2 = false;

                                            break;
                                    }
                                }

                                loopCondition_Case4 = false;

                                listProducts.delay();
                                break;
                            case 3:
                                System.out.println("\n [Tìm kiếm theo NGÀY (1 - NGÀY) (2 - KHOẢNG NGÀY)");
                                System.out.print("Chọn loại  tìm kiếm: ");
                                boolean loopCondition_Case4_3 = true;
                                int userOption_Case4_3 = input.nextInt();

                                while(loopCondition_Case4_3){
                                    switch (userOption_Case4_3) {
                                        case 1:
                                            listProducts.importFindDate();
    
                                            loopCondition_Case4_3 = false;
                                            
                                            listProducts.delay();
                                            break;
                                        case 2:
                                            listProducts.importFindDateFT();
    
                                            loopCondition_Case4_3 = false;

                                            listProducts.delay();
                                            break;                                
                                        default:
                                            System.out.println("Chức năng không tồn tại!");

                                            loopCondition_Case4_3 = false;

                                            break;
                                    }
                                }
                                
                                loopCondition_Case4 = false;

                                listProducts.delay();
                                break;
                            default:
                                System.out.println("Chức năng không tồn tại!");
                                
                                loopCondition_Case4 = false;

                                break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("\n [Sắp xếp theo (1 -TĂNG DẦN) (2 - GIẢM DẦN) (3 - NGÀY) (4 -  LOẠI ) (5 - LOẠI & NGÀY ) (6 - LOẠI & GIÁ)] \n");
                    System.out.print("Chọn loại sắp xếp: ");
                    int userOption_Case5 = input.nextInt();
                    boolean loopCondition_Case5 = true;

                    while(loopCondition_Case5){
                        switch(userOption_Case5) {
                            case 1:
                                System.out.println("\n [Sắp xếp tăng dần] \n");

                                listProducts.sortPriceUp();

                                loopCondition_Case5 = false;

                                listProducts.delay();
                                break;
                            case 2:
                                System.out.println("\n [Sắp xếp giảm dần] \n");
                                
                                listProducts.sortPriceDown();

                                loopCondition_Case5 = false;

                                listProducts.delay();
                                break;
                            case 3:
                                System.out.println("\n [Sắp xếp theo NGÀY (1 - TĂNG DẦN) (2 - GIẢM DẦN)] \n");
                                System.out.print("Chọn kiểu sắp xếp: ");
                                int userOption_Case5_3 = input.nextInt();
                                boolean loopCondition_Case5_3 = true;

                                while(loopCondition_Case5_3){
                                    switch (userOption_Case5_3) {
                                        case 1:
                                            listProducts .sortDateUp();

                                            loopCondition_Case5_3 = false;

                                            listProducts.delay();

                                            break;
                                        case 2:
                                            listProducts.sortDateDown();

                                            loopCondition_Case5_3 = false;
                                            
                                            listProducts.delay();

                                            break;
                                        default:

                                            loopCondition_Case5_3 = false;

                                            break;
                                    }
                                }

                                loopCondition_Case5 = false;

                                break;
                            case 4:
                                System.out.println("\n [Sắp xếp theo LOẠI] \n");

                                listProducts.sortType(listProducts);
                                
                                loopCondition_Case5 = false;

                                listProducts.delay();
                                break;
                            case 5:
                                System.out.println("\n [Sắp xếp theo LOẠI & NGÀY (1 - TĂNG DẦN) (2 - GIẢM DẦN)] \n");
                                System.out.print("Chọn kiểu sắp xếp LOẠI & NGÀY: ");
                                int userOption_Case5_5 = input.nextInt();

                                listProducts.sortTypeDate(listProducts , userOption_Case5_5);

                                loopCondition_Case5 = false;

                                listProducts.delay();
                                break;
                            case 6:
                                System.out.println("\n [Sắp xếp theo LOẠI & GIÁ (1 - TĂNG DẦN) (2 - GIẢM DẦN) ] \n");
                                System.out.print("Chọn kiểu sắp xếp LOẠI & GIÁ: ");
                                int userOption_Case5_6 = input.nextInt();

                                listProducts.sortTypePrice(listProducts , userOption_Case5_6);

                                loopCondition_Case5 = false;

                                listProducts.delay();
                                break;
                            default:
                                System.out.println("Chức năng không tồn tại!");

                                loopCondition_Case5 = false;

                                break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("\n [6] Thống kê (1 - Tổng Số Lượng Hàng Hóa) (2 - Tổng Giá Trị Nhập Kho) (3 - Số Lượng Từng Loại Hàng) \n");
                    System.out.print("Chọn loại thống kê: ");
                    int userOption_Case6 = input.nextInt();
                    boolean loopCondition_Case6 = true;

                    while(loopCondition_Case6){
                        switch (userOption_Case6) {
                            case 1:
                                System.out.println("\n [Thống kê theo tổng số lượng hàng hóa] \n");

                                listProducts .statProducts();

                                loopCondition_Case6 = false;

                                listProducts.delay();
                                break;
                            case 2:
                                System.out.println("\n [Thống kê theo tổng giá trị nhập kho] \n");

                                listProducts .statPrice();

                                loopCondition_Case6 = false;

                                listProducts.delay();
                                break;
                            case 3:
                                System.out.println("\n [Thống kê theo số lượng từng loại hàng] \n");

                                listProducts .statType();

                                loopCondition_Case6 = false;

                                listProducts.delay();
                                break;
                            default:
                                System.out.println("Chức năng không tồn tại!");

                                loopCondition_Case6 = false;
                                
                                break;
                        }
                    }
                    break;
                case 7:
                    System.out.println("\n [7] In thông tin sản phẩm \n");

                    listProducts.inThongTin();

                    listProducts.delay();
                    break;
                case 0:
                    System.out.println("Chương trình đang đóng!");

                    loopCondition = false;
                    
                    break;

                default:
                    System.out.println("Chức năng không tồn tại!\n");

                    break;
            }
        } while (loopCondition);
    }

    private static void TempProducts(Products tempProducts) {
        // nameProduct, typeProduct, idProduct, priceProduct, inventory, date

        tempProducts.add("Táo", "Thuc Pham", "TP236", 2.000, 2600, "12/5/2021"); tempProducts.add("Hoa Dây Bát Tràng", "Sanh Su", "SS57", 542.000, 82, "19/05/2020");
        tempProducts.add("ViVo", "Dien May", "DM148", 4000.000, 286, "05/09/2021"); tempProducts.add("Gốm Xanh Bát Tràng", "Sanh Su", "SS505", 604.000, 50, "01/01/2021"); 
        tempProducts.add("Dưa hấu", "Thuc Pham", "TP172", 21.600, 2610, "30/11/2021"); tempProducts.add("Huawei", "Dien May", "DM741", 8000.000, 600, "04/07/2021");
        tempProducts.add("Mát Ghi Bát Tràng", "Sanh Su", "SS645", 420.000, 29, "19/05/2020"); tempProducts.add("iPhone", "Dien May", "DM796", 32000.000, 1000, "10/11/2021"); 
        tempProducts.add("Cam", "Thuc Pham", "TP334", 12.300, 4862, "10/06/2020"); tempProducts.add("Kiwi", "Thuc Pham", "TP40", 16.400, 3795, "15/02/2020"); 
        tempProducts.add("Quả dâu", "Thuc Pham", "TP929", 13.400, 2648, "27/09/2020"); tempProducts.add("Cherry", "Thuc Pham", "TP731", 10.200, 4924, "20/01/2021");
        tempProducts.add("Đào Chuồn Bát Tràng", "Sanh Su", "SS141", 523.000, 10, "20/04/2019"); tempProducts.add("Men Bát Tràng", "Sanh Su", "SS603", 583.000, 20, "18/03/2019"); 
        tempProducts.add("Hoa Sen Bát Tràng", "Sanh Su", "SS579", 596.000, 20, "04/09/2019"); tempProducts.add("Dứa", "Thuc Pham", "TP502", 3.600, 3540, "08/12/2021"); 
        tempProducts.add("Hoa Trắng Bát Tràng", "Sanh Su", "SS295", 621.000, 50, "28/08/2020"); tempProducts.add("BlackBerry", "Dien May", "DM275", 1600.000, 4, "09/04/2021");
        tempProducts.add("Xoài", "Thuc Pham", "TP936", 16.500, 2643, "20/11/2021"); tempProducts.add("SamSung", "Dien May", "DM839", 16000.000, 800, "08/02/2021"); 
    }
}
