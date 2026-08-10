public class SortZeroOne {

    static void sortZeroOne(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] == 1 && nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if (nums[i] == 0) {
                i++;
            }
            if (nums[j] == 1) {
                j--;
            }
        }
        for (int k : nums) {
            System.out.print(k + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr1[] = {1, 0, 1, 0, 1};
        sortZeroOne(arr1);
        int arr2[] = {0, 0, 1, 1, 0};
        sortZeroOne(arr2);
        int arr3[] = {1, 1, 1, 0, 0};
        sortZeroOne(arr3);
    }
}