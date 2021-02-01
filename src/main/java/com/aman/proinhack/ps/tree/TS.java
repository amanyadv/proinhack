package com.aman.proinhack.ps.tree;

import com.aman.proinhack.ps.tree.BinaryTreePrbs.TreeNode;

public class TS {

  public static void main(String[] args) {
    //
    BinaryTreePrbs btprbs = new BinaryTreePrbs();
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.left = new TreeNode(8);
    //btprbs.printAtKthDis(root, 2);
    btprbs.printAtKthDisQueue(root, 2);
  }
}
