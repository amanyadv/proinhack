package com.aman.proinhack.ps.two_pointer;

public class SlowAndFast {

    /**
     * Case 1: Fast runner grows each iteration and slow runner grows with some restrictions
     *
     *Given a sorted array nums,remove the duplicates in place such that
     * each element appear only once and return the new length
     * Ex: [1,1,1,2,3,4,4] => [1,2,3,4,5,4,4]
     */
    public int removeDuplicate(int[] arr) {
        if (arr == null) {
            return 0;
        }
        int len = arr.length; // len = 7
        int slow=0;          //
        for (int fast=1; fast<len; fast++) {
            if(arr[slow] != arr[fast]) {    // arr[]
                slow++;                     // slow = 1
                arr[slow] = arr[fast];     // arr[1] = 2
            }
        }
        return slow+1;
    }

    /**
     * Case 2: The fast runner moves a distance before the slow runner.
     *
     * Given a linked list, remove the n-th node from the end of the list and return its head
     */

}
