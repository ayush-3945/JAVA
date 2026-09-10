import java.util.*;

public class MaximumProfit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minPrice = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {

            // Profit if we sell today
            int profit = arr[i] - minPrice;

            // Update maximum profit
            if (profit > maxProfit) {
                maxProfit = profit;
            }

            // Update minimum buying price
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }
        }

        System.out.println(maxProfit);
    }
}