package com.aman.proinhack.alg;

import com.aman.proinhack.ds.ic.ListNode;

public class MargeSort {


  //Merge sort on linkedList
  public ListNode mergeSort(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode middle = getMiddleNode(head);
    ListNode nextToMiddle = middle.next;
    middle.next = null;

    ListNode left = mergeSort(head);
    ListNode right = mergeSort(nextToMiddle);
    ListNode sorted = merge(left, right);
    return sorted;
  }

  private ListNode merge(ListNode left, ListNode right) {
    ListNode result = null;
    /* Base cases */
    if (left == null) {
      return right;
    }
    if (right == null) {
      return left;
    }
    /* Pick either a or b, and recur */
    if (left.data <= right.data) {
      result = left;
      result.next = merge(left.next, right);
    } else {
      result = right;
      result.next = merge(left, right.next);
    }
    return result;
  }

  private ListNode getMiddleNode(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode slow = head, fast = head;
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }


}
