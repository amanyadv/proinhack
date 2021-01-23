package com.aman.proinhack.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InputScanExamples {


  public static void main(String[] args) throws IOException {

//    FastIOScan scan = new FastIOScan();
//    //String str = scan.scanString();
//    int value = scan.scanInt();
//    int[] arr = new int[value];
//    for (int i=0; i<value; i++) {
//      arr[i]  = scan.scanInt();
//    }
//    System.out.println("arr - "+ Arrays.toString(arr));

    boolean result1 = compareString("mr",  "rm");
    boolean result2 = compareString("marry",  "army");
    System.out.println(result1+", "+result2);
  }


  static boolean compareString(String str1, String str2) {
    Map<Character, Integer> map = new HashMap<>();
    boolean result = true;
    if(str1.length() != str2.length()) {
      return false;
    }
    for(int i=0; i<str1.length(); i++) {
      if(map.containsKey(str1.charAt(i))) {
        map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
      }else {
        map.put(str1.charAt(i), 1);
      }
    }
    for(int i=0; i<str1.length(); i++) {
      if(map.containsKey(str2.charAt(i))) {
        map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
      }
    }
    System.out.println(map);
    for(Map.Entry<Character, Integer> entry : map.entrySet()){
      if(entry.getValue() != 0) {
        return false;
      }
    }
    return result;
  }
}
