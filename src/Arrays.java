import java.util.Scanner;


 // 1D array
public class Arrays {
    static void main(){
        //Declaration
        //int arr[];
        //Allocation
        //arr = new int[5];
        //Initialization
        //int brr[] = {10,20,30};
    //Using For Each Loop
//        int n = brr.length;
//        for(int value : brr){
//            System.out.println(value);
//        }
        //using for loop
//        for(int index = 0; index<= n-1; index++){
//            System.out.println(brr[index]);
//        }

//
//        System.out.println("Value at 0 index: " + brr[0]);
//        System.out.println("Value at 1 index: " + brr[1]);
//        System.out.println("Value at 2 index: " + brr[2]);
    //Taking Input in Array
//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        //input
//        for(int i = 1; i<=n-1; i++){
//            System.out.println("Provide input for index " + i);
//            arr[i] = sc.nextInt();
//        }
//
//        //print
//        for(int val : arr){
//            System.out.println(val);
//        }

//        int arr[] = {10,20,30,40,50};
//        int n = arr.length;
//
//        for(int i = 0; i<=n-1; i++){
//            System.out.println(arr[i]);
//        }

        //How to print sum in array

//        int arr[] = {10,20,30,40,50};
//        int sum = 0;
//
//        int n = arr.length;
//
//        for(int i =0; i<=n-1; i++){
//            int value = arr[i];
//            sum = sum + value;
//
//        }
//        System.out.println(sum);


        //find the maximum value in array

//        int arr[] = {3,2,-5,21,10};
//        int n = arr.length;
//
//        int maxValue = arr[0];
//
//        for(int i =0; i<n-1; i++){
//            if(arr[i]> maxValue){
//                maxValue = arr[i];
//            }
//        }
//        System.out.println(maxValue);

        //find the minimum value in array

//        int arr[] = {3,2,-5,21,10};
//        int n = arr.length;
//
//        int minValue = arr[0];
//        for(int i = 0; i<n-1; i++){
//            if(arr[i]<minValue){
//                minValue = arr[i];
//            }
//        }
//
//        System.out.println(minValue);


        //2D Array
        // declaration
//        int[][] arr;
//        //Allocation
//        arr  = new int [3][4];
//        //Initialization
//        int[][]brr = {
//                {1,2},
//                {2,3,4,5},
//                {3,4,4,5,6,7},
//                {4},
//        };
        //System.out.println(brr[2][0]);
//        int rowlength = brr.length;
//        int collength = brr[0].length;
//
//        for(int rowIndex = 0; rowIndex <=rowlength-1; rowIndex++){
//            for(int colIndex = 0; colIndex<=collength-1; colIndex++){
//                System.out.print(brr[rowIndex][colIndex] + " ");
//
//            }
//            System.out.println();
//        }

//        int rowlength = brr.length;
//
//
//        for(int rowIndex = 0; rowIndex <=rowlength-1; rowIndex++){
//            int collength = brr[rowIndex].length;
//            for(int colIndex = 0; colIndex<=collength-1; colIndex++){
//                System.out.print(brr[rowIndex][colIndex] + " ");
//
//            }
//            System.out.println();
//        }

        //traversal in 2D array

//        for(int rowIndex = 0; rowIndex<=brr.length-1; rowIndex++){
//            for(int colIndex = 0; colIndex<=brr[rowIndex].length-1; colIndex++){
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }

        //Taking input in 2Darray
//        int arr[][] = new int[3][4];
//
//        Scanner sc = new Scanner(System.in);
//
//        // Input
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr[i].length; j++) {
//
//                System.out.println(
//                        "Provide value for row-" + i + " and column-" + j
//                );
//
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        // Print
//        for (int rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
//
//            for (int colIndex = 0;
//                 colIndex <= arr[rowIndex].length - 1;
//                 colIndex++) {
//
//                System.out.print(arr[rowIndex][colIndex] + " ");
//            }
//
//            System.out.println();
//        }

        //Find sum in 2D Array

        int arr[][] = {{1,2,3},{1,2,3}};
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){
                int value = arr[i][j];
                sum = sum + value;
            }
            System.out.println(sum);
        }



    }
}
