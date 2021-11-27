package com.haobg2004110027.tuan8;

import java.util.Scanner;
import java.util.Stack;

public class Stacks {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Student> student = new Stack<>();
        addToTail(student);
        peek(student);
        System.out.println("\n\n");
        remove(student);
        System.out.println("System shutting down!");
    }
    
    public static void addToTail(Stack<Student> student) {

        while (true) {
            System.out.print("Nhập tên: ");
            String name = input.next();

            System.out.print("Nhập mssv: ");
            String id = input.next();

            System.out.print("Nhập tuổi: ");
            String age = input.next();

            student.add(new Student(name, id, age));

            System.out.print("Bạn có muốn nhập thêm (Y/N): ");

            if (input.next().equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static void peek(Stack<Student> student){
        Student listStudent = student.peek();
        System.out.println("Học sinh đang ở đầu hàng");
        System.out.println("Tên: " + listStudent.name);
        System.out.println("ID: " + listStudent.id);
        System.out.println("Tuổi: " + listStudent.age);
    }

    public static void remove(Stack<Student> student) {
        while (true) {
            Student removeStudent = student.pop();
            System.out.println("Học sinh đầu hàng bị xóa");
            System.out.println("Tên : " + removeStudent.name);
            System.out.println("ID: " + removeStudent.id);
            System.out.println("Tuổi: " + removeStudent.age);

            System.out.print("Bạn có muốn nhập thêm (Y/N)?: ");

            if (input.nextLine().equals("N")) {
                break;
            }
        }
    }
}