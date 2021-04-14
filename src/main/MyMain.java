package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        // and perform insert, search, traversal, delete
        MyBinarySearchTree tree = new MyBinarySearchTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);
        //tree.inOrder(tree.getRoot());
        tree.insert(70);
        //tree.inOrder(tree.getRoot());
        //System.out.println(tree.search(20));
    }
}
