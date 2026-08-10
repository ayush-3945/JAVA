public class InsertionSort {
    static void selectionSort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion Sort
    static void insertionSort(int arr[]) {  

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int currValue = arr[i];
            int prev = i - 1;

            // Shift elements greater than currValue
            while (prev >= 0 && arr[prev] > currValue) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Place current element
            arr[prev + 1] = currValue;
        }
    }

    static void printArray(int arr[]) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
