package com.wipro.java.UserCreateLinkedList;

class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class UserCreateLinkedList {
    private Node head;

    // Add at the end
    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Remove a node by value
    public void remove(String data) {
        if (head == null) return;

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && !temp.next.data.equals(data)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Insert at a specific position
    public void insertAt(int position, String data) {
        Node newNode = new Node(data);
        if (position <= 0 || head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        for (int i = 1; temp.next != null && i < position; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Search for an element
    public boolean search(String data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Reverse the linked list
    public void reverse() {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Find length of the linked list
    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Remove from the beginning
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Remove from the end
    public void removeLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        UserCreateLinkedList list = new UserCreateLinkedList();
        list.add("Aswathi");
        list.add("Aishu");
        list.add("Raj");

        System.out.println("Linked List:");
        list.display();

        list.remove("Aishu");
        System.out.println("After removing Aishu:");
        list.display();

        list.insertAt(1, "John");
        System.out.println("After inserting John at position 1:");
        list.display();

        System.out.println("Is 'Raj' in the list? " + list.search("Raj"));

        list.reverse();
        System.out.println("After reversing:");
        list.display();

        System.out.println("Length of the list: " + list.length());

        list.removeFirst();
        System.out.println("After removing first element:");
        list.display();

        list.removeLast();
        System.out.println("After removing last element:");
        list.display();

        System.out.println("Is the list empty? " + list.isEmpty());
    }
}