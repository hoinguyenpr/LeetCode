package com.datastructure.doublydlinkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length ++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node removeNode = null;
        if (length == 1) {
            removeNode = head;
            tail = head = null;
        } else {
            removeNode = tail;
            tail = tail.prev;
            tail.next = null;
            removeNode.prev = null;
        }
        length --;
        return removeNode;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length ++;
    }
    public Node removeFirst () {
        if (length == 0) return null;
        Node removeNode = null;
        if (length == 1) {
            removeNode = head;
            tail = head = null;
        } else {
            removeNode = head;
            head = head.next;
            removeNode.next = null;
            head.prev = null;
        }
        length --;
        return removeNode;
    }

    public Node get(int index) {
        if (index >= length || index < 0) {
            return null;
        }
        if (index == 0) return head;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public Node set(int index, int value) {
        Node node = get(index);
        node.value = value;
        return node;
    }

    public Node insert(int index, int value) {
        if (index > length || index < 0) {
            return null;
        }
        Node newNode = new Node(value);
        if (index == 0) {
            prepend(value);
        } else if (index == length) {
            append(value);
        } else {
            Node prevNode = get(index - 1);
            Node current = prevNode.next;
            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = current;
            current.prev = newNode;
        }
        length ++;
        return newNode;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        Node removeNode = null;
        if (index == 0) {
            removeNode = removeFirst();
        } else if (index == length - 1) {
            removeNode = removeLast();
        } else {
            removeNode = get(index);
            removeNode.prev.next = removeNode.next;
            removeNode.next.prev = removeNode.prev;
        }
        length --;
        return removeNode;
    }

    public void reverse() {
        if (length == 0) return;
        if (length == 1) return;
        Node current = head;
        Node prev = null;
        while (current != null) {
            Node next = current.next;
            current.next = prev;
            current.prev = next;
            prev = current;
            current = next;
        }
        tail = head;
        head = prev;
    }

    public void printListForward() {
        System.out.print("Forward: ");
        Node current = head;
        while (current != null) {
            System.out.print(current.value + "  ");
            current = current.next;
        }
    }
    public void printListReverse() {
        System.out.print("Reverse: ");
        Node current = tail;
        while (current != null) {
            System.out.print(current.value + "  ");
            current = current.prev;
        }
    }


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(3);
        dll.append(4);
        dll.append(5);
        dll.append(6);
        dll.append(7);
        dll.append(8);
        dll.printListForward();
        System.out.println("____________________________");
        dll.printListReverse();
        System.out.println("____________________________");
        System.out.println("Remove node last: ");
        dll.removeLast();
        dll.printListForward();
        System.out.println("____________________________");
        dll.prepend(1);
        dll.printListForward();
        System.out.println("____________________________");
        System.out.println("Remove node first: ");
        dll.removeFirst();
        dll.printListForward();
        System.out.println("____________________________");
        int index1 = 1;
        int index2 = 2;
        int index3 = 3;
        System.out.println("Get index: " + index1 + " of list is: " + dll.get(index1).value);
        System.out.println("Get index: " + index2 + " of list is: " + dll.get(index2).value);
        System.out.println("Get index: " + index3 + " of list is: " + dll.get(index3).value);
        dll.printListForward();
        System.out.println("____________insert________________");
        dll.insert(5,100);
        dll.printListForward();
        System.out.println("___________Test Remove Node_________________");
        dll.remove(4);
        dll.printListForward();
        System.out.println("-------Reverse:--------------");
        dll.reverse();
        dll.printListForward();
    }
}
