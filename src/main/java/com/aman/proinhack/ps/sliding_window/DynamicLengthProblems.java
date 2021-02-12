package com.aman.proinhack.ps.sliding_window;

public class DynamicLengthProblems {

  public static void main(String[] args) {
    System.out.println("length - "+smallestSubArrLengthTGET(new int[]{4,2,2,7,8,1,2,8,10}, 8));
  }

  /**
   * {4,2,2,7,8,1,2,8,10}, target - 8
   * smallest sub-array length that is greater then and equals to target value.
   */
  public static int smallestSubArrLengthTGET(int[] arr, int target) {
    int smallestLength = Integer.MAX_VALUE;

    int currentWindowSum = 0;
    int startWindow = 0;
    for(int endWindow=0; endWindow<arr.length; ++endWindow) {
      currentWindowSum += arr[endWindow];
      while (currentWindowSum >= target) {
        smallestLength = Math.min(smallestLength, endWindow-startWindow+1);
        currentWindowSum -= arr[startWindow];
        startWindow++;
      }
    }
    return smallestLength;
  }

}
