package com.datastructure.linkedlist.algorithms;

import com.datastructure.linkedlist.LinkedList;
import com.datastructure.linkedlist.Node;

import java.util.Arrays;

//   +===================================================+
//   |               WRITE YOUR CODE HERE                |
//   | Description:                                      |
//   | - This method converts a binary number,           |
//   |   represented as a linked list, to a decimal int. |
//   |                                                   |
//   | Return type: int                                  |
//   | - Returns the decimal equivalent of the binary    |
//   |   number.                                         |
//   |                                                   |
//   | Tips:                                             |
//   | - We use a while loop to traverse the linked list.|
//   | - Multiply the current sum by 2 and add the value |
//   |   at each node to get the decimal number.         |
//   +===================================================+
public class BinaryToDecimal {
    public static int binaryToDecimal(Node head) {
        int result = 0;
        Node current = head;
        while (current != null) {
            result = (result * 2) + current.value;
            current = current.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAll(Arrays.asList(1,1,0,1));
        int result = binaryToDecimal(ll.getHead());
        System.out.println("Result: " + result);
    }
}
