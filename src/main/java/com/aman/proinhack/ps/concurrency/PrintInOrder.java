package com.aman.proinhack.ps.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * The same instance of Foo will be passed to three different threads.
 * Thread A will call first(), thread B will call second(), and thread C will call third().
 * Design a mechanism and modify the program to ensure that second() is executed after first(), and third() is executed after second().
 *
 * Input: [1,2,3]
 * Output: "firstsecondthird"
 *
 * Input: [1,3,2]
 * Output: "firstsecondthird"
 */
public class PrintInOrder {
  private static final int BUSY=0, F=1, S=2, T=3;
  private AtomicInteger dispatcher = new AtomicInteger(F);

  public PrintInOrder() {
  }

  public void first(Runnable printFirst) throws InterruptedException {
    while(!dispatcher.compareAndSet(F, BUSY)) {
      Thread.sleep(0);
    }
    printFirst.run();
    dispatcher.set(S);
  }

  public void second(Runnable printSecond) throws InterruptedException {
    while(!dispatcher.compareAndSet(S, BUSY)) {
      Thread.sleep(0);
    }
    printSecond.run();
    dispatcher.set(T);
  }

  public void third(Runnable printThird) throws InterruptedException {
    while(!dispatcher.compareAndSet(T, BUSY)) {
      Thread.sleep(0);
    }
    printThird.run();
  }

}
