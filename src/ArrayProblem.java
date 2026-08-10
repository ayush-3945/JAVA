public class ArrayProblem {

//    // ==========================================
//    // PROGRAM 1 : Find the Average of Array Elements
//    // ==========================================
//    static double getAverage(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        double avg = (double) sum / arr.length;
//        return avg;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("===== PROGRAM 1: Average =====");
//        int[] arr1 = {2, 3, 3, 4};
//        System.out.println(getAverage(arr1));
//    }

//    // ==========================================
//    // PROGRAM 2 : Multiply Each Element of Array by 10
//    // ==========================================
//    static int[] multiplyBy10(int[] arr) {
//        int size = arr.length;
//        int newArray[] = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            int element = arr[i];
//            int newElement = element * 10;
//            newArray[i] = newElement;
//        }
//        // return updated array
//        return newArray;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("===== PROGRAM 2: Multiply by 10 =====");
//        int arr2[] = {1, 2, 3, 4, 5};
//        int ans2[] = multiplyBy10(arr2);
//        System.out.println("Printing ans array: ");
//        for (int i : ans2) {
//            System.out.println(i);
//        }
//    }

//    // ==========================================
//    // PROGRAM 3 : Search for an Element (Linear Search)
//    // ==========================================
//    static boolean findTarget(int arr[], int target) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("===== PROGRAM 3: Linear Search =====");
//        int arr3[] = {1, 2, 3, 5, 6, 7, 8, 9};
//        boolean ans3 = findTarget(arr3, 8);
//        System.out.println(ans3);
//    }

//    // ==========================================
//    // PROGRAM 4 : Find the Maximum Element in an Array
//    // ==========================================
//    static int getMaximum(int arr[]) {
//        int maximum = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > maximum) {
//                maximum = arr[i];
//            }
//        }
//        return maximum;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("===== PROGRAM 4: Maximum Element =====");
//        int arr4[] = {1, 3, 4, 7, 8};
//        System.out.println(getMaximum(arr4));
//    }

//    // ==========================================
//    // PROGRAM 5 : Return Sum of +ve and -ve Numbers
//    // ==========================================
//    static int[] getPosNegSum(int arr[]) {
//        int posSum = 0;
//        int negSum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                posSum = posSum + arr[i];
//            } else {
//                negSum = negSum + arr[i];
//            }
//        }
//        int ans[] = {posSum, negSum};
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("===== PROGRAM 5: Pos Neg Sum =====");
//        int arr5[] = {1, 3, -5, -6, 7, 8};
//        int ans5[] = getPosNegSum(arr5);
//        System.out.println("Positive SUM " + ans5[0]);
//        System.out.println("Negative SUM " + ans5[1]);
//    }

//    // ==========================================
//    // PROGRAM 6 : Count the Number of Zeroes and Ones
//    // ==========================================
//    static int[] getZeroOneCount(int arr[]) {
//        int ZeroCount = 0;
//        int OneCount = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                ZeroCount++;
//            } else {
//                OneCount++;
//            }
//        }
//        int ans[] = {ZeroCount, OneCount};
//        return ans;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("===== PROGRAM 6: Zero One Count =====");
//        int arr6[] = {1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0};
//        int ans6[] = getZeroOneCount(arr6);
//        System.out.println("ZeroCount = " + ans6[0]);
//        System.out.println("OneCount  = " + ans6[1]);
//    }


    // ==========================================
    // PROGRAM 7 : Find First Unsorted Element in Array
    // ==========================================
    static int getUnsortedElement(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                return arr[i + 1];
            }
        }
        // Jis case me main loop se bahar ajaunga
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("===== PROGRAM 7: First Unsorted Element =====");
        int arr7[] = {1, 2, 5, 4, 9};
        System.out.println(getUnsortedElement(arr7));
    }
}
