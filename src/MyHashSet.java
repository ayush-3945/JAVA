import java.util.HashSet;

//HashSet = Ek aisi list jisme duplicates NAHI hote!
//
//Aur koi order nahi hota elements ka!

public class MyHashSet {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // ============ add() ============
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);  // ❌ duplicate — nahi jayega!
        set.add(20);  // ❌ duplicate — nahi jayega!
        System.out.println("HashSet    : " + set);

        // ============ contains() ============
        // Element hai ya nahi?
        System.out.println("contains(10) : " + set.contains(10));
        System.out.println("contains(99) : " + set.contains(99));

        // ============ remove() ============
        set.remove(20);
        System.out.println("remove(20) : " + set);

        // ============ size() ============
        System.out.println("size()     : " + set.size());

        // ============ isEmpty() ============
        System.out.println("isEmpty()  : " + set.isEmpty());

        // ============ clear() ============
        set.clear();
        System.out.println("clear()    : " + set);
    }
}
