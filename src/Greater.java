
import java.util.Scanner;
public class Greater {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Now we're using Brute Force Technique
        for (int i = 0; i<n; i++){
            int greater = 0;
            for(int j = 0 ;j<n; j++){

                if(arr[i]<arr[j]){
                    greater = arr[j];
                    break;
                }
            }
            System.out.println(greater + " ");
        }
    }
}
