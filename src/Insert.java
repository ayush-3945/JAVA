import java.util.Vector;

public class Insert {
    public static void main(String[] args) {

        Vector<String> vec = new Vector<>();

        // Normal insertion
        vec.add("Apple");
        vec.add("Banana");
        vec.add("Cherry");

        // Insert at specific index
        vec.add(1, "Mango");

        System.out.println(vec);
    }
}