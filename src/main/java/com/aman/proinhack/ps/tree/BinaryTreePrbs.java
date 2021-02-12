package com.aman.proinhack.ps.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreePrbs {
  public static class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    public TreeNode(int value) {
      this.value = value;
    }
  }

  public int calHeight(TreeNode treeNode) {
    if(treeNode == null) {
      return 0;
    }
    return Math.max(calHeight(treeNode.left), calHeight(treeNode.right)) +1;
  }

  public void levelOrderTraversal(TreeNode root) {
    if(root == null) {
      return;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while(!queue.isEmpty()) {
      TreeNode main = queue.poll();
      System.out.print(main.value+", ");
      if(main.left != null) {
        queue.offer(main.left);
      }
      if(main.right != null) {
        queue.offer(main.right);
      }
    }
  }

  public void inOrderTraversal(TreeNode root) {
    if(root == null) {
      return;
    }
    inOrderTraversal(root.left);
    System.out.print(root.value+", ");
    inOrderTraversal(root.right);
  }

  public void inOrderTraversalItr(TreeNode root) {
    if(root == null) {
      return;
    }
    TreeNode current = root;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      while(current.left != null) {
        current = current.left;
        stack.push(current);
      }
      current = stack.pop();
      System.out.print(current.value+", ");
      if(current.right != null) {
        current = current.right;
        stack.push(current);
      }
    }
  }

  public void preOrderTraversalItr(TreeNode root) {
    if(root == null) {
      return;
    }
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      System.out.print(node.value+", ");
      if(node.left != null) {
        stack.push(node.left);
      }
      if(node.right != null) {
        stack.push(node.right);
      }
    }
  }

  /** Print nodes at k distance from root */
  public void printAtKthDis(TreeNode root, int k) {
    if (root == null) {
      return;
    }
    if (k == 0) {
      System.out.print(root.value + " ");
    }
    printAtKthDis(root.left, k - 1);
    printAtKthDis(root.right, k - 1);
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
