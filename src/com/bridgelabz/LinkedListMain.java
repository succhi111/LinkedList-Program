package com.bridgelabz;

public class LinkedListMain {

    public static void main(String[] args) {
        MyNode<Integer> firstNode = new MyNode<Integer>(70);
        MyNode<Integer> secondNode = new MyNode<Integer>(30);
        MyNode<Integer> thirdNode = new MyNode<Integer>(56);


        LinkedListCustom listnew = new LinkedListCustom();
        listnew.add(firstNode);
        listnew.add(secondNode);
        listnew.add(thirdNode);

        listnew.dispalyLinkedList();
    }



}
