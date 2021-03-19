package com.aman.proinhack.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/** DS to support insert/delete/search/random in constant time */
public class CustomDS1 {
  private Map<Integer, Integer> map;
  private List<Integer> arr;
  private int modVal;

  public CustomDS1() {
    this.map = new HashMap<>();
    this.arr = new ArrayList<>();
  }

  public void insert(int value) {
    this.arr.add(value);
    this.map.put(value, this.arr.size() - 1);
  }

  public void delete(int value) {
    int idx = this.map.getOrDefault(value, -1);
    if (idx >= 0 && idx < this.arr.size()) {
      this.map.remove(value);
      int lastVal = this.arr.get(this.arr.size() - 1);
      this.arr.remove(this.arr.size() - 1);
      this.arr.add(idx, lastVal);
      this.map.put(lastVal, idx);
    }
  }

  public boolean search(int value) {
    return this.map.containsKey(value);
  }

  public int random() {
    return this.arr.get(new Random(this.arr.size()).nextInt());
  }
}
