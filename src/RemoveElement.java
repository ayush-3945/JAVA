import java.util.Scanner;

public class RemoveElement {

    public static void main(String[]arga){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Count Occurance of 1
        int count = 0;

        for(int i = 0; i<n; i++){
            if(arr[i]  == 1){
                count++;

                //Remove the element at the index
                for(int j = count; i<n-1; i++){
                    arr[i] = arr[i+1];
                }

                //Print the modified array
                for(int j = 0; i<n-1; i++){
                    System.out.println(arr[i] + "");
                }
            }
        }
    }
}
