package com.haobg2004110027.kiemtragiuaky;

public class Node {

    String Tao;
    Node next; 

    public Node(){}

    public Node(String Tao){
        this.Tao = Tao;
        next = null;
    }

    public Node(String Tao, Node next){
        this.Tao = Tao;
        this.next = next;
    }
}
