package com.pattern.twopointers;

import com.datastructure.linkedlist.Node;
import com.datastructure.linkedlist.LinkedList;

import java.util.Arrays;


//LinkedList Solution
public class L24SwapNodePairs {
    public static Node swapPairs(Node head) {
        if (head == null || head.next == null) return head;
        Node first = head;
        Node pre = null;
        head = first.next;
        while (first != null && first.next != null) {
            Node second = first.next;
            if (pre != null) pre.next = second;
            first.next = second.next;
            second.next = first;
            pre = first;
            first = first.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAll(Arrays.asList(1,2,3));
        ll.printList();
        System.out.println(" ");
        Node result = swapPairs(ll.getHead());
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }
}
