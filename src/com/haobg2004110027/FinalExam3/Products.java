package com.haobg2004110027.FinalExam3;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Products {

    Scanner input = new Scanner(System.in);

    SimpleDateFormat parDate = new SimpleDateFormat("dd/MM/yyyy");

    Node head = null;
    Node tail = null;

    String nameProduct, typeProduct, dateProduct, idProduct;
    int inventory,
        priceProduct;

    void Product() {}

    void Product(String nameProduct, String typeProduct, String idProduct, int priceProduct, int inventory, String dateProduct) {
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.inventory = inventory;
        this.priceProduct = priceProduct;
        this.typeProduct = typeProduct;
        this.dateProduct = dateProduct;
    }

    void inThongTin() throws ParseException{
        Node currNode = head;

        if (currNode == null) {
            System.out.println("Danh sách rỗng!");
        }

        while (currNode != null) {
            System.out.println("\nThông tin hàng hóa");
            System.out.println("Loại: " + currNode.typeProduct);
            System.out.println("Giá: " +  currNode.priceProduct + " VNĐ");
            System.out.println("Mã hàng: " + currNode.idProduct);
            System.out.println("Tên hàng hóa: " + currNode.nameProduct);
            System.out.println("Số lượng tồn kho: " + currNode.inventory);

            Date parseString = parDate.parse(currNode.dateProduct);
            System.out.println("Ngày nhập kho: " + parseString);

            currNode = currNode.next;
        }

    }

    void delay() {
        System.out.println("\nNhấn Enter để tiếp tục");
        String delay = input.nextLine();

    }

    void showMenu() {
        System.out.println("========================================================================================");
        System.out.println("[1] Thêm Hàng Hóa.");
        System.out.println("[2] Xóa Hàng Hóa.");
        System.out.println("[3] Sửa Hàng Hóa.");
        System.out.println("[4] Tìm kiếm theo (1 - LOẠI) (2 - GIÁ) (3 - NGÀY).");
        System.out.println("[5] Sắp xếp theo (1 - GIÁ) (2 - NGÀY) (3 -  LOẠI ) (4 - LOẠI & NGÀY ) (5 - LOẠI & GIÁ).");
        System.out.println("[6] Thống kê (1 - Tổng Số Lượng Hàng Hóa) (2 - Tổng Giá Trị Nhập Kho) (3 - Số Lượng Từng Loại Hàng).");
        System.out.println("[7] In danh sách sản phẩm.");
        System.out.println("[0] Thoát chương trình.");
        System.out.println("========================================================================================");
    }

    // Thuật toán nhập vào đuôi
    void add(String nameProduct, String typeProduct, String idProduct, int priceProduct, int inventory, String dateProduct){
        Node newNode = new Node(nameProduct, typeProduct, idProduct, priceProduct, inventory, dateProduct);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    // Nhập từ bàn phím
    void addImport() {
        boolean key = true,
                loop = true;
        String moreCondition;

        while(key){
            System.out.println("Nhập Thông Tin Hàng Hóa");
            System.out.print("Loại: ");
            typeProduct = input.nextLine();

            System.out.print("Mã Hàng: ");
            idProduct = input.nextLine();

            System.out.print("Tên Hàng Hóa: ");
            nameProduct = input.nextLine();

            System.out.print("Giá nhập: ");
            priceProduct = input.nextInt();

            System.out.print("Số lượng tồn kho: ");
            inventory = input.nextInt();

            String catchEnter = input.nextLine();
            System.out.print("Ngày nhập [Ngày/Tháng/Năm]:");
            dateProduct = input.nextLine();
            
            loop = true;

            add(nameProduct, typeProduct, idProduct, priceProduct, inventory, dateProduct);

            while(loop){
                System.out.print("Bạn có muốn nhập thêm không (Y/N): ");
                moreCondition = input.nextLine();
                
                if(moreCondition.equalsIgnoreCase("y")){
                    loop = false;
                } else if(moreCondition.equalsIgnoreCase("n")){
                    loop = false;
                    key = false;
                } else {
                    System.out.println("Tôi không hiểu ý bạn!");
                }
            }
        }
    }

    //Thuật toán xóa
    Node removeAtHead() {
        if (head != null) {
            head = head.next;
            System.out.println("Đã xóa thành công!");
        }
        return head;
    }

    Node removeAtTail() {
        Node lastNode = head;
        Node prevNode = null;

        if (lastNode == null) {
            return null;
        }

        while (lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }

        if (prevNode == null) {
            lastNode = null;
        } else {
            prevNode.next = lastNode.next;
        }

        return lastNode;
    }

    Node removeAtM(String ID) {
        Node currNode = head;
        Node prevNode = null;
        int count = 0;

        while (currNode != null) {
            if (ID.equalsIgnoreCase(currNode.idProduct)) {
                break;
            }
            prevNode = currNode;
            currNode = currNode.next;
            count++;
        }

        if (currNode == null) {
            System.out.println("ID không tồn tại!");
        } else if (count == 0) {
            removeAtHead();
        } else if (ID.equalsIgnoreCase(currNode.idProduct)) {
            prevNode.next = currNode.next;
            System.out.println("Đã xóa thành công!");
        }

        return currNode;
    }
    
    void removeAll(){
            if(head != null){
                head = null;
            }
        }

    void importRemove() {
        System.out.print("Nhập mã hàng cần xóa: ");
        String ID = input.nextLine();

        removeAtM(ID);
    }

    //Thuật toán sửa
    Node replace(String ID) {
        Node currNode = head;
        boolean breakCondition = false;

        while(currNode != null){
            if(ID.equalsIgnoreCase(currNode.idProduct)){
                breakCondition = true;
                break;
            }
            currNode = currNode.next;
        }
        if(breakCondition){
            System.out.print("Loại: ");
            currNode.typeProduct = input.nextLine();

            System.out.print("Mã Hàng: ");
            currNode.idProduct = input.nextLine();

            System.out.print("Tên Hàng Hóa: ");
            currNode.nameProduct = input.nextLine();

            System.out.print("Giá nhập: ");
            currNode.priceProduct = input.nextInt();

            System.out.print("Số lượng tồn kho: ");
            currNode.inventory = input.nextInt();

            String catchEnter = input.nextLine();
            System.out.print("Ngày nhập [Date Month Year] : ");
            currNode.dateProduct = input.nextLine();
        } else {
            System.out.println("ID không tồn tại!");
        }

        return currNode;
    }

    void importReplace() {
        System.out.print("Nhập mã cần sửa: ");
        String ID = input.nextLine();

        replace(ID);
    }

    //Thuật toán tìm kiếm
    void findType(String TYPE) throws ParseException{
        Node currNode = head;
        boolean checkNull = true;

        while(currNode != null){
            if(TYPE.equalsIgnoreCase(currNode.typeProduct)){
                System.out.println("\n\tFound! - Print out infomation:");
                System.out.println("Loại: " + currNode.typeProduct);
                System.out.println("Giá: " +  currNode.priceProduct + " VNĐ");
                System.out.println("Mã hàng: " + currNode.idProduct);
                System.out.println("Tên hàng hóa: " + currNode.nameProduct);
                System.out.println("Số lượng tồn kho: " + currNode.inventory);

                Date parString = parDate.parse(currNode.dateProduct);
                System.out.println("Ngày nhập kho: " + parString);
            }
            currNode = currNode.next;
        }

        if(checkNull){
            System.out.println("\nKhông tìm thấy!");
        }
    }

    void importfindType() throws ParseException{

        System.out.print("Nhập loại cần tìm: ");
        String TYPE = input.nextLine();

        findType(TYPE);
    }

    void findPrice(int PRICE) throws ParseException{
        Node currNode = head;
        boolean checkNull = true;

        while(currNode != null){
            if(currNode.priceProduct == PRICE){
                System.out.println("\n\tThông tin trùng khớp");
                System.out.println("Loại: " + currNode.typeProduct);
                System.out.println("Giá: " +  currNode.priceProduct + " VNĐ");
                System.out.println("Mã hàng: " + currNode.idProduct);
                System.out.println("Tên hàng hóa: " + currNode.nameProduct);
                System.out.println("Số lượng tồn kho: " + currNode.inventory);

                Date parString = parDate.parse(currNode.dateProduct);
                System.out.println("Ngày nhập kho: " + parString);
                checkNull = false;
            }
            currNode = currNode.next;
        }

        if(checkNull){
            System.out.println("\nKhông tìm thấy!");
        }
    }

    void importFindPrice() throws ParseException{
        System.out.print("Nhập giá cần tìm: ");
        int PRICE = input.nextInt();

        findPrice(PRICE);
    }
    
    void findPriceFT(int FROM, int TO) throws ParseException{
        Node currNode = head;
        boolean checkNull = true;

        
        while(currNode != null){

            if(FROM == TO){
                findPrice(FROM);
                checkNull = false;
                break;
            }

            if(FROM < TO){
                if(FROM <= currNode.priceProduct && TO >= currNode.priceProduct){
                    System.out.println("\nFound! - Print out infomation:");
                    System.out.println("Loại: " + currNode.typeProduct);
                    System.out.println("Giá: " +  currNode.priceProduct + " VNĐ");
                    System.out.println("Mã hàng: " + currNode.idProduct);
                    System.out.println("Tên hàng hóa: " + currNode.nameProduct);
                    System.out.println("Số lượng tồn kho: " + currNode.inventory);
    
                    Date parString = parDate.parse(currNode.dateProduct);
                    System.out.println("Ngày nhập kho: " + parString);
                    checkNull = false;
                }
            }

            if(FROM > TO){
                if(FROM >= currNode.priceProduct && TO <= currNode.priceProduct){
                    System.out.println("\nFound! - Print out infomation:");
                    System.out.println("Loại: " + currNode.typeProduct);
                    System.out.println("Giá: " +  currNode.priceProduct + " VNĐ");
                    System.out.println("Mã hàng: " + currNode.idProduct);
                    System.out.println("Tên hàng hóa: " + currNode.nameProduct);
                    System.out.println("Số lượng tồn kho: " + currNode.inventory);
    
                    Date parString = parDate.parse(currNode.dateProduct);
                    System.out.println("Ngày nhập kho: " + parString);
                    checkNull = false;
                }
            }
            currNode = currNode.next;
    }
        if(checkNull){
            System.out.println("\nKhông tìm thấy!");
        }
}

    void importfindPriceFT() throws ParseException{
        System.out.println("Nhập giá cần tìm");

        System.out.print("Từ: ");
        int FROM = input.nextInt();

        System.out.print("Đến: ");
        int TO = input.nextInt();

        findPriceFT(FROM, TO);
    }

    void findDate(String date_String) throws ParseException {
        Node currNode = head;

        while(currNode != null){
            if(date_String.equalsIgnoreCase(currNode.dateProduct)){
                break;
            }

            currNode = currNode.next;
        }

        if(date_String.equalsIgnoreCase(currNode.dateProduct)){
            System.out.println("\nThông tin hàng hóa");
            System.out.println("Loại: " + currNode.typeProduct);
            System.out.println("Giá: " +  currNode.priceProduct + " VNĐ");
            System.out.println("Mã hàng: " + currNode.idProduct);
            System.out.println("Tên hàng hóa: " + currNode.nameProduct);
            System.out.println("Số lượng tồn kho: " + currNode.inventory);

            Date parseString = parDate.parse(currNode.dateProduct);
            System.out.println("Ngày nhập kho: " + parseString);
        }
    }

    void importFindDate() throws ParseException {
        System.out.print("Nhập ngày cần tìm [Ngày/Tháng/Năm]: ");
        String date_String = input.nextLine();

        findDate(date_String);
    }

    void findDateFT(String FROM, String TO) throws ParseException {
        Node currNode = head;

        Date date1,
             date2,
             date3;
        
        date2 = parDate.parse(FROM);
        date3 = parDate.parse(TO);

        while(currNode != null){
            date1 = parDate.parse(currNode.dateProduct);

            if(date2.before(date3)){
                if(date1.after(date2) && date1.before(date3)){
                    System.out.println("\nThông tin hàng hóa");
                    System.out.println("Loại: " + currNode.typeProduct);
                    System.out.println("Giá: " +  currNode.priceProduct + " VNĐ");
                    System.out.println("Mã hàng: " + currNode.idProduct);
                    System.out.println("Tên hàng hóa: " + currNode.nameProduct);
                    System.out.println("Số lượng tồn kho: " + currNode.inventory);
                    System.out.println("Ngày nhập kho: " + date1);
                }
            }

            if(date2.after(date3)){
                if(date1.before(date2) && date1.after(date3)){
                    System.out.println("\nThông tin hàng hóa");
                    System.out.println("Loại: " + currNode.typeProduct);
                    System.out.println("Giá: " +  currNode.priceProduct + " VNĐ");
                    System.out.println("Mã hàng: " + currNode.idProduct);
                    System.out.println("Tên hàng hóa: " + currNode.nameProduct);
                    System.out.println("Số lượng tồn kho: " + currNode.inventory);
                    System.out.println("Ngày nhập kho: " + date1);
                }
            }

            if(date2 == date3){
                findDate(FROM);
            }

            currNode = currNode.next;
        }
    }

    void importFindDateFT() throws ParseException {
        System.out.println("Nhập ngày cần tìm [NGÀY/THÁNG/NĂM]");
        System.out.print("Từ ngày: ");
        String FROM = input.nextLine();

        System.out.print("Đến ngày:");
        String TO = input.nextLine();

        findDateFT(FROM, TO);
    }
    
    //Thuật toán sắp xếp
    void sortPriceUp(){
        Node currNode = head;
        Node nextNode = null;

        String tempName = null,
               tempType = null,
               tempID = null,
               tempDate = null;
        int tempInventory,
            tempPrice;

        boolean checkNull = false;

        if(head == null){
            System.out.println("Kho rỗng!");
        } else {
            while(currNode != null){

                nextNode = currNode.next;

                while(nextNode != null){
                    if(currNode.priceProduct > nextNode.priceProduct){

                        tempName = currNode.nameProduct;
                        tempType = currNode.typeProduct;
                        tempID = currNode.idProduct;
                        tempPrice = currNode.priceProduct;
                        tempInventory = currNode.inventory;
                        tempDate = currNode.dateProduct;

                        currNode.nameProduct = nextNode.nameProduct;
                        currNode.typeProduct = nextNode.typeProduct;
                        currNode.idProduct = nextNode.idProduct;
                        currNode.priceProduct = nextNode.priceProduct;
                        currNode.inventory = nextNode.inventory;
                        currNode.dateProduct = tempDate;

                        nextNode.nameProduct = tempName;
                        nextNode.typeProduct = tempType;
                        nextNode.idProduct = tempID;
                        nextNode.priceProduct = tempPrice;
                        nextNode.inventory = tempInventory;
                        nextNode.dateProduct = tempDate;

                        checkNull = true;
                }
                    nextNode = nextNode.next;
                }
                currNode = currNode.next;
        }
    }

    if(checkNull){
        System.out.println("Đã sắp xếp thành công!");
    }
}

    void sortPriceDown(){
        Node currNode = head;
        Node nextNode = null;

        String tempName = null,
               tempType = null,
               tempID = null,
               tempDate = null;
        int tempInventory,
            tempPrice;

        boolean checkNull = false;

        if(head == null){
            System.out.println("Kho rỗng!");
        } else {
            while(currNode != null){

                nextNode = currNode.next;

                while(nextNode != null){
                    if(currNode.priceProduct < nextNode.priceProduct){

                        tempName = currNode.nameProduct;
                        tempType = currNode.typeProduct;
                        tempID = currNode.idProduct;
                        tempPrice = currNode.priceProduct;
                        tempInventory = currNode.inventory;
                        tempDate = currNode.dateProduct;

                        currNode.nameProduct = nextNode.nameProduct;
                        currNode.typeProduct = nextNode.typeProduct;
                        currNode.idProduct = nextNode.idProduct;
                        currNode.priceProduct = nextNode.priceProduct;
                        currNode.inventory = nextNode.inventory;
                        currNode.dateProduct = tempDate;

                        nextNode.nameProduct = tempName;
                        nextNode.typeProduct = tempType;
                        nextNode.idProduct = tempID;
                        nextNode.priceProduct = tempPrice;
                        nextNode.inventory = tempInventory;
                        nextNode.dateProduct = tempDate;

                        checkNull = true;
                }
                nextNode = nextNode.next;
            }
            currNode = currNode.next;
        }
    }
    if(checkNull){
        System.out.println("Đã sắp xếp thành công!");
    }
}

    void sortDateUp() throws ParseException{
        Node currNode = head;
        Node nextNode = null;

        String tempName = null,
               tempType = null,
               tempID = null,
               tempDate = null;
        int tempInventory,
            tempPrice;

        boolean checkNull = false;

        Date date1,
             date2;
        
        if(head == null){
            System.out.println("Kho rỗng!");
        } else {
            while(currNode != null){

            nextNode = currNode.next;

            while(nextNode != null){                
                date1 = parDate.parse(currNode.dateProduct);
                date2 = parDate.parse(nextNode.dateProduct);

                if(date1.after(date2)){
                tempName = currNode.nameProduct;
                tempType = currNode.typeProduct;
                tempID = currNode.idProduct;
                tempPrice = currNode.priceProduct;
                tempInventory = currNode.inventory;
                tempDate = currNode.dateProduct;


                currNode.nameProduct = nextNode.nameProduct;
                currNode.typeProduct = nextNode.typeProduct;
                currNode.idProduct = nextNode.idProduct;
                currNode.priceProduct = nextNode.priceProduct;
                currNode.inventory = nextNode.inventory;
                currNode.dateProduct = nextNode.dateProduct;

                nextNode.nameProduct = tempName;
                nextNode.typeProduct = tempType;
                nextNode.idProduct = tempID;
                nextNode.priceProduct = tempPrice;
                nextNode.inventory = tempInventory;
                nextNode.dateProduct = tempDate;

                checkNull = true;
            }
            nextNode = nextNode.next;
        }
            currNode = currNode.next;
        }
    }   
        if(checkNull){
            System.out.println("\nĐã sắp xếp thành công!");
        }
}

    void sortDateDown() throws ParseException{
        Node currNode = head;
        Node nextNode = null;

        String tempName = null,
               tempType = null,
               tempID = null,
               tempDate = null;
        int tempInventory,
            tempPrice;

        boolean checkNull = false;

        Date date1,
             date2;
        
        if(head == null){
            System.out.println("Kho rỗng!");
        } else {
            while(currNode != null){

            nextNode = currNode.next;

            while(nextNode != null){                
                date1 = parDate.parse(currNode.dateProduct);
                date2 = parDate.parse(nextNode.dateProduct);

                if(date1.before(date2)){
                tempName = currNode.nameProduct;
                tempType = currNode.typeProduct;
                tempID = currNode.idProduct;
                tempPrice = currNode.priceProduct;
                tempInventory = currNode.inventory;
                tempDate = currNode.dateProduct;


                currNode.nameProduct = nextNode.nameProduct;
                currNode.typeProduct = nextNode.typeProduct;
                currNode.idProduct = nextNode.idProduct;
                currNode.priceProduct = nextNode.priceProduct;
                currNode.inventory = nextNode.inventory;
                currNode.dateProduct = nextNode.dateProduct;

                nextNode.nameProduct = tempName;
                nextNode.typeProduct = tempType;
                nextNode.idProduct = tempID;
                nextNode.priceProduct = tempPrice;
                nextNode.inventory = tempInventory;
                nextNode.dateProduct = tempDate;

                checkNull = true;
            }
            nextNode = nextNode.next;
        }
            currNode = currNode.next;
        }
    } 
        if(checkNull){
            System.out.println("\nĐã sắp xếp thành công!");
        }
}

    void sortType(Products products) throws ParseException {
        Node currNode = head;

        Products FoodProducts = new Products();
        Products CrockeryProducts = new Products();
        Products ElectricProducts = new Products();

        while(currNode != null){

            if(currNode.typeProduct.equalsIgnoreCase("Thuc Pham")){
                FoodProducts.add(currNode.nameProduct, currNode.typeProduct, currNode.idProduct, currNode.priceProduct, currNode.inventory, currNode.dateProduct);
            }

            if(currNode.typeProduct.equalsIgnoreCase("Sanh Su")){
                CrockeryProducts.add(currNode.nameProduct, currNode.typeProduct, currNode.idProduct, currNode.priceProduct, currNode.inventory, currNode.dateProduct);
            }

            if(currNode.typeProduct.equalsIgnoreCase("Dien May")){
                ElectricProducts.add(currNode.nameProduct, currNode.typeProduct, currNode.idProduct, currNode.priceProduct, currNode.inventory, currNode.dateProduct);
            }

            currNode = currNode.next;
        }

        products.removeAll();

        Node currNode_Food = FoodProducts.head;
        Node currNode_Crockery = CrockeryProducts.head;
        Node currNode_Electric = ElectricProducts.head;

        while(currNode_Food != null){
            products.add(currNode_Food.nameProduct, currNode_Food.typeProduct, currNode_Food.idProduct, currNode_Food.priceProduct, currNode_Food.inventory, currNode_Food.dateProduct);
            currNode_Food = currNode_Food.next;
        }

        while(currNode_Crockery != null){
            products.add(currNode_Crockery.nameProduct, currNode_Crockery.typeProduct, currNode_Crockery.idProduct, currNode_Crockery.priceProduct, currNode_Crockery.inventory, currNode_Crockery.dateProduct);
            currNode_Crockery = currNode_Crockery.next;
        }

        while(currNode_Electric != null){
            products.add(currNode_Electric.nameProduct, currNode_Electric.typeProduct, currNode_Electric.idProduct, currNode_Electric.priceProduct, currNode_Electric.inventory, currNode_Electric.dateProduct);
            currNode_Electric = currNode_Electric.next;
        }
    }

    void sortTypeDate(Products products, int userSort_Option) throws ParseException {
        Node currNode = head;

        Products FoodProducts = new Products();
        Products CrockeryProducts = new Products();
        Products ElectricProducts = new Products();

        while(currNode != null){

            if(currNode.typeProduct.equalsIgnoreCase("Thuc Pham")){
                FoodProducts.add(currNode.nameProduct, currNode.typeProduct, currNode.idProduct, currNode.priceProduct, currNode.inventory, currNode.dateProduct);
            }

            if(currNode.typeProduct.equalsIgnoreCase("Sanh Su")){
                CrockeryProducts.add(currNode.nameProduct, currNode.typeProduct, currNode.idProduct, currNode.priceProduct, currNode.inventory, currNode.dateProduct);
            }

            if(currNode.typeProduct.equalsIgnoreCase("Dien May")){
                ElectricProducts.add(currNode.nameProduct, currNode.typeProduct, currNode.idProduct, currNode.priceProduct, currNode.inventory, currNode.dateProduct);
            }

            currNode = currNode.next;
        }

        // UserSort_Option = 1 => SortUpDate
        // UserSort_Option = 2 => SortDownDate
        if(userSort_Option == 1){
            FoodProducts.sortDateUp();
            CrockeryProducts.sortDateUp();
            ElectricProducts.sortDateUp();
        }

        if(userSort_Option == 2){
            FoodProducts.sortDateDown();
            CrockeryProducts.sortDateDown();
            ElectricProducts.sortDateDown();
        }

        products.removeAll();

        Node currNode_Food = FoodProducts.head;
        Node currNode_Crockery = CrockeryProducts.head;
        Node currNode_Electric = ElectricProducts.head;

        while(currNode_Food != null){
            products.add(currNode_Food.nameProduct, currNode_Food.typeProduct, currNode_Food.idProduct, currNode_Food.priceProduct, currNode_Food.inventory, currNode_Food.dateProduct);
            currNode_Food = currNode_Food.next;
        }

        while(currNode_Crockery != null){
            products.add(currNode_Crockery.nameProduct, currNode_Crockery.typeProduct, currNode_Crockery.idProduct, currNode_Crockery.priceProduct, currNode_Crockery.inventory, currNode_Crockery.dateProduct);
            currNode_Crockery = currNode_Crockery.next;
        }

        while(currNode_Electric != null){
            products.add(currNode_Electric.nameProduct, currNode_Electric.typeProduct, currNode_Electric.idProduct, currNode_Electric.priceProduct, currNode_Electric.inventory, currNode_Electric.dateProduct);
            currNode_Electric = currNode_Electric.next;
        }
    }

    void sortTypePrice(Products products, int userSort_Option){
        Node currNode = head;

        Products FoodProducts = new Products();
        Products CrockeryProducts = new Products();
        Products ElectricProducts = new Products();

        while(currNode != null){

            if(currNode.typeProduct.equalsIgnoreCase("Thuc Pham")){
                FoodProducts.add(currNode.nameProduct, currNode.typeProduct, currNode.idProduct, currNode.priceProduct, currNode.inventory, currNode.dateProduct);
            }

            if(currNode.typeProduct.equalsIgnoreCase("Sanh Su")){
                CrockeryProducts.add(currNode.nameProduct, currNode.typeProduct, currNode.idProduct, currNode.priceProduct, currNode.inventory, currNode.dateProduct);
            }

            if(currNode.typeProduct.equalsIgnoreCase("Dien May")){
                ElectricProducts.add(currNode.nameProduct, currNode.typeProduct, currNode.idProduct, currNode.priceProduct, currNode.inventory, currNode.dateProduct);
            }

            currNode = currNode.next;
        }

        // UserSort_Option = 1 => SortPriceUp
        // UserSort_Option = 2 => SortPriceDown
        if(userSort_Option == 1){
            FoodProducts.sortPriceUp();
            CrockeryProducts.sortPriceUp();
            ElectricProducts.sortPriceUp();
        }

        if(userSort_Option == 2){
            FoodProducts.sortPriceDown();
            CrockeryProducts.sortPriceDown();
            ElectricProducts.sortPriceDown();
        }

        products.removeAll();

        Node currNode_Food = FoodProducts.head;
        Node currNode_Crockery = CrockeryProducts.head;
        Node currNode_Electric = ElectricProducts.head;

        while(currNode_Food != null){
            products.add(currNode_Food.nameProduct, currNode_Food.typeProduct, currNode_Food.idProduct, currNode_Food.priceProduct, currNode_Food.inventory, currNode_Food.dateProduct);
            currNode_Food = currNode_Food.next;
        }

        while(currNode_Crockery != null){
            products.add(currNode_Crockery.nameProduct, currNode_Crockery.typeProduct, currNode_Crockery.idProduct, currNode_Crockery.priceProduct, currNode_Crockery.inventory, currNode_Crockery.dateProduct);
            currNode_Crockery = currNode_Crockery.next;
        }

        while(currNode_Electric != null){
            products.add(currNode_Electric.nameProduct, currNode_Electric.typeProduct, currNode_Electric.idProduct, currNode_Electric.priceProduct, currNode_Electric.inventory, currNode_Electric.dateProduct);
            currNode_Electric = currNode_Electric.next;
        }
    }

    //Thuật toán thống kê
    void statProducts() throws ParseException{
        Node currNode = head;
        int count = 0;
        
        while(currNode != null){
            count++;
            currNode = currNode.next;
        }

        if(count != 0){
            inThongTin();
        } else {
            System.out.println("Kho rỗng!");
        }

        System.out.println("Tổng số lượng hàng hóa: " + count + " Sản Phẩm\n");
    }

    void statPrice(){
        Node currNode = head;
        long result = 0;

        if(currNode == null){
            System.out.println("Kho rỗng!");
        }

        // (Giá nhập * Số lượng tồn kho)  
        while(currNode != null){            
            result = (int)(currNode.priceProduct * currNode.inventory) + result;
            currNode = currNode.next;
        }

        System.out.println("Tổng giá trị nhập kho: " + result + " VND");
    }

    void statType(){
        Node currNode = head;
        int food =0,
            crock = 0,
            elec = 0;
        boolean key = true;

        if(currNode == null){
            System.out.println("Kho rỗng!");
        }

        while(currNode != null){
            if(currNode.typeProduct.equalsIgnoreCase("Thuc Pham")){
                food++;
                key = false;
            } else if(currNode.typeProduct.equalsIgnoreCase("Sanh Su")){
                crock++;
                key = false;
            } else if(currNode.typeProduct.equalsIgnoreCase("Dien May")){
                elec++;
                key = false;
            }
            currNode = currNode.next;
        }

        if(key){
            System.out.println("Không tìm thấy kết quả!");
        } else {
            System.out.println("Tổng số lượng hàng Thực phẩm: " + food);
            System.out.println("Tổng số lượng hàng Sành sứ: " + crock);
            System.out.println("Tổng số lượng hàng Điện máy: " + elec);
        }
    }
}
/* Vẫn đang lỗi UTF-8 Font, không thể debug một số tính năng */