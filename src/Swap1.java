import java.util.*;

public class Swap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Swap every K elements with the next K elements
        for (int i = 0; i < n; i += 2 * k) {
            for (int j = 0; j < k; j++) {
                int temp = arr[i + j];
                arr[i + j] = arr[i + k + j];
                arr[i + k + j] = temp;
            }
        }

        // Print array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "");
        }
    }
}