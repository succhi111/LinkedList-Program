package com.bridgelabz;

public class LinkedListCustom {

    INode head ;
    INode tail;


    public LinkedListCustom() {

        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {   // newNode variable

        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);

        }
    }
    public void append(INode newNode){

        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        }
        else {
            INode tempNode =this.tail;
            this.tail.setNext(newNode);
            this.tail=newNode;
        }
    }
    public void insert(INode previousnode, INode newNode) {
        INode tempNode = previousnode.getNext();
        previousnode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public  INode pop(){
        INode tempNode = this.head;
        this.head =this.head.getNext();
        return tempNode;
    }
    public void dispalyLinkedList(){

        System.out.println("My list=  "+head);
    }
}
