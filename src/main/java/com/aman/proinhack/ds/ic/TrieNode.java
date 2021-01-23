package com.aman.proinhack.ds.ic;

public class TrieNode {

  private char ch;
  private TrieNode[] children;
  private boolean isLast;
  private long count;

  public TrieNode() {
    children = new TrieNode[26];
    isLast = false;
    count = 0;
  }

  public TrieNode(char c) {
    this();
    this.ch = c;
  }

  public boolean isLast() {
    return isLast;
  }

  public void setLast(boolean last) {
    isLast = last;
  }

  public long getCount() {
    return count;
  }

  public void setCount(long count) {
    this.count = count;
  }

  public char getCh() {
    return ch;
  }

  public void setCh(char ch) {
    this.ch = ch;
  }

  public TrieNode[] getChildren() {
    return children;
  }

  public void setChildren(TrieNode[] children) {
    this.children = children;
  }
}
