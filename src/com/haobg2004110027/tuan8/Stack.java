package com.haobg2004110027.tuan8;

import java.util.Scanner;
import java.util.Stack;

public class Stack {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Student> student = new Stack();
        addToTail(student);
        peek(student);
        System.out.println("\n\n");
        xoa(student);
        System.out.println("System shutting down!");
        System.exit(0);
    }
    
    public static void addToTail(Stack<Student> student) {

        while (true) {
            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();

            System.out.print("Nhập mssv: ");
            String id = scanner.nextLine();

            System.out.print("Nhập tuổi: ");
            String age = scanner.nextLine();

            scanner.nextLine();
            Student newStudent = new Student(name, id, age);
            student.add(newStudent);

            System.out.print("Nhập thêm (Y/N)?: ");

            if (scanner.nextLine().equals("N")) {
                break;
            }
        }
    }

    public static void peek(Stack<Student> student){
        Student listStudent = student.peek();
        System.out.println("Tên học sinh đầu tiên: " + listStudent.name);
        System.out.println("Mssv học sinh đầu tiên: " + listStudent.id);
        System.out.println("Tuổi học sinh: " + listStudent.age);
    }

    public static void xoa(Stack<Student> student) {
        while (true) {
            Student removeStudent = student.poll();
            System.out.println("Tên học sinh đầu hàng bị xóa : " + removeStudent.name);
            System.out.println("Mssv học sinh đầu hàng bị xóa : " + removeStudent.id);
            System.out.println("Tuổi học sinh đầu hàng bị xóa : " + removeStudent.age);

            System.out.print("Nhập thêm (Y/N)?: ");

            if (scanner.nextLine().equals("N")) {
                break;
            }
        }
    }
}