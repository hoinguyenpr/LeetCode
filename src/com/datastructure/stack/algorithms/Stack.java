package com.datastructure.stack.algorithms;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size() - 1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }

    //Exercise 38
    public void push(T value) {
        stackList.add(value);
    }

    //Exercise 39
    public T pop() {
        if (stackList.isEmpty()) return null;
        T popItem = stackList.get(stackList.size() - 1);
        stackList.remove(stackList.size() - 1);
        return popItem;
    }

    //Exercise 40
    public static String reverseString(String string) {
        if (string == null) return null;
        Stack<Character> charStack = new Stack<>();
        for (char c : string.toCharArray()) {
            charStack.push(c);
        }
        StringBuilder result = new StringBuilder();
        while(!charStack.isEmpty()) {
            result.append(charStack.pop());
        }
        return result.toString();
    }

    public static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);

        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);

        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }

        // Print a separator for better readability
        System.out.println("--------------");
    }

    // Exercise 41
    public static boolean isBalancedParentheses(String string) {
        if (string.isEmpty()) return true;
        Stack<Character> checkStack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (c == '(') {
                checkStack.push(c);
            } else if (c == ')') {
                if (checkStack.isEmpty()) return false;
                checkStack.pop();
            }
        }
        return checkStack.isEmpty();
    }

    public static void main(String[] args) {
        testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);
    }
}