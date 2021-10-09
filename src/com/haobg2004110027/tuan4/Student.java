package com.haobg2004110027.tuan4;

public class Student {
    
    public String name;

    public int age, id;

    public Student(int ID, String N, int T){
        this.name = N;
        this.age = T;
        this.id = ID;
    }

    public int getID(){
        return id;
    }

    public void setID(int ID){
        this.id = ID;
    }

    public String getName(){
        return name;
    }

    public void setName(String N){
        this.name = N;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int T){
        this.age = T;
    }
}
