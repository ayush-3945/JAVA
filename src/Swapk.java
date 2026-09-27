import java.util.*;
public class Swapk{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][] arr = new int[n][m];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Swap
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < k; j++) {

                int temp = arr[i][m - k + j];
                arr[i][m - k + j] = arr[n - 1 - i][j];
                arr[n - 1 - i][j] = temp;
            }
        }

        // Print matrix
        //again we are using 2 for loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}