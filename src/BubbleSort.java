public class BubbleSort {

    static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
    static void main(){
        int arr[] = {1,3,5,6};
        bubbleSort(arr);
        System.out.println("Printing Sorted Array");
        for(int value: arr){
            System.out.println(value + " " );
        }
    }
}
