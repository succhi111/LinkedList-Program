package com.bridgelabz;

public class MyNode <K>{
    private K key;         //store data
    private MyNode next;     //store adress of next

    //creating constructor for one node


    public MyNode(K key) {
        this.key = key;
        this.next =null;
    }

    //creating geters and setters
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "key=" + key +
                ", next=" + next +
                '}';
    }

    public static void main(String[] args) {
        // creating object and assigning values to the node
        MyNode<Integer> firstNode = new MyNode<>(50);
        MyNode<Integer> secondNode = new MyNode<>(60);
        MyNode<Integer> thirdNode = new MyNode<>(70);
        
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);

        System.out.println(firstNode);
    }
}
