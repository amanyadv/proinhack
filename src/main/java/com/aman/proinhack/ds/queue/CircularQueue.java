package com.aman.proinhack.ds.queue;

public class CircularQueue {

  private int[] arr;
  private int head, tail, size;

  public CircularQueue(int size) {
    this.arr = new int[size];
    this.head = -1;
    this.tail = -1;
    this.size = size;
  }

  public boolean isFull() {
    return (tail + 1) % size == head;
  }

  public boolean isEmpty() {
    return head == -1;
  }

  public boolean enqueue(int value) {
    if (isFull()) {
      return false;
    }
    if (head == -1) {
      head = 0;
    }
    tail = (tail + 1) % size;
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

  public int front() {
    if (isEmpty()) {
      return -1;
    }
    return arr[head];
  }

  public int rear() {
    if (isEmpty()) {
      return -1;
    }
    return arr[tail];
  }
}
