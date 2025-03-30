package com.datastructure.stack.algorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Stack;

//
//Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.
//Example 1:
//Input: s = "(1+(2*3)+((8)/4))+1"
//Output: 3
//Explanation:
//Digit 8 is inside of 3 nested parentheses in the string.
//        Example 2:
//Input: s = "(1)+((2))+(((3)))"
//Output: 3
//Explanation:
//Digit 3 is inside of 3 nested parentheses in the string.
//        Example 3:
//Input: s = "()(())((()()))"
//Output: 3
public class L1614MaxNestingDepth {

    // Using ArrayList
    public static int maxDepthArr(String s) {
        int count = 0;
        ArrayList<Integer> length = new ArrayList<>();
        for (char c : s.toCharArray()) {
            length.add(count);
            if (c == '(') count ++;
            if (c == ')') count --;
        }
        return length.stream().reduce(Integer::max).orElse(0);
    }

    //Using Stack
    public static int maxDepthStack(String s) {
        int maxDepth = 0;
        Stack<Character> depthStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                depthStack.push(c);
                maxDepth = Math.max(maxDepth, depthStack.size());
            } else if (c == ')') {
                depthStack.pop();
            }
        }
        return maxDepth;
    }

    //Smartest
    public static int maxDepth(String s) {
        int count = 0, max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') count ++;
            max = Math.max(count, max);
            if (c == ')') count --;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
//        System.out.println(maxDepthPlus(s));
//        //1.2.1
//        //1.2.1.2.3
    }
}
