package com.bridgelabz;

public class MyNode<K> implements INode<K> {

    private K key;
    private INode<K> next;



    public MyNode(K key) {
        super();
        this.key = key;
        this.next = null;
    }



    @Override
    public K getKey() {
        return key;
    }
    @Override
    public void setKey(K Key) {
        this.key = key;

    }
    @Override
    public INode getNext() {
        // TODO Auto-generated method stub
        return next;
    }
    @Override
    public void setNext(INode next) {
        this.next = next;

    }

    @Override
    public String toString() {
        return
                key +"-->"
                        + next ;
    }
}
