import java.util.ArrayList;
import java.util.List;

public class MissingElements {

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        // marking
        int n = nums.length;
        for (int index = 0; index < n; index++) {
            int value    = Math.abs(nums[index]);
            int position = value - 1;

            // mark kardo ye position
            if (nums[position] > 0) {
                nums[position] = -nums[position];
            }
        }

        // travel array — positive value = missing!
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                int valueAtThisIndex = i + 1;
                ans.add(valueAtThisIndex);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        // Test Case 1
        int arr1[] = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println("Missing : " + findDisappearedNumbers(arr1));
        // Output: [5, 6]

        // Test Case 2
        int arr2[] = {1, 1};
        System.out.println("Missing : " + findDisappearedNumbers(arr2));
        // Output: [2]

        // Test Case 3
        int arr3[] = {1, 2, 3, 2, 5, 1};
        System.out.println("Missing : " + findDisappearedNumbers(arr3));
        // Output: [4, 6]
    }
}