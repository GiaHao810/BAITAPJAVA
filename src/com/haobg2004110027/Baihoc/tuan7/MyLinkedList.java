package com.haobg2004110027.Baihoc.tuan7;

import java.util.Scanner;

public class MyLinkedList {
    
    Node head = null;
    Node tail = null;

    public MyLinkedList(){}

    void addtoHead(int data){
        //Tạo 1 Node mới
        Node newNode = new Node(data);

        if(head == null){ //Thêm 1 nút vào danh sách rỗng
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void addtoTail(int data){
        //Tạo 1 Node mới
        Node newNode = new Node(data);

        if(head == null){// Thêm 1 nút vào danh sách rỗng
            head = newNode;
            tail = newNode;
        }else{ // Danh sách không rỗng - thêm vào ĐUÔI danh sách
            tail.next = newNode;
            tail = newNode;
        }
    }

    void print(){
        Node current = head;

        if(head == null){
            System.out.println("Danh sách rỗng.");
            return;
        }

        System.out.println("Danh sách các nút:");
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
  
    void remove(String data, String x){
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập data cần xóa: ");
        x = input.next();

        if(x == data){
            
        }

        input.close();
    }

    void sortDown(){
        Node currNode = head;
        Node nextNode = null;
        int tempNode;

        if(head == null){
            System.out.println("Kho rỗng!");
        } else {
            while(currNode != null){

                nextNode = currNode.next;

                while(nextNode != null){
                    if(currNode.data < nextNode.data){
                        tempNode = currNode.data;
                        
                        currNode.data = nextNode.data;

                        nextNode.data = tempNode;

                }
                nextNode = nextNode.next;
            }
            currNode = currNode.next;
        }
    }
}
    
}
