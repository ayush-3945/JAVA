import java.util.HashMap;

public class FirstRepeatingElement {

    static int findFirstRepeatingElement(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // freq store
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Dobara loop — pehla element jiska freq > 1
        for (int i : arr) {
            if (freq.get(i) > 1) {
                return i;
            }
        }

        // agar koi bhi freq > 1 nahi h
        return -1;
    }

    public static void main(String[] args) {

        // Test Case 1
        int arr1[] = {10, 5, 3, 4, 3, 5, 6};
        System.out.println("First Repeating : " + findFirstRepeatingElement(arr1));
        // Output: 5

        // Test Case 2
        int arr2[] = {1, 2, 3, 4};
        System.out.println("First Repeating : " + findFirstRepeatingElement(arr2));
        // Output: -1

        // Test Case 3
        int arr3[] = {1, 2, 3, 2, 5, 1};
        System.out.println("First Repeating : " + findFirstRepeatingElement(arr3));
        // Output: 2
    }
}