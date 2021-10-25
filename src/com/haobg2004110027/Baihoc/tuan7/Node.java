package com.haobg2004110027.Baihoc.tuan7;

public class Node {
    
    //Nội dung
    String data;

    //Liên kết đến nút tiếp theo
    //Tham chiếu
    Node next; //Biến tham chiếu kiểu Node

    public Node(){}

    public Node(String data){
        this.data = data;
        next = null;
    }

    public Node(String data, Node next){
        this.data = data;
        this.next = next;
    }
}
