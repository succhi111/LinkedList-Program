package com.bridgelabz;

public class LinkedListMain {

    public static void main(String[] args) {
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);
        MyNode<Integer> fourthnode = new MyNode<Integer>(45);


        LinkedListCustom listnew = new LinkedListCustom();
        listnew.append(firstNode);
        listnew.append(secondNode);
        listnew.append(thirdNode);
        listnew.insert(thirdNode,fourthnode);

        listnew.dispalyLinkedList();
    }
}
