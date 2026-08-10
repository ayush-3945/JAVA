public class BitwiseOperators {
    public static void main(String[] args) {

        int a = 5;  // 0101
        int b = 3;  // 0011

        // ============ AND & ============
        // Dono bit 1 hoon tabhi 1!
        System.out.println("AND (a & b)  : " + (a & b));  // 1

        // ============ OR | ============
        // Koi ek bhi 1 ho toh 1!
        System.out.println("OR  (a | b)  : " + (a | b));  // 7

        // ============ XOR ^ ============
        // Dono alag hoon tabhi 1!
        System.out.println("XOR (a ^ b)  : " + (a ^ b));  // 6

        // ============ NOT ~ ============
        // 0→1, 1→0!
        System.out.println("NOT (~a)     : " + (~a));      // -6

        // ============ Left Shift << ============
        // Har shift = x2!
        System.out.println("Left  (a<<1) : " + (a << 1)); // 10
        System.out.println("Left  (a<<2) : " + (a << 2)); // 20

        // ============ Right Shift >> ============
        // Har shift = /2!
        System.out.println("Right (a>>1) : " + (a >> 1)); // 2

        // ============ DSA Tricks ============
        System.out.println("\n== DSA Tricks ==");

        // Even/Odd check
        System.out.println("4 even hai?   : " + ((4 & 1) == 0));
        System.out.println("5 even hai?   : " + ((5 & 1) == 0));

        // Power of 2 check
        System.out.println("4 power of 2? : " + ((4 & (4-1)) == 0));
        System.out.println("5 power of 2? : " + ((5 & (5-1)) == 0));


        System.out.println("\n== Swap using XOR ==");
        int x = 10, y = 20;
        System.out.println("Before: x=" + x + " y=" + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After : x=" + x + " y=" + y);




    }
}