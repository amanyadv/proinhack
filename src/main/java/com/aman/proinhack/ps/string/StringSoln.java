package com.aman.proinhack.ps.string;

import java.util.Stack;

public class StringSoln {

  public static void main(String[] arg) {
  }

  /*
   * Given a string containing only '(', ')', determine whether the string is valid.
   * Note: the empty string is a valid string
   */
  private static boolean isValid(String pattern) {
    if (pattern.isEmpty()) {
      return true;
    }
    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < pattern.length(); i++) {
      if (pattern.charAt(i) == '(') {
        stack.push(pattern.charAt(i));
      } else {
        if (stack.empty()) {
          return false;
        } else {
          stack.pop();
        }
      }
    }

    return stack.empty();
  }

  private static boolean isValidOpt(String pattern) {
    if (pattern.isEmpty()) {
      return true;
    }
    int count = 0;
    for (int i = 0; i < pattern.length(); i++) {
      if (pattern.charAt(i) == '(') {
        count++;
      } else {
        if (count == 0) {
          return false;
        } else {
          count--;
        }
      }
    }

    return count == 0;
  }

  /*
   * Given a string containing only '(' and ')', find the length of the longest substring
   * containing valid parentheses.
   */

  private static int longestValidParentheses(String value) {
    int max = 0;
    Stack<Integer> stack = new Stack<>();
    stack.push(-1);
    for (int i = 0; i < value.length(); i++) {
      if (value.charAt(i) == '(') {
        stack.push(i);
      } else {
        stack.pop();
        if (stack.empty()) {
          stack.push(i);
        } else {
          max = Math.max(max, i - stack.peek());
        }
      }
    }
    return max;
  }

  private static int longestValidParenthesesOpt(String value) {
    if(value.isEmpty()) {
      return 0;
    }
    int left = 0, right = 0, max = 0;
    for (int i = 0; i < value.length(); i++) {
      if (value.charAt(i) == '(') {
        left++;
      } else {
        right++;
      }
      if (left == right) {
        max = Math.max(max, 2 * right);
      }else if(right > left){
        left = right = 0;
      }
    }
    left = right = 0;
    for (int i = value.length() - 1; i >= 0; i--) {
      if (value.charAt(i) == '(') {
        left++;
      } else {
        right++;
      }
      if (left == right) {
        max = Math.max(max, 2 * left);
      } else if (left > right) {
        left = right = 0;
      }
    }
    return max;
  }

}
