import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {

        // ============ HashSet ============
        // No duplicates, No order!
        System.out.println("==============================");
        System.out.println("1. HashSet");
        System.out.println("==============================");
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(40);
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(20);
        hashSet.add(10);  // ❌ duplicate — nahi jayega!
        System.out.println("HashSet : " + hashSet);
        // Order random hoga!

        // ============ LinkedHashSet ============
        // No duplicates, Order MAINTAIN hota hai!
        System.out.println("\n==============================");
        System.out.println("2. LinkedHashSet");
        System.out.println("==============================");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(40);
        linkedHashSet.add(10);
        linkedHashSet.add(30);
        linkedHashSet.add(20);
        linkedHashSet.add(10);  // ❌ duplicate — nahi jayega!
        System.out.println("LinkedHashSet : " + linkedHashSet);
        // Insertion order maintain hogi!

        // ============ TreeSet ============
        // No duplicates, Sorted order!
        System.out.println("\n==============================");
        System.out.println("3. TreeSet");
        System.out.println("==============================");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(10);  // ❌ duplicate — nahi jayega!
        System.out.println("TreeSet : " + treeSet);
        // Automatically sorted hoga!

        // ============ Common Methods ============
        System.out.println("\n==============================");
        System.out.println("Common Methods");
        System.out.println("==============================");

        // contains()
        System.out.println("contains(10) : " + treeSet.contains(10));
        System.out.println("contains(99) : " + treeSet.contains(99));

        // remove()
        treeSet.remove(10);
        System.out.println("remove(10)   : " + treeSet);

        // size()
        System.out.println("size()       : " + treeSet.size());

        // isEmpty()
        System.out.println("isEmpty()    : " + treeSet.isEmpty());
    }
}