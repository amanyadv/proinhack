package com.aman.proinhack.ps.math;

import com.aman.proinhack.ds.ic.ListNode;

public class MathSoln {

  public static void main(String[] arg) {
  }

  static ListNode createLinkedList(int n) {
    ListNode head = new ListNode(1);
    ListNode next = head;
    for (int i = 2; i <= n; i++) {
      ListNode tmp = new ListNode(i);
      next.next = tmp;
      next = next.next;
    }
    // 头尾串联
    next.next = head;
    return head;
  }

  /*
   * The Josephus Problem (or Josephus permutation)
   */
  private static int solve(int n, int m) {
    if (m == 1 || n < 2) {
      return n;
    }
    ListNode head = createLinkedList(n);
    int count = 1;
    ListNode cur = head;
    ListNode pre = null;
    while (head.next != head) {
      if (count == m) {
        count = 1;
        pre.next = cur.next;
        cur = pre.next;
      } else {
        count++;
        pre = cur;
        cur = cur.next;
      }
    }
    return head.data;
  }

  //Recursion soln
  private static int solveRec(int n, int m){
    return n == 1 ? n : (solveRec(n - 1, m) + m - 1) % n + 1;
  }

}
