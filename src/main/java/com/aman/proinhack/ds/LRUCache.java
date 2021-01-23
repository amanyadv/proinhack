package com.aman.proinhack.ds;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LRUCache {

  private Map<Integer, Integer> map;
  private final int capacity;

  public LRUCache(int capacity) {
    this.capacity = capacity;
    map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
      @Override
      protected boolean removeEldestEntry(Entry<Integer, Integer> eldest) {
        return size() > capacity;
      }
    };
  }

  public Integer get(Integer key) {
    return map.getOrDefault(key, -1);
  }

  public void set(Integer key, Integer value) {
    map.put(key, value);
  }

  public void printKeyValue() {
    for (Entry<Integer, Integer> m : map.entrySet()) {
      System.out.println("key -" + m.getKey() + ", " + "value - " + m.getValue());
    }
  }
}
