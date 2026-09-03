
import java.util.Vector;

public class Erase {

    public static void main(String[] args) {

        Vector<String> vec = new Vector<>();

        vec.add("Apple");
        vec.add("Banana");
        vec.add("Cherry");

        vec.remove(1);

        System.out.println(vec);
    }
}