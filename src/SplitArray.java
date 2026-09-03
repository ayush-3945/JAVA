import java.util.Scanner;

public class SplitArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find minimum and maximum indexes
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }

            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        // Make sure first is the smaller index
        int first = Math.min(minIndex, maxIndex);
        int second = Math.max(minIndex, maxIndex);

        // First Part
        for (int i = 0; i < first; i++) {
            System.out.println(arr[i]);
        }

        // Second Part
        for (int i = first; i < second; i++) {
            System.out.println(arr[i]);
        }

        // Third Part
        for (int i = second; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}