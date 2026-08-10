public class SelectionSort {
    static void SelectionSort(int arr[]){

        int n = arr.length;
        for(int i =0; i<n-1; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] <arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    static void main(){
        int arr[] = {1,3,4,5};
        SelectionSort(arr);
        System.out.println("Printing Sorted Array");
        for(int value: arr){
            System.out.println(value);
        }


    }


}
