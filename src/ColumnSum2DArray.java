import java.util.ArrayList;
import java.util.List;

public class ColumnSum2DArray {
    static List<Integer> columnSums(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int col = 0; col < n; col++) {
            int sum = 0;
            for (int row = 0; row < m; row++) {
                sum += matrix[row][col];
            }
            result.add(sum);
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> ans = columnSums(matrix);
        System.out.println(ans);
    }
}