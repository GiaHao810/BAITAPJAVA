package com.haobg2004110027.Baihoc.tuan5;

import java.util.ArrayList;

import com.haobg2004110027.Baihoc.tuan3.Dog;

public class CTMinhHoaArrayList {
    public static void main(String[] args) {
/*        
        ArrayList a = new ArrayList<>();

        a.add("Dảk");
        a.add(true);
        a.add(123);
        a.add(2.5);
        a.add(new Dog(16,"Vàng","Xinh"));
                
        Dog dog = (Dog)a.get(4);
        System.out.println("Dog name: " + dog.name + "Dog color: " + dog.color + "Dog size: " + dog.size);

        Boolean x = (Boolean)a.get(1);

        System.out.println(a);
        System.out.println(x);
*/
        ArrayList<String> aArrayList = new ArrayList<>();
        aArrayList.add("Há");
        aArrayList.add("Đen");
        aArrayList.add("Trắng");

        String s = aArrayList.get(1);

        System.out.println(s);
    }
}
