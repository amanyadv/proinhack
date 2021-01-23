package com.aman.proinhack.ds;

import com.aman.proinhack.ds.queue.CircularQueue;

/**
 * test class for data structures
 */
public class DS {

  public static void main(String[] arg) {
    CircularQueue cq = new CircularQueue(10);
    System.out.println("isEmpty - "+cq.isEmpty());
    System.out.println("enqueue - "+cq.enqueue(2));
    System.out.println("enqueue - "+cq.enqueue(4));
    System.out.println("enqueue - "+cq.enqueue(6));
    System.out.println("front - "+cq.front());
    System.out.println("rear - "+cq.rear());
    System.out.println("dequeue - "+cq.dequeue());
    System.out.println("front - "+cq.front());
    System.out.println("isFull - "+cq.isFull());
  }
}
