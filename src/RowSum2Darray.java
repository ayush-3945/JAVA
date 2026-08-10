import java.util.ArrayList;
import java.util.List;

public class RowSum2Darray {
    static List<Integer> rowSums(int[][] arr) {
        List<Integer> result = new ArrayList<>();
        int m = arr.length;       // total rows
        int n = arr[0].length;    // total columns
        // Outer loop — Row pe ghumo
        for (int row = 0; row < m; row++) {
            int sum = 0;           // har naye row pe sum reset!
            // Inner loop — Column pe ghumo (current row ka)
            for (int col = 0; col < n; col++) {
                int value = arr[row][col];
                sum = sum + value;
            }
            // Row ka sum ready — result mein add karo!
            result.add(sum);
        }
        return result;
    }
    public static void main(String[] args) {
        // Test Case 1
        int arr1[][] = {
                {8,9,0},
                {3, 9, 5},
                {8, 2, 1}
        };
        System.out.println("Row Sums : " + rowSums(arr1));
    }
}