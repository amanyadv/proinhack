package com.aman.proinhack.ds.queue;

public class CircularQueue implements Queue {

  private Object[] arr;
  private int head, tail, size;

  public CircularQueue(int size) { // Dry run: size=10
    this.arr = new Object[size];
    this.head = -1;
    this.tail = -1;
    this.size = size;
  }

  public boolean isFull() {
    return (tail + 1) % size == head; // Dry run: size=10, tail=-1, head=-1 => -1 + 1 % 10 != -1
  }

  public boolean isEmpty() {
    return head == -1;
  }

  public boolean enqueue(Object value) {
    if (isFull()) {
      return false;
    }
    if (head == -1) {
      head = 0;
    }
    tail = (tail + 1) % size; //Dry run: size=10, tail = -1 => -1 + 1 % 10 = 0
    arr[tail] = value;
    return true;
  }

  public boolean dequeue() {
    if (isEmpty()) {
      return false;
    }
    if (head == tail) {
      head = -1;
      tail = -1;
      return true;
    }
    head = (head + 1) % size;
    return true;
  }

  public Object front() {
    if (isEmpty()) {
      return -1;
    }
    return arr[head];
  }

  public Object rear() {
    if (isEmpty()) {
      return -1;
    }
    return arr[tail];
  }
}
