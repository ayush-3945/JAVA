public class SingleLinkedList {

    // ============================
    // Node Class
    // ============================
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public SingleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // ============================
    // Insert at Head
    // ============================
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // ============================
    // Insert at Tail
    // ============================
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // ============================
    // Insert at Position (0-indexed)
    // ============================
    public void insertAtPosition(int data, int pos) {
        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 0) {
            insertAtHead(data);
            return;
        }
        if (pos == size) {
            insertAtTail(data);
            return;
        }
        Node newNode = new Node(data);
        Node curr = head;
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
    }

    // ============================
    // Delete Head
    // ============================
    public void deleteHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        size--;
    }

    // ============================
    // Delete Tail
    // ============================
    public void deleteTail() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node curr = head;
            while (curr.next != tail) {
                curr = curr.next;
            }
            curr.next = null;
            tail = curr;
        }
        size--;
    }

    // ============================
    // Delete at Position (0-indexed)
    // ============================
    public void deleteAtPosition(int pos) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 0) {
            deleteHead();
            return;
        }
        if (pos == size - 1) {
            deleteTail();
            return;
        }
        Node curr = head;
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }

    // ============================
    // Get Size
    // ============================
    public int getSize() {
        return size;
    }

    // ============================
    // Get Head
    // ============================
    public int getHead() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        return head.data;
    }

    // ============================
    // Get Tail
    // ============================
    public int getTail() {
        if (tail == null) {
            System.out.println("List is empty");
            return -1;
        }
        return tail.data;
    }

    // ============================
    // Search
    // ============================
    public boolean search(int target) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == target) return true;
            curr = curr.next;
        }
        return false;
    }

    // ============================
    // Find Position
    // ============================
    public int findPosition(int target) {
        Node curr = head;
        int pos = 0;
        while (curr != null) {
            if (curr.data == target) return pos;
            curr = curr.next;
            pos++;
        }
        return -1;
    }

    // ============================
    // Print List
    // ============================
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }

    // ============================
    // Main Method
    // ============================
    public static void main(String[] args) {

        SingleLinkedList mylist = new SingleLinkedList();

        // Empty list check
        mylist.printList();
        System.out.println("Size of LL: " + mylist.getSize());

        // Insert at Head
        mylist.insertAtHead(10);
        mylist.printList();

        mylist.insertAtHead(20);
        mylist.printList();

        mylist.insertAtHead(30);
        mylist.printList();

        // Insert at Tail
        mylist.insertAtTail(100);
        mylist.printList();

        mylist.insertAtTail(110);
        mylist.printList();

        mylist.insertAtTail(120);
        mylist.printList();

        // Insert at Position
        mylist.insertAtPosition(22, 1);
        mylist.printList();

        mylist.insertAtPosition(200, 8);
        mylist.printList();

        mylist.insertAtPosition(500, 5);
        mylist.printList();

        // Head, Tail, Search, FindPosition
        System.out.println("head data: " + mylist.getHead());
        System.out.println("tail data: " + mylist.getTail());
        System.out.println("Found or Not: " + mylist.search(2000));
        System.out.println("Position of 200 is: " + mylist.findPosition(200));
    }
}