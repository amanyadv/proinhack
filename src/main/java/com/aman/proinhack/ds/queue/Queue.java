package com.aman.proinhack.ds.queue;

public interface Queue {

    boolean isFull();

    boolean isEmpty();

    boolean enqueue(Object val);

    boolean dequeue();

    Object front();

    Object rear();
}
