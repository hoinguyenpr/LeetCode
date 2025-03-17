package com.datastructure.doublydlinkedlist.algorithms;

import com.datastructure.doublydlinkedlist.DoublyLinkedList;
import com.datastructure.doublydlinkedlist.Node;

public class Palindrome {
    public static boolean isPalindrome(DoublyLinkedList doublyLinkedList) {
        if (doublyLinkedList.getLength() <= 1) return true;
        Node headRun = doublyLinkedList.getHead();
        Node tailRun = doublyLinkedList.getTail();
        for (int i = 0; i < doublyLinkedList.getLength() / 2; i ++) {
            if (headRun.value != tailRun.value) return false;
            headRun = headRun.next;
            tailRun = tailRun.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll =
                new DoublyLinkedList(1);
        dll.append(2);
        dll.append(3);
        dll.append(1);
        System.out.println(isPalindrome(dll) ? "isPalindrome" : "is not Palindrome");
    }
}
