package com.haobg2004110027.kiemtragiuaky;

public class Apple {
    int id;
    double weight;
    String color;
    
    public Apple(){}

    public Apple(int id, double weight, String color){
        this.id = id;
        this.weight= weight;
        this.color = color;
    }

    void inThongtin(){
        System.out.println("\nID: " + id + "\tKhối lượng: " + weight + "\tMàu: " + color);
    }

}
