package com.bridgelabz;

public class LinkedListMain {

    public static void main(String[] args) {
        MyNode<Integer> firstNode = new MyNode<Integer>(56);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(70);


        LinkedListCustom listnew = new LinkedListCustom();
        listnew.append(firstNode);
        listnew.append(secondNode);
        listnew.append(thirdNode);

        listnew.dispalyLinkedList();
    }
}
