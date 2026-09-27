public class SingleLinkedList {

    // ============================
    // Node
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
    // Insertion
    // ============================

    // Insert at beginning
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        // if LL is empty -> head and tail ko newNode pr point kardo
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        // increase the size by 1
        size++;
    }

    // Insert at end
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        // if LL is empty -> head and tail ko newNode pr point kardo
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        // increase the size by 1
        size++;
    }

    // Insert at given position (0-indexed)
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
        // pos se pehle wale node tak jao
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        // increase the size by 1
        size++;
    }

    // ============================
    // Traversal / Search / Update
    // ============================

    // Traversal
    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Length of LL
    public int length() {
        return size;
    }

    // Search an element in LL
    public boolean search(int data) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == data) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    // Updation in LL (update value at given position)
    public void update(int pos, int newData) {
        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position");
            return;
        }
        Node curr = head;
        for (int i = 0; i < pos; i++) {
            curr = curr.next;
        }
        curr.data = newData;
    }

    // ============================
    // Deletion
    // ============================

    // Delete head
    public void deleteHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        // agar sirf ek hi node hai
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        // decrease the size by 1
        size--;
    }

    // Delete tail
    public void deleteTail() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        // agar sirf ek hi node hai
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node curr = head;
            // second-last node tak jao
            while (curr.next != tail) {
                curr = curr.next;
            }
            curr.next = null;
            tail = curr;
        }
        // decrease the size by 1
        size--;
    }

    // Delete at given position (0-indexed)
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
        // pos se pehle wale node tak jao
        for (int i = 0; i < pos - 1; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        // decrease the size by 1
        size--;
    }
}