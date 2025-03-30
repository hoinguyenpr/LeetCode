package com.datastructure.stack.algorithms;

import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//
//
//        Example 1:
//
//        Input: s = "()"
//
//        Output: true
//
//        Example 2:
//
//        Input: s = "()[]{}"
//
//        Output: true
//
//        Example 3:
//
//        Input: s = "(]"
//
//        Output: false
//
//        Example 4:
//
//        Input: s = "([])"
//
//        Output: true
public class L20ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> tempStack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                tempStack.push(c);
            } else {
                if (tempStack.isEmpty()) return false;
                char top = tempStack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return tempStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s) ? "Valid" : "Invalid");
    }
}
