package com.aman.proinhack.alg;

public class Algo {

  public static void main(String[] arg) {

    BinarySearch binarySearch = new BinarySearch();

    int[] arr = new int[]{4,5,6,7,8,1,2,3};
    int index = binarySearch.binarySearchRotated(arr, 0, arr.length-1, 2);
    System.out.println("index - " + index);
  }

}
