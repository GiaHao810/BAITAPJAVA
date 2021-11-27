package com.haobg2004110027.Baihoc.Outline;

import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        Random random = new Random();

        for(int i = 0; i < 5; i++){
            int number = random.nextInt(28);

            System.out.println(number);
        }

        System.out.println("Xin chào");
    }
}
