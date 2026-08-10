import java.util.ArrayList;
import java.util.Collections;

public class ArrayInterface {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(10);
        System.out.println("Original : " + list);

        // ============ size() ============
        // List mein kitne elements hain?
        System.out.println("\nsize()    : " + list.size());

        // ============ sort() ============
        // List ko ascending order mein sort karo!
        Collections.sort(list);
        System.out.println("sort()    : " + list);

        // ============ clone() ============
        // Ek copy banao list ki!
        ArrayList<Integer> list2 = (ArrayList<Integer>) list.clone();
        System.out.println("clone()   : " + list2);

        // ============ contains() ============
        // Kya ye element list mein hai?
        System.out.println("contains(10) : " + list.contains(10));  // true
        System.out.println("contains(99) : " + list.contains(99));  // false

        // ============ isEmpty() ============
        // Kya list khali hai?
        System.out.println("isEmpty() : " + list.isEmpty());  // false

        // ============ indexOf() ============
        // Element kaunsi position pe hai?
        System.out.println("indexOf(10) : " + list.indexOf(10));  // pehla 10

    }
}
