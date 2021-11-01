package com.haobg2004110027.tuan8;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Queue {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Queue<Student> student = new LinkedList<Student>();
        addToTail(student);
        peek(student);
        System.out.println("\n\n");
        xoa(student);
        System.out.println("System shutting down!");
    }
    
    public static void addToTail(Queue<Student> student) {

        while (true) {
            System.out.print("Nhập tên: ");
            String name = scanner.nextLine();

            System.out.print("Nhập mssv: ");
            String id = scanner.nextLine();

            System.out.print("Nhập tuổi: ");
            String age = scanner.nextLine();

            student.add(new Student(name, id, age));

            System.out.print("Nhập thêm (Y/N)?: ");

            if (scanner.nextLine().equals("N")) {
                break;
            }
        }
    }

    public static void peek(Queue<Student> student){
        Student listStudent = student.peek();
        System.out.println("Tên học sinh đầu tiên: " + listStudent.name);
        System.out.println("Mssv học sinh đầu tiên: " + listStudent.id);
        System.out.println("Tuổi học sinh: " + listStudent.age);
    }

    public static void xoa(Queue<Student> student) {
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