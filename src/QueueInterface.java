import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Original : " + queue);

        // ============ add() ============
        // Element add karo — fail hone pe EXCEPTION!
        queue.add(40);
        System.out.println("add(40)    : " + queue);

        // ============ offer() ============
        // Element add karo — fail hone pe FALSE return!
        queue.offer(50);
        System.out.println("offer(50)  : " + queue);

        // ============ element() ============
        // Pehla element dekho — remove nahi hoga!
        // ⚠️ Queue khali ho toh EXCEPTION aata hai!
        System.out.println("element()  : " + queue.element());

        // ============ peek() ============
        // Pehla element dekho — remove nahi hoga!
        // ✅ Queue khali ho toh NULL return karta hai!
        System.out.println("peek()     : " + queue.peek());

        // ============ remove() ============
        // Pehla element HATAO aur return karo!
        // ⚠️ Queue khali ho toh EXCEPTION aata hai!
        System.out.println("remove()   : " + queue.remove());
        System.out.println("After remove() : " + queue);

        // ============ poll() ============
        // Pehla element HATAO aur return karo!
        // ✅ Queue khali ho toh NULL return karta hai!
        System.out.println("poll()     : " + queue.poll());
        System.out.println("After poll() : " + queue);
    }
}