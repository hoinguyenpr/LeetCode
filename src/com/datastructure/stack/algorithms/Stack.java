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


    //Exercise 42
//    public static void sortStack(Stack<Integer> oriStack) {
//        if(oriStack.isEmpty()) return;
//
//        ArrayList<Integer> tempArr = new ArrayList<>();
//        while (!oriStack.isEmpty()) {
//            tempArr.add(oriStack.pop());
//        }
//        for (int i = tempArr.size() - 1; i >= 0; i --) {
//            oriStack.push(tempArr.get(i));
//        }
//    }

    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> bufferStack = new Stack<>();
        if (stack.isEmpty()) return;
        while(!stack.isEmpty()) {
            int temp = stack.pop();
            while (!bufferStack.isEmpty() && bufferStack.peek() > temp) {
                stack.push(bufferStack.pop());
            }
            bufferStack.push(temp);
        }
        while (!bufferStack.isEmpty()) {
            stack.push(bufferStack.pop());
        }
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(1);
        stack.push(4);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();
    }
}