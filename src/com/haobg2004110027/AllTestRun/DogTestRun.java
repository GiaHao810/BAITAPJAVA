package com.haobg2004110027.AllTestRun;

public class DogTestRun {
   public static void main(String[] args) {
    Dog[] danhSachDog = new Dog[10];

    Dog dog0 = new Dog(14, "Đen", "Minh");
    Dog dog1 = new Dog(15, "Trắng", "Trâu");
    Dog dog2 = new Dog(16, "Vàng", "Xinh");

    danhSachDog[0] = dog0;
    danhSachDog[1] = dog1;
    danhSachDog[2] = dog2;

    for(int i = 0; i < danhSachDog.length; i++){
        danhSachDog[i].inThongTin();
    }
   }
}
