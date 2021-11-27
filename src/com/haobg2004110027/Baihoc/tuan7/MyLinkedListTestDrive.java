package com.haobg2004110027.Baihoc.tuan7;

import java.util.Scanner;

public class MyLinkedListTestDrive {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        Scanner input = new Scanner(System.in);

        System.out.print("Bao nhiêu data: ");
        int x = input.nextInt();

        for(int i = 0; i < x; i++){
            System.out.print("Nhập data: ");
            String name = input.next();
            myLinkedList.addtoHead(name);
        }

        //myLinkedList.addtoHead("Xin chào");
        //myLinkedList.addtoHead("Tôi là Hào");
        //myLinkedList.addtoHead("Tôi năm nay 18 tủi");
        
        //myLinkedList.addtoTail("Xin chào");
        //myLinkedList.addtoTail("Tôi là Hào");
        //myLinkedList.addtoTail("Tôi năm nay 18 tủi");

        myLinkedList.print();

        input.close();
    }
}
