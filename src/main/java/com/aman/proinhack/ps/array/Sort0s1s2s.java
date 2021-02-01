package com.aman.proinhack.ps.array;

/**
 * Sort an array of 0s, 1s and 2s
 * Dutch National Flag Algorithm OR 3-way Partitioning
 */
public class Sort0s1s2s {

  public void sort(int[] arr, int n) {
    int lo = 0, mid = 0, hi = n-1;

    while(mid<=hi) {
      switch (arr[mid]) {
        case 0:
          swapArr(arr, lo, mid);
          lo++;
          mid++;
          break;
        case 1:
          mid++;
        case 2:
          swapArr(arr, hi, mid);
          hi--;
      }
    }
  }

  private void swapArr(int[] arr, int a, int b) {
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }

}
