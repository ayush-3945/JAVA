import java.util.HashMap;

public class ArrayManipulation {

    // PROGRAM 1 : Reverse an Array
    // Two Pointer technique use hoti hai
    // i shuru se aata hai, j end se aata hai
    // Dono milte milte swap karte hain!
//    static void reverseArray(int arr[]) {
//        int n = arr.length;
//        int i = 0;      // i = shuru se
//        int j = n - 1;  // j = end se
//        while (i <= j) {
//            // Swap karo i aur j wale elements
//            int temp = arr[i];  // temp mein i wala store karo
//            arr[i] = arr[j];    // i ki jagah j wala daalo
//            arr[j] = temp;      // j ki jagah temp (purana i) daalo
//            // i ko aage bhadao
//            i++;
//            // j ko piche lao
//            j--;
//        }
//        // Now your array has been reversed
//        // print karo reversed array
//        for (int k : arr) {
//            System.out.println(k);
//        }
//    }
    // main method — reverseArray test karo
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5};
//        reverseArray(arr);  // Output: 5 4 3 2 1
//    }
//
//    // ==========================================
//    // PROGRAM 2 : Shift Array Elements by 1 Position
//    // Last element pehle aa jaata hai
//    // Baaki sab ek position aage shift ho jaate hain
//    // Example: {1,2,3,4,5} → {5,1,2,3,4}
//    // ==========================================
//    static void shiftBy1(int arr[]) {
//        // step 1: Store kar lo last waley ki value
//        // kyunki wo overwrite ho jaayegi!
//        int n = arr.length;
//        int temp = arr[n - 1];  // last element save karo
//
//        // step 2: shift all values of array
//        // Peeche se shuru karo aur har element ko ek aage karo
//        for (int i = n - 1; i > 0; i--) {
//            arr[i] = arr[i - 1];  // current = previous
//        }
//
//        // step 3: temp ki value ko 0 index per le jao
//        // last element ab pehle aa gaya!
//        arr[0] = temp;
//    }
//
//    // main method — shiftBy1 test karo
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5};
//        shiftBy1(arr);  // Output: 5 1 2 3 4
//        for (int a : arr) {
//            System.out.print(a + " ");
//        }
//        System.out.println();
//    }

//    // PROGRAM 3 : Print Extreme Elements in Alternate Manner
//    // Pehle first, phir last, phir second, phir second last...
//    // Example: {1,2,3,4,5} → 1,5,2,4,3
//    // Two pointer use hota hai!
//    static void printAlternate(int arr[]) {
//        int n = arr.length;
//        int i = 0;      // i = shuru se
//        int j = n - 1;  // j = end se
//
//        while (i <= j) {
//            if (i == j) {
//                // Jab i aur j same ho — middle element hai
//                // Sirf ek baar print karo!
//                System.out.println(arr[i]);
//                return;
//            } else {
//                // Pehle left wala print karo
//                System.out.println(arr[i]);
//                i++;  // i aage badho
//                // Phir right wala print karo
//                System.out.println(arr[j]);
//                j--;  // j piche aao
//            }
//        }
//    }
//    // main method — printAlternate test karo
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5};
//        printAlternate(arr);  // Output: 1,5,2,4,3
//    }

//    // PROGRAM 4 : Identify Elements with Highest and Lowest Frequency
//    // HashMap use karke frequency count karo
//    // Phir max aur min frequency wala element dhundho
//    // Example: {1,2,2,3,3,3} → Highest=3, Lowest=1
    static int[] getHighestLowestFreqElement(int arr[]) {

        // Step 1 — Frequency Map banao
        // Har element kitni baar aaya — store karo!
        HashMap<Integer, Integer> freq = new HashMap<>();

        // insert data — har element ki frequency count karo
        for (int num : arr) {
            // getOrDefault — agar pehle se hai toh value lo
            // nahi hai toh 0 lo, phir +1 karo
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // hashmap is ready!

        // Step 2 — Highest Frequency nikalo
        // MIN_VALUE se shuru karo taaki koi bhi number
        // isse zyada hoga aur update hoga!
        int highestFreq = Integer.MIN_VALUE;
        int highestNum  = -1;

        for (int key : freq.keySet()) {
            int currentKey  = key;              // current element
            int currentFreq = freq.get(key);    // uski frequency

            if (currentFreq > highestFreq) {
                // highest ko update karna chahiye
                highestFreq = currentFreq;  // nai max frequency
                highestNum  = currentKey;   // naya max element
            }
        }

        // Step 3 — Lowest Frequency nikalo
        // MAX_VALUE se shuru karo taaki koi bhi number
        // isse chota hoga aur update hoga!
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum  = -1;

        for (int key : freq.keySet()) {
            int currentKey  = key;              // current element
            int currentFreq = freq.get(key);    // uski frequency

            if (currentFreq < lowestFreq) {
                // lowest ko update karna chahiye
                lowestFreq = currentFreq;   // nai min frequency
                lowestNum  = currentKey;    // naya min element
            }
        }

        // Step 4 — Answer array mein return karo
        // ans[0] = highest, ans[1] = lowest
        int ans[] = {highestNum, lowestNum};
        return ans;
    }

    // main method — getHighestLowestFreqElement test karo
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5};
        int ans[] = getHighestLowestFreqElement(arr);
        System.out.println("Highest Frequency Element : " + ans[0]);
        System.out.println("Lowest  Frequency Element : " + ans[1]);
    }

//    // ==========================================
//    // PROGRAM 5 : Find the Mode of the Array
//    // Mode = Sabse zyada baar aane wala element!
//    // HashMap se frequency count karo
//    // Phir sabse zyada frequency wala dhundho
//    // Example: {1,2,2,3,3,3} → Mode = 3
//    // ==========================================
//    static void getMode(int arr[]) {
//        // Step 1 — Frequency map banao
//        HashMap<Integer, Integer> freq = new HashMap<>();
//        for (int num : arr) {
//            freq.put(num, freq.getOrDefault(num, 0) + 1);
//        }
//        // Step 2 — Har element ki frequency print karo
//        for (int i : freq.keySet()) {
//            // i = element, freq.get(i) = uski frequency
//            System.out.println(i + " -> " + freq.get(i));
//        }
//    }
//
//    // main method — getMode test karo
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
//        getMode(arr);
//        // Output:
//        // 1 -> 1
//        // 2 -> 2
//        // 3 -> 3
//        // 4 -> 4
//        // 5 -> 5 ← Mode!
//    }
//
}