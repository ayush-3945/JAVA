import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ListInterface {
    public static void main(String[] args) {

        // List/Collection = Interface
        // ArrayList = Concrete class

        List<Integer> list = new ArrayList<>();

        // Add karo
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.remove(0);
        System.out.println(list);// ✅ [10, 20, 30, 40, 50]

        // ============ addAll() ============
        // Ek puri list ko doosri mein add karo!
        List<Integer> list2 = new ArrayList<>();
        list2.add(60);
        list2.add(70);
        list2.add(80);

        list.addAll(list2);   // list2 ke sab elements list mein add!
        System.out.println("After addAll()    : " + list);

        // ============ removeAll() ============
        // Ek list ke elements doosri list se remove karo!
        list.removeAll(list2);  // list2 ke elements list se hatao!
        System.out.println("After removeAll() : " + list);

        // ============ containsAll() ============
        // Check karo — kya list mein ye sab elements hain?
        List<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(20);

        System.out.println("containsAll()     : " + list.containsAll(list3)); // true

        // ============ clear() ============
        // Poori list khali kar do!
        list.clear();
        System.out.println("After clear()     : " + list);  // []
        System.out.println("isEmpty()         : " + list.isEmpty()); // true


    //4.Iterator =  List ke elements ek ek karke access karne ka tarika!
        //for loop ki jagah use karte hain — safe way hai elements traverse karne ka!

        // List banao
        ArrayList<Integer> list4 = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List : " + list);

        // Iterator banao
        Iterator<Integer> it = list.iterator();

        // Ek ek karke element nikalo
        while (it.hasNext()) {
            int val = it.next();
            System.out.println(val);
        }
    }
}