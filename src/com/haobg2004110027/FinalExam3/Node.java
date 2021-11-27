package com.haobg2004110027.FinalExam3;

public class Node {
    String nameProduct,
           typeProduct;
    int idProduct,
        priceProduct,
        inventory;
    int date,
        month,
        year;
    Node next;

    public Node(){}

    public Node(String nameProduct, String typeProduct, int idProduct, int priceProduct, int inventory, int date, int month, int year){
        this.nameProduct = nameProduct;
        this.typeProduct = typeProduct;
        this.idProduct = idProduct;
        this.priceProduct = priceProduct;
        this.inventory = inventory;
        this.date = date;
        this.month = month;
        this.year = year;
        next = null;
    }
    public Node(String nameProduct, String typeProduct, int idProduct, int priceProduct, int inventory, int date, int month, int year, Node next){
        this.nameProduct = nameProduct;
        this.typeProduct = typeProduct;
        this.idProduct = idProduct;
        this.priceProduct = priceProduct;
        this.inventory = inventory;
        this.date = date;
        this.month = month;
        this.year = year;
        this.next = next;
    }
}
