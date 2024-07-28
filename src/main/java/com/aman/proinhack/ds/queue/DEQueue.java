package com.aman.proinhack.ds.queue;

public class DEQueue implements Queue {

    private Node front;
    private Node rear;
    private int size = 0;

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return this.front == null;
    }

    @Override
    public boolean enqueue(Object val) {

        return false;
    }

    @Override
    public boolean dequeue() {
        if(isEmpty()) {
            return false;
        }
        this.front = this.front.next;
        if(this.front == null) {
            this.rear = null;
        } else {
            this.front.prev = null;
        }
        size--;
        return true;
    }

    @Override
    public Object front() {
        if(!isEmpty()) {
            return this.front.data;
        }
        return null;
    }

    @Override
    public Object rear() {
        if(!isEmpty())  {
            return this.rear.data;
        }
        return null;
    }


    static class Node {
        Object data;
        Node prev, next;

        public Node(Object data) {
            this.data = data;
        }
    }
}
