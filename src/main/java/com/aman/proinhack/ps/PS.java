package com.aman.proinhack.ps;

import com.aman.proinhack.ps.concurrency.FooBar;
import com.aman.proinhack.ps.concurrency.PrintInOrder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * testing class for problem solving
 */
public class PS {

  public static void main(String[] args) throws InterruptedException {
    PrintInOrder print = new PrintInOrder();
    //FooBar foo = new FooBar(2);
    ExecutorService threadPool = Executors.newFixedThreadPool(2);
    threadPool.submit(()-> {
      try {
        print.third(() -> System.out.print("third"));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    threadPool.submit(()-> {
      try {
        print.first(() -> System.out.print("first"));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
    threadPool.submit(()-> {
      try {
        print.second(() -> System.out.print("second"));
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    });
  }

}
