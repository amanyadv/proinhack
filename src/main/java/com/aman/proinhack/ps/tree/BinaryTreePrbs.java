package com.aman.proinhack.ps.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreePrbs {
  public static class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value) {
      this.value = value;
    }
  }

  /**
   * Print nodes at k distance from root
   */
  public void printAtKthDis(TreeNode root, int k) {
    if(root == null) {
      return;
    }
    if(k == 0) {
      System.out.print(root.value+" ");
    }
    printAtKthDis(root.left, k-1);
    printAtKthDis(root.right, k-1);
  }

  public void printAtKthDisQueue(TreeNode root, int k) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while(queue.size() > 0) {
      TreeNode main = queue.poll();
      System.out.println(main.value+" ");
      if(main.left != null) {
        queue.offer(main.left);
      }
      if(main.right != null) {
        queue.offer(main.right);
      }
    }
  }
}
