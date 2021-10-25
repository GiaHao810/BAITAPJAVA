package com.haobg2004110027.Baihoc.tuan7;

public class MyLinkedList {
    
    Node head = null;
    Node tail = null;

    public MyLinkedList(){}
    


    void addtoHead(String data){
        //Tạo 1 Node mới
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            head.next = head;
            head = newNode;
        }
    }
    void addtoTail(String data){
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
  
    void remove(){
        
    }
    
}
