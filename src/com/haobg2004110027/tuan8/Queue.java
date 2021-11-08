package com.haobg2004110027.tuan8;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Queue {
    static Scanner input = new Scanner(System.in);
    static Queue<Student> student = new LinkedList<Student>();
    public static void main(String[] args) {

    }

    public static void addToTail(Queue<Student> student) {
        while (true) {
            System.out.print("Nhập tên: ");
            String name = input.next();
            
            System.out.print("Nhập ID: ");
            String id = input.next();

            System.out.print("Nhập tuổi: ");
            String age = input.next();

            student.add(new Student(name, id, age));

            System.out.print("Bạn có muốn nhập thêm (Y/N): ");

            if(input.next().equals("N")){
                break;
            }
        }
    }

    public static void peek(Queue<Student> student) {
        Student listStudent = student.peek();
        
        System.out.println("Học sinh đang ở đầu hàng");
        System.out.println("Tên: " + listStudent.name);
        System.out.println("ID: " + listStudent.id);
        System.out.println("Tuổi: " + listStudent.age);
    }

    public static void remove(Queue<Student> student) {
        while(true){
            Student removeStudent = student.poll();
            System.out.println("Học sinh đầu hàng bị xóa");
            System.out.println("Tên: " + removeStudent.name);
            System.out.println("ID: " + removeStudent.id);
            System.out.println("Tuổi: " + removeStudent.age);

            System.out.print("Bạn có muốn nhập thêm (Y/N): ");

            if(input.nextLine().equals("N")){
                break;
            }
        }
    }
}