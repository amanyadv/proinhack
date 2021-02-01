package com.aman.proinhack.ps;

import com.aman.proinhack.ds.ic.ListNode;
import com.aman.proinhack.ps.array.Sort0s1s2s;
import com.aman.proinhack.ps.concurrency.FooBar;
import com.aman.proinhack.ps.concurrency.PrintInOrder;
import com.aman.proinhack.ps.linkedlist.InPlaceReversal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * testing class for problem solving
 */
public class PS {

  public static void main(String[] args) throws InterruptedException {
    //PrintInOrder print = new PrintInOrder();
    //FooBar foo = new FooBar(2);
    /*ExecutorService threadPool = Executors.newFixedThreadPool(3);
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
    });*/

    /*Sort0s1s2s sort0s1s2s = new Sort0s1s2s();
    int[] arr = new int[] {1,2,2,2,2,0,0,0,1};
    sort0s1s2s.sort(arr, arr.length);
    for (int value : arr) {
      System.out.print(value + " ");
    }*/

    InPlaceReversal llRev = new InPlaceReversal();

    ListNode root = new ListNode(1);
    root.next = new ListNode(2);
    root.next.next = new ListNode(3);
    root.next.next.next = new ListNode(4);
    ListNode temp = root;
    System.out.println("Main list - ");
    while(temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    ListNode rev = llRev.reverse(root);
    System.out.println("\nRev list - ");
    while(rev != null) {
      System.out.print(rev.data + " ");
      rev = rev.next;
    }
  }

}
