package com.aman.proinhack.ds;

import com.aman.proinhack.ds.ic.TrieNode;

public class Trie {

  private TrieNode root;

  public Trie() {
    //start node
    root = new TrieNode('*');
  }

  public void insert(String text) {
    TrieNode node = root;
    for (char c : text.toCharArray()) {
      TrieNode temp = node.getChildren()[c - 'a'];
      if (temp == null) {
        temp = new TrieNode(c);
        node.getChildren()[c - 'a'] = temp;
      }
      node = temp;
    }
    node.setLast(true);
  }

  public boolean search(String text) {
    TrieNode node = root;
    for (char c : text.toCharArray()) {
      TrieNode temp = node.getChildren()[c - 'a'];
      if (temp == null) {
        return false;
      }
      node = temp;
    }
    return node.isLast();
  }

  public boolean prefix(String text) {
    TrieNode node = root;
    for (char c : text.toCharArray()) {
      TrieNode temp = node.getChildren()[c - 'a'];
      if (temp == null) {
        return false;
      }
      node = temp;
    }
    return true;
  }
}
