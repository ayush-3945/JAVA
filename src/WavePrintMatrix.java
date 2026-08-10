import java.util.ArrayList;
import java.util.List;
public class WavePrintMatrix {
    static List<Integer> wavePrint(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int col = 0; col < cols; col++) {
            if ((col & 1) == 0) {
                // Even column -> Top to Bottom
                for (int row = 0; row < rows; row++) {
                    result.add(matrix[row][col]);
                }
            } else {
                // Odd column -> Bottom to Top
                for (int row = rows - 1; row >= 0; row--) {
                    result.add(matrix[row][col]);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        List<Integer> ans = wavePrint(matrix);
        System.out.println(ans);
    }
}