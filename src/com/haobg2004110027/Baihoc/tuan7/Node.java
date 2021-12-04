package com.haobg2004110027.Baihoc.tuan7;

public class Node {
    
    //Nội dung
    int data;

    //Liên kết đến nút tiếp theo
    //Tham chiếu
    Node next; //Biến tham chiếu kiểu Node

    public Node(){}

    public Node(int data){
        this.data = data;
        next = null;
    }

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
