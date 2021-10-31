package com.haobg2004110027.tuan8;

public class BinaryTreeTestDrive {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
    
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        tree.add(8);
        tree.add(9);
        tree.add(10);
       
        System.out.println("Các phần tử đã thêm \n"); 
        tree.inorder();
        }
}
