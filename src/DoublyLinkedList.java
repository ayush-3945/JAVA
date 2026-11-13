public class DoublyLinkedList {

    // ============================
    // Node Class
    // ============================
    static class Node {
        int data;
        Node previous;
        Node next;

        Node(int data) {
            this.data     = data;
            this.next     = null;
            this.previous = null;
        }
    }

    // data members
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // ============================
    // Insert At Head
    // ============================
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next  = head;
            head.previous = newNode;
            //head update
            head = newNode;
        }
        //1 node add hui h LL me
        size++;
    }

    // ============================
    // Insert At Tail
    // ============================
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.previous = tail;
            tail.next        = newNode;
            //tail update
            tail = newNode;
        }
        //1 node add hui h
        size++;
    }

    // ============================
    // Insert At Position (1-indexed)
    // ============================
    public void insertAtPosition(int position, int data) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            insertAtHead(data);
            return;
        }
        if (position == size + 1) {
            insertAtTail(data);
            return;
        }
        //in between kahin pr node insert krne ko bola h
        Node temp = head;
        for (int i = 1; i <= position - 2; i++) {
            temp = temp.next;
        }
        //ab mera temp prevNode pr aa chuka h
        Node prevNode  = temp;
        Node nextNode  = prevNode.next;
        Node currNode  = new Node(data);

        //ab change links
        currNode.previous = prevNode;
        prevNode.next     = currNode;
        currNode.next     = nextNode;
        nextNode.previous = currNode;
        //1 node add hui h
        size++;
    }

    // ============================
    // Traversal Forward
    // ============================
    public void printList() {
        if (head == null) {
            System.out.println("LL is empty, cannot print anything");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    // ============================
    // Traversal Backward
    // ============================
    public void printBackward() {
        if (tail == null) {
            System.out.println("LL is empty, cannot print anything");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "<-");
            temp = temp.previous;
        }
        System.out.println();
    }

    // ============================
    // Search an Element in LL
    // ============================
    public boolean searchInLL(int target) {
        if (head == null) {
            System.out.println("NO Nodes inside LL");
            return false;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            } else {
                temp = temp.next;
            }
        }
        return false;
    }

    // ============================
    // Updation in LL
    // ============================
    public void updateValue(int oldValue, int newValue) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Value not found!");
    }

    // ============================
    // Delete Head
    // ============================
    public void deleteHead() {
        if (head == null) {
            System.out.println("NO Need to delete");
            return;
        }
        //single node
        if (head == tail) {
            head   = null;
            tail   = null;
            size   = 0;
            return;
        }
        //LL has more than 1 node
        head          = head.next;
        head.previous = null;
        //size update
        size--;
    }

    // ============================
    // Delete Tail
    // ============================
    public void deleteTail() {
        if (tail == null) {
            System.out.println("NO Need to delete");
            return;
        }
        //single node
        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return;
        }
        //LL has more than 1 node
        tail      = tail.previous;
        tail.next = null;
        //size update
        size--;
    }

    // ============================
    // Delete At Position (1-indexed)
    // ============================
    public void deleteAtPosition(int position) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        // position = 1
        if (position == 1) {
            deleteHead();
            return;
        }
        // position == size
        if (position == size) {
            deleteTail();
            return;
        }
        // main logic
        Node temp = head;
        for (int i = 1; i <= position - 1; i++) {
            temp = temp.next;
        }
        Node prevNode = temp.previous;
        Node nextNode = temp.next;
        prevNode.next     = nextNode;
        nextNode.previous = prevNode;
        temp.next     = null;
        temp.previous = null;
        size--;
    }

    // ============================
    // Get Size
    // ============================
    public int getSize() {
        return size;
    }

    // ============================
    // Main Method
    // ============================
    public static void main(String[] args) {

        DoublyLinkedList myList = new DoublyLinkedList();

        // Insert At Head
        myList.insertAtHead(10);
        myList.printList();

        myList.insertAtHead(20);
        myList.printList();

        myList.insertAtHead(30);
        myList.printList();

        // Insert At Tail
        myList.insertAtTail(100);
        myList.printList();

        myList.insertAtTail(100);
        myList.printList();

        myList.insertAtTail(100);
        myList.printList();

        // Insert At Position
        myList.insertAtPosition(1, 5000);
        myList.printList();

        // Print Backward
        myList.printBackward();

        // Search
        System.out.println("Found or not: " + myList.searchInLL(5000));

        // Delete Head
        myList.deleteHead();
        myList.printList();

        myList.deleteHead();
        myList.printList();

        myList.deleteHead();
        myList.printList();

        // LL empty check
        myList.deleteHead();
        myList.deleteHead();
        myList.deleteHead();
        myList.deleteHead();
        myList.printList();
    }
}