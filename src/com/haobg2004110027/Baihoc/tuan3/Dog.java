package com.haobg2004110027.Baihoc.tuan3;

public class Dog {
        
        public String name;

        public int size;

        public String color;

        public Dog(int s, String c, String n){
        size = s;
        color = c;
        name = n;
    }
    
    void inThongTin(){
        System.out.println("Size = " + size + " Color = " + color + " Name = " + name);
    }
}