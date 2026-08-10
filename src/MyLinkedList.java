import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Original  : " + list);

        // ============ addFirst() ============
        // Shuru mein add karo!
        list.addFirst(5);
        System.out.println("addFirst(5)  : " + list);

        // ============ addLast() ============
        // End mein add karo!
        list.addLast(40);
        System.out.println("addLast(40)  : " + list);

        // ============ getFirst() ============
        // Pehla element dekho (remove nahi hoga!)
        System.out.println("getFirst()   : " + list.getFirst());

        // ============ getLast() ============
        // Aakhri element dekho (remove nahi hoga!)
        System.out.println("getLast()    : " + list.getLast());

        // ============ removeFirst() ============
        // Pehla element remove karo!
        list.removeFirst();
        System.out.println("removeFirst(): " + list);

        // ============ removeLast() ============
        // Aakhri element remove karo!
        list.removeLast();
        System.out.println("removeLast() : " + list);

        // ============ peek() ============
        // Pehla element dekho — remove nahi hoga!
        // ⚠️ List khali ho toh NULL return karta hai (exception nahi!)
        System.out.println("peek()       : " + list.peek());

        // ============ poll() ============
        // Pehla element dekho AUR remove bhi karo!
        // ⚠️ List khali ho toh NULL return karta hai (exception nahi!)
        System.out.println("poll()       : " + list.poll());
        System.out.println("After poll() : " + list);

        // ============ offer() ============
        // End mein add karo! (addLast() jaisa)
        list.offer(99);
        System.out.println("offer(99)    : " + list);
    }
}