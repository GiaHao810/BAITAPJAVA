package com.haobg2004110027.Baihoc.tuan8;

import java.util.Stack;

public class StackDemoProgram {
    public static void main(String[] args) {
        Stack<String> stack;

        stack = new Stack<String>();

        //Thêm phần tử vào Stack
        stack.push("Welcome");
        stack.push("Cấu trúc dữ liệu và giải thuật");
        stack.push("Hello World");

        System.out.println(stack);

        //Lấy ra 1 phần tử từ đỉnh Stack (xóa phần tử khỏi Stack)
        String poped = stack.pop();

        System.out.println("Đã lấy ra từ Stack: " + poped);

        System.out.println("Phần tử còn lại của Stack");
        System.out.println(stack);
        
        //Tham khảo phần tử đỉnh của Stack
        String ptduocthamkhao = stack.peek();
        System.out.println("Phẩn tử tham khảo: " + ptduocthamkhao);
    }
}
