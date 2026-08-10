public class BitwiseOperatorsQuestion {

    // Problem 1 — Even Odd
    static void evenOdd(int n) {
        if ((n & 1) == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }

    // Problem 2 — Power of 2
    static boolean isPowerOf2(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    // Problem 3 — Count Set Bits
    static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n = n >> 1;
        }
        return count;
    }

    // Problem 4 — Find Unique
    static int findUnique(int[] arr) {
        int result = 0;
        for (int x : arr) {
            result = result ^ x;
        }
        return result;
    }

    // Problem 5 — Swap
    static void swap(int a, int b) {
        System.out.println("Before: a=" + a + " b=" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After : a=" + a + " b=" + b);
    }

    public static void main(String[] args) {

        System.out.println("== Problem 1: Even Odd ==");
        evenOdd(4);
        evenOdd(7);

        System.out.println("\n== Problem 2: Power of 2 ==");
        System.out.println("4 power of 2? : " + isPowerOf2(4));
        System.out.println("5 power of 2? : " + isPowerOf2(5));

        System.out.println("\n== Problem 3: Count Set Bits ==");
        System.out.println("13 ke set bits : " + countSetBits(13));

        System.out.println("\n== Problem 4: Find Unique ==");
        int[] arr = {2, 3, 5, 3, 2};
        System.out.println("Unique number : " + findUnique(arr));

        System.out.println("\n== Problem 5: Swap ==");
        swap(10, 20);
    }
}