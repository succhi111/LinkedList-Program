package com.bridgelabz;

public class LinkedListCustom {

    INode head ;
    INode tail;


    public LinkedListCustom() {

        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {   // newNode is variable

        // 56-30-70

        // node 70 create karo
        // add 30 and then 56

        /*
         *   head --->70
         *
         *   head -- xxx--->70
         *
         *   head--> [30] ---> 70
         *
         *   head--xxx---> 30 ---> 70
         *
         *   head --> [56] ---> 30 ---->70
         *
         *
         */

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
        // 56-30-70

        /*
         *   head --->56
         *
         *   head -->  56-->xxx--->tail
         *
         *   head--> 56 ---> 30--->xxx--->tail
         *
         *   head-->56--->30-->70--->tail

         */
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

    public void dispalyLinkedList(){

        System.out.println("My list=  "+head);
    }
}
