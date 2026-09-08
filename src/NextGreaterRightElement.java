import java.util.Scanner;

public class NextGreaterRightElement {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

            //Now Next Greater Right Element

            for(int i = 0; i<n; i++){

                int nextgreater = 0;
                for(int j = i+1; j<n; j++){
                    if(arr[j] > arr[i]){
                        nextgreater = arr[j];
                        break;
                    }
                }
                System.out.println(nextgreater + " ");
            }
        }
    }
