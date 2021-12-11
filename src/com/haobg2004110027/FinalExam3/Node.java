package com.haobg2004110027.FinalExam3;

public class Node {
    String nameProduct,
           typeProduct,
           dateProduct,
           idProduct;
    int inventory,
        priceProduct;
    Node next;

    public Node(){}

    public Node(String nameProduct, String typeProduct, String idProduct, int priceProduct, int inventory, String dateProduct){
        this.nameProduct = nameProduct;
        this.typeProduct = typeProduct;
        this.idProduct = idProduct;
        this.priceProduct = priceProduct;
        this.inventory = inventory;
        this.dateProduct = dateProduct;
        next = null;
    }
    public Node(String nameProduct, String typeProduct, String idProduct, int priceProduct, int inventory, String dateProduct, Node next){
        this.nameProduct = nameProduct;
        this.typeProduct = typeProduct;
        this.idProduct = idProduct;
        this.priceProduct = priceProduct;
        this.inventory = inventory;
        this.dateProduct = dateProduct;
        this.next = next;
    }
}
