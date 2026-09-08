import java.util.*;

public class CompareArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] A = new int[m];
        int[] B = new int[n];

        for (int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        // For every element of B
        for (int i = 0; i < n; i++) {
            int count = 0;

            // Check all elements of A
            for (int j = 0; j < m; j++) {
                if (A[j] > B[i]) {
                    count++;
                }
            }
            System.out.print(count + " ");
        }
    }
}