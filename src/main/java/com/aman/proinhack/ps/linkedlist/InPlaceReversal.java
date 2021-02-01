package com.aman.proinhack.ps.linkedlist;

import com.aman.proinhack.ds.ic.ListNode;

public class InPlaceReversal {

  public ListNode reverse(ListNode root) {
    ListNode prev = null;
    ListNode curr = root;
    ListNode next = null;

    while(curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    root = prev;
    return root;
  }

}
