package com.datastructure.linkedlist.algorithms;

import com.datastructure.linkedlist.LinkedList;
import com.datastructure.linkedlist.Node;

import java.util.Arrays;

public class PartitionList {
    public static void partition(Node head, int x) {
        if (head == null) return;
        if (head.next == null) return;

        Node lesser = new Node();
        Node greater = new Node();
        Node firstOfGreate = null;
        Node firstOfLesser = null;
        Node temp = head;
        while (temp != null) {
            if (temp.value < x) {
                if (firstOfLesser == null) {
                    firstOfLesser = temp;
                }
                lesser.next = temp;
                lesser = lesser.next;
            } else {
                if (firstOfGreate == null) {
                    firstOfGreate = temp;
                }
                greater.next = temp;
                greater = greater.next;
            }
            temp = temp.next;
        }
        if (firstOfLesser != null) {
            head = firstOfLesser;
        }
        lesser.next = firstOfGreate;
        greater.next = null;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAll(Arrays.asList(3,8,5,10,2,1));
        partition(ll.getHead(), 5);
        ll.printList();
    }

}
