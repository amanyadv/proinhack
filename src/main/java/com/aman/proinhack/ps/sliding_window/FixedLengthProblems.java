package com.aman.proinhack.ps.sliding_window;

public class FixedLengthProblems {

  public static void main(String[] args) {
    //
    System.out.println("max sum of sub arr of length k- "+findMaxSubArrOfK(new int[]{4,2,1,7,8,1,2,8,1,0}, 3));
  }

  /**
   * Find the max sum sub array of length k
   */
  public static int findMaxSubArrOfK(int[] arr, int k) {
    int max = Integer.MIN_VALUE;
    int continuousSum = 0;

    for(int i=0; i<arr.length; ++i) {
      continuousSum += arr[i];
      if(i >= k-1) {
        max = Math.max(max, continuousSum);
        continuousSum -= arr[i - (k-1)];
      }
    }
    return max;
  }
}
