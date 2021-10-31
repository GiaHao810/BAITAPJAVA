package com.haobg2004110027.tuan8;

public class BinaryTree {

    // Root của cây 
    Node root; 
   
    BinaryTree() { 
        root = null; 
    } 

    public Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
    
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            
            return current;
        }
    
        return current;
    }
    public void add(int value) {
        root = addRecursive(root, value);
    }

 
// hàm thực hiện việc sắp xếp và in ra cây nhị phân đã được sắp xếp 
    public void inorderRec(Node root) 
{ 
        if (root != null) 
    { 
            inorderRec(root.left); 
            System.out.print(root.value + " "); 
            inorderRec(root.right); 
    }     
}

    public void inorder() 
    { 
        inorderRec(root); 
    } 
}