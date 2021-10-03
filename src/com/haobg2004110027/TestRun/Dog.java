package com.haobg2004110027.TestRun;

public class Dog {
        
        String name;

        int size;

        String color;

        public Dog(int s, String c, String n){
        size = s;
        color = c;
        name = n;
    }
    
    void inThongTin(){
        System.out.println("Size = " + size + " Color = " + color + " Name = " + name);
    }
}