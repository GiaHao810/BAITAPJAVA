package com.haobg2004110027.FinalExam3;

import java.util.Scanner;

public class Products {

    Scanner input = new Scanner(System.in);

    Node head = null;
    Node tail = null;

    String nameProduct, typeProduct;
    int idProduct, priceProduct, inventory;
    int date, month, year;

    void Product() {}

    void Product(String nameProduct, String typeProduct, int idProduct, int priceProduct, int inventory, int date, int month, int year) {
        this.nameProduct = nameProduct;
        this.idProduct = idProduct;
        this.inventory = inventory;
        this.priceProduct = priceProduct;
        this.typeProduct = typeProduct;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    void inThongTin() {
        Node current = head;

        if (current == null) {
            System.out.println("Danh sách rỗng!");
        }
        while (current != null) {
            System.out.println("\nThông tin hàng hóa");
            System.out.println("Loại: " + current.typeProduct);
            System.out.println("Giá: " + current.priceProduct + " VNĐ");
            System.out.println("Mã hàng: " + current.idProduct);
            System.out.println("Tên hàng hóa: " + current.nameProduct);
            System.out.println("Số lượng tồn kho: " + current.inventory);
            System.out.println("Ngày nhập kho: " + current.date + "/" + current.month + "/" + current.year);
            current = current.next;
        }

    }

    void delay() {
        System.out.println("\nNhấn Enter để tiếp tục");
        String delay = input.nextLine();
    }

    void showMenu() {
        System.out.println("[1] Thêm Hàng Hóa");
        System.out.println("[2] Xóa Hàng Hóa");
        System.out.println("[3] Sửa Hàng Hóa");
        System.out.println("[4] Tìm kiếm theo (1 - LOẠI) (2 - GIÁ) (3 - NGÀY NHẬP)");
        // Tìm theo Khoảng giá từ ... đến ...
        // Tìm theo Khoảng ngày từ ... đến ...
        System.out.println("[5] Sắp xếp theo (1 -TĂNG DẦN) (2 - GIẢM DẦN) (3 - LOẠI & NGÀY NHẬP) (4 - LOẠI & GIÁ)");
        System.out.println("[6] Thống kê (1 - Tổng Số Lượng Hàng Hóa) (2 - Tổng Giá Trị Nhập Kho) (3 - Số Lượng Từng Loại Hàng)");
        System.out.println("[0] Thoát chương trình");

    }

    // Thuật toán nhập vào đuôi
    void add(String nameProduct, String typeProduct, int idProduct, int priceProduct, int inventory, int date, int month, int year){
        Node newNode = new Node(nameProduct, typeProduct, idProduct, priceProduct, inventory, date, month, year);

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
                loop = true,
                time = true;
        String more;

        while(key){
            System.out.println("Nhập Thông Tin Hàng Hóa");
            System.out.print("Loại: ");
            typeProduct = input.next();

            System.out.print("Mã Hàng: ");
            idProduct = input.nextInt();

            System.out.print("Tên Hàng Hóa: ");
            nameProduct = input.next();

            System.out.print("Giá nhập: ");
            priceProduct = input.nextInt();

            System.out.print("Số lượng tồn kho: ");
            inventory = input.nextInt();

            time = true;

            while(time){
                System.out.print("Ngày nhập [Date Month Year] : ");
                date = input.nextInt();
                month = input.nextInt();
                year = input.nextInt();
                if(date <= 30 && month <= 30){
                    time = false;
                } else {
                    System.out.println("Ngày tháng không hợp lệ!");
                }
            }
            
            loop = true;
            
            System.out.println("");

            add(nameProduct, typeProduct, idProduct, priceProduct, inventory, date, month, year);

            while(loop){
                System.out.print("Bạn có muốn nhập thêm không (Y/N): ");
                more = input.next();
                
                if(more.equalsIgnoreCase("y")){
                    loop = false;
                } else if(more.equalsIgnoreCase("n")){
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

    Node removeAtM(int X) {
        Node currNode = head;
        Node prevNode = null;
        int count = 0;

        while (currNode != null) {
            if (X == currNode.idProduct) {
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
        } else if (X == currNode.idProduct) {
            prevNode.next = currNode.next;
            System.out.println("Đã xóa thành công!");
        }

        return currNode;
    }

    void importRemove() {
        System.out.print("Nhập mã hàng cần xóa: ");
        int X = input.nextInt();

        removeAtM(X);
    }

    //Thuật toán sửa
    Node replace(int X){
        Node currNode = head;
        Node prevNode = null;

        while(currNode != null){
            if(X == currNode.idProduct){
                break;
            }
            prevNode = currNode;
            currNode = currNode.next;
        }

        if(X == currNode.idProduct){
            System.out.print("Loại: ");
            currNode.typeProduct = input.next();

            System.out.print("Mã Hàng: ");
            currNode.idProduct = input.nextInt();

            System.out.print("Tên Hàng Hóa: ");
            currNode.nameProduct = input.next();

            System.out.print("Giá nhập: ");
            currNode.priceProduct = input.nextInt();

            System.out.print("Số lượng tồn kho: ");
            currNode.inventory = input.nextInt();

            System.out.print("Ngày nhập [Date Month Year] : ");
            currNode.date = input.nextInt();
            currNode.month = input.nextInt();
            currNode.year = input.nextInt();

        } else {
            System.out.println("ID không tồn tại");
        }

        return currNode;
    }

    void importReplace(){
        System.out.print("Nhập mã cần sửa: ");
        int X = input.nextInt();

        replace(X);
    }

    //Thuật toán tìm kiếm
    void findType(String type){
        Node currNode = head;
        Node prevNode = null;
        boolean key = true;

        while(currNode != null){
            if(type.equalsIgnoreCase(currNode.typeProduct)){
                System.out.println("\nFound! - Print out infomation:");
                System.out.println("Loại: " + currNode.typeProduct);
                System.out.println("Giá: " + currNode.priceProduct + " VNĐ");
                System.out.println("Mã hàng: " + currNode.idProduct);
                System.out.println("Tên hàng hóa: " + currNode.nameProduct);
                System.out.println("Số lượng tồn kho: " + currNode.inventory);
                System.out.println("Ngày nhập kho: " + currNode.date + "/" + currNode.month + "/" + currNode.year);
                key = false;
            }
            prevNode = currNode;
            currNode = currNode.next;
        }

        if(key){
            System.out.println("\nNone exist!");
        }
    }

    void importfindType(){
        System.out.print("Nhập loại cần tìm: ");
        String type = input.next();

        findType(type);
    }

    void findPrice(int from, int to){
        Node currNode = head;
        boolean key = true;

        while(currNode != null){
            if(from <= currNode.priceProduct && to >= currNode.priceProduct){
                System.out.println("\nFound! - Print out infomation:");
                System.out.println("Loại: " + currNode.typeProduct);
                System.out.println("Giá: " + currNode.priceProduct + " VNĐ");
                System.out.println("Mã hàng: " + currNode.idProduct);
                System.out.println("Tên hàng hóa: " + currNode.nameProduct);
                System.out.println("Số lượng tồn kho: " + currNode.inventory);
                System.out.println("Ngày nhập kho: " + currNode.date + "/" + currNode.month + "/" + currNode.year);
                key = false;
            }
            currNode = currNode.next;
        }

        if(key){
            System.out.println("\nNone exist!");
        }
    }

    void importfindPrice(){
        System.out.println("Nhập giá cần tìm: ");
        System.out.print("Từ: ");
        int from = input.nextInt();
        System.out.print("Đến: ");
        int to = input.nextInt();

        findPrice(from, to);
    }

    void findDate(){
        
    }

    //Thuật toán sắp xếp
    void sortUp(){
        Node currNode = head;

        int count = 0;

        while(currNode != head){
            currNode = currNode.next;
            count++;
        }

        currNode = head;

        for (int i = 1; i <= count - 1; i++) {
            for(int j = i + 1; j <= count; j++){
                
            }
        }
    }

    void sortDown(){
        Node currNode = head;
        Node nextNode = null;
        Node tempNode = head;

        if(head == null){
            return;
        } else {
            while(currNode != null){

                nextNode = currNode.next;

                while(nextNode != null){
                    if(nextNode.priceProduct > currNode.priceProduct){
                        tempNode.idProduct = currNode.idProduct;
                        tempNode.nameProduct = currNode.nameProduct;
                        tempNode.inventory = currNode.inventory;
                        tempNode.priceProduct = currNode.priceProduct;
                        tempNode.typeProduct = currNode.typeProduct;

                        currNode.idProduct = nextNode.idProduct;
                        currNode.nameProduct = nextNode.nameProduct;
                        currNode.inventory = nextNode.inventory;
                        currNode.priceProduct = nextNode.priceProduct;
                        currNode.typeProduct = nextNode.typeProduct;

                        nextNode.idProduct = tempNode.idProduct;
                        nextNode.nameProduct = tempNode.nameProduct;
                        nextNode.inventory = tempNode.inventory;
                        nextNode.priceProduct = tempNode.priceProduct;
                        nextNode.typeProduct = tempNode.typeProduct;
                }
                nextNode = nextNode.next;
            }
            currNode = currNode.next;
        }
    }
}

    void sortDate(){

    }

    void sortTypeDate(){

    }

    void sortTypePrice(){

    }

    //Thuật toán thống kê
    void statProducts(){
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
        int result = 0;

        if(currNode == null){
            System.out.println("Kho rỗng!");
        }

        // (Giá nhập * Số lượng tồn kho)  
        while(currNode != null){            
            result = (currNode.priceProduct * currNode.inventory) + result;
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
            if(currNode.typeProduct.equalsIgnoreCase("Thực phẩm")){
                food++;
                key = false;
            } else if(currNode.typeProduct.equalsIgnoreCase("sành sứ")){
                crock++;
                key = false;
            } else if(currNode.typeProduct.equalsIgnoreCase("điện máy")){
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