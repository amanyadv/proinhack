package com.aman.proinhack.alg;

public class BinarySearch {

  public int binarySearchRec(int[] arr, int l, int r, int tar) {
    if (r >= l) {
      int mid = l + (r - l) / 2;
      if (arr[mid] == tar) {
        return arr[mid];
      }
      if (arr[mid] > tar) {
        return binarySearchRec(arr, l, mid - 1, tar);
      }
      return binarySearchRec(arr, mid + 1, r, tar);
    }
    return -1;
  }


  public int binarySearchItr(int[] arr, int tar) {
    int l = 0, r = arr.length - 1;
    while (l <= r) {
      int mid = l + (r - l) / 2;
      if (arr[mid] == tar) {
        return arr[mid];
      }
      if (arr[mid] > tar) {
        r = mid - 1;
      } else {
        l = mid + 1;
      }
    }
    return -1;
  }

}
