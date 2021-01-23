package com.aman.proinhack.ps.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Print FooBar Alternately
 *
 * The same instance of FooBar will be passed to two different threads.
 * Thread A will call foo() while thread B will call bar(). Modify the given program to output "foobar" n times.
 */
public class FooBar {
  private static final int BUSY=0, FOO=1, BAR=2;
  private int n;
  private AtomicInteger dispatcher = new AtomicInteger(FOO);

  public FooBar(int n) {
    this.n = n;
  }

  public void foo(Runnable printFoo) throws InterruptedException {
    for (int i = 0; i < n; i++) {
      while(!dispatcher.compareAndSet(FOO, BUSY)) {
        Thread.sleep(0);
      }
      printFoo.run();
      dispatcher.set(BAR);
    }
  }

  public void bar(Runnable printBar) throws InterruptedException {
    for (int i = 0; i < n; i++) {
      while(!dispatcher.compareAndSet(BAR, BUSY)) {
        Thread.sleep(0);
      }
      printBar.run();
      dispatcher.set(FOO);
    }
  }
}
