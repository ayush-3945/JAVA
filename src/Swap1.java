import java.util.Scanner;

public class Swap1 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        //Swap every k element with the next k elements

        for(int i = 0; i<n; i++){
            for(int j = 0; j<k; j++){
                //Now we're using swap technique

                int temp = arr[i+j];
                arr[i+j] = arr[i+j+k];
                arr[i+j+k] = temp;
            }
        }
        //Print the array
        for(int i = 0; i<n; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
