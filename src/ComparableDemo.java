import java.util.ArrayList;
import java.util.Collections;

class ComparableStudent implements Comparable<ComparableStudent> {

    String name;
    int marks;

    public ComparableStudent(String name, int marks) {
        this.name  = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(ComparableStudent other) {
        return this.marks - other.marks;
    }

    @Override
    public String toString() {
        return name + " → " + marks;
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        ArrayList<ComparableStudent> list = new ArrayList<>();
        list.add(new ComparableStudent("Ram",   95));
        list.add(new ComparableStudent("Shyam", 87));
        list.add(new ComparableStudent("Mohan", 92));
        list.add(new ComparableStudent("Rohan", 78));

        System.out.println("Before Sort:");
        for (ComparableStudent s : list) {
            System.out.println(s);
        }

        Collections.sort(list);
        System.out.println("\nAfter Sort (Ascending):");
        for (ComparableStudent s : list) {
            System.out.println(s);
        }

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("\nAfter Sort (Descending):");
        for (ComparableStudent s : list) {
            System.out.println(s);
        }
    }
}