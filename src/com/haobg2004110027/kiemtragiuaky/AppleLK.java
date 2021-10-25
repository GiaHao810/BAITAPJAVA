package com.haobg2004110027.kiemtragiuaky;

public class AppleLK {
    Node head = null;
    Node tail = null;

    public AppleLK(){}

    void addtoTail(String Tao){

        Node newTao = new Node(Tao);

        if(head == null){
            head = newTao;
            tail = newTao;
        } else {
            tail.next = newTao;
            tail = newTao;
        }
    }

    void addtoHead(String Tao){

    }

    void inTao(){
        Node X = head;

        if(head == null){
            System.out.println("Danh sách rỗng.");
            return;
        }

        System.out.println("Danh sách các Táo:");
        while(X != null){
            System.out.println(X.Tao);
            X = X.next;
        }
    }
}
