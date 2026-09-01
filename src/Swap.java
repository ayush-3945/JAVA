import java.util.Scanner;

public class Swap {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][]arr = new int[n][m];
        //Input Matrix
        for(int i = 0; i<n/2; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //Swapping
        for(int i = 0; i<n/2; i++) {
            int oppositeRow = n - 1 - i;

            for (int j = 0; j < m; j++) {
                int lastelement = m - j + k;

                int temp = arr[i][lastelement];
                arr[i][lastelement] = arr[oppositeRow][i];
                arr[oppositeRow][i] = temp;
            }
        }
        //Print the Mtarix
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.println(arr[i][j]+ "");
            }
            System.out.println();
        }
    }
}
