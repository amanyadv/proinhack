package com.aman.proinhack.alg;

public class QuickSort {

  public void quickSortRec(int[] arr, int low, int high) {
    if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
      int pi = partition(arr, low, high);

      // Recursively sort elements before
      // partition and after partition
      quickSortRec(arr, low, pi - 1);
      quickSortRec(arr, pi + 1, high);
    }
  }

  public void quickSortItr(int[] arr, int l, int h) {
    // Create an auxiliary stack
    int[] stack = new int[h - l + 1];
    // initialize top of stack
    int top = -1;
    // push initial values of l and h to stack
    stack[++top] = l;
    stack[++top] = h;

    // Keep popping from stack while is not empty
    while (top >= 0) {
      // Pop h and l
      h = stack[top--];
      l = stack[top--];

      // Set pivot element at its correct position
      // in sorted array
      int p = partition(arr, l, h);

      // If there are elements on left side of pivot,
      // then push left side to stack
      if (p - 1 > l) {
        stack[++top] = l;
        stack[++top] = p - 1;
      }

      // If there are elements on right side of pivot,
      // then push right side to stack
      if (p + 1 < h) {
        stack[++top] = p + 1;
        stack[++top] = h;
      }
    }
  }


  private int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = (low - 1); // index of smaller element
    for (int j = low; j < high; j++) {
      // If current element is smaller than the pivot
      if (arr[j] < pivot) {
        i++;

        // swap arr[i] and arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    // swap arr[i+1] and arr[high] (or pivot)
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
  }
}
