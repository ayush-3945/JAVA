public class BasicsMaths {

//    static void printDigits(int num) {
//        //1. Print Digit of a number
//
//        // agar mera num = 0, toh main ruk jaunga
//        // agar mera num != 0, toh main processing karta hu
//
//        while (num != 0) {
//
//            int digit = num % 10;
//            System.out.println(digit);
//
//            // last digit remove
//            num = num / 10;
//        }
//    }
//    static void main() {
//        int num = 53127;
//        printDigits(num);


    //2. Count of a number
//        static int countDigits(int num){
//            int count = 0;
//            while(num != 0){
//                int digit = num%10;
//                count++;
//                num  = num/10;
//            }
//            return count;
//        }
//        static void main(){
//            int num = 51324;
//            int ans = countDigits(num);
//            System.out.println(ans);
//

    //3. Sum of each digit

//    static int sumDigits(int num) {
//        int sum = 0;
//        while (num != 0) {
//            int digits = num % 10;
//            sum = sum+digits;
//            num = num / 10;
//        }
//        return sum;
//    }
//    static void main(){
//        int num = 51234;
//        int sum = sumDigits(num);
//        System.out.println(sum);

    //4. Reverse a Number

//    static int reverseNumber(int num){
//        int revNumber = 0;
//        while (num!=0){
//            int digits = num%10;
//            num = num/10;
//            revNumber = revNumber*10+digits;
//
//        }
//        return revNumber;
//    }
//    static void main(){
//        int num = 512345;
//       int revNumber = reverseNumber(num);
//        System.out.println(revNumber);

    //5. Palindrome Number

//    static boolean isPalindrome(int num){
//        int originalNum = num;
//        int reverseNum = reverseNum(num);
//        if(originalNum == reverseNum){
//            System.out.println("It is a Palindrome");
//            return true;
//        }
//        else {
//            System.out.println("It is not a Palindrome");
//            return false;
//        }
//    }
//    static void main(){
//        boolean ans = isPalindrome(1221);
//        System.out.println(ans);


    //Prime Numbers

//    static boolean isPrimeOrNot(int num) {
//
//        for (int i = 2; i <= num - 1; i++) {
//            if (num % i == 0) {
//                // not a prime
//                return false;
//            }
//        }
//        // loop se bahar nikle matlab
//        // kisi bhi number se divide nahi hua
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int num = 12;
//        System.out.println(isPrimeOrNot(num));

    //GCD Of a Number
//    static int getGCD(int a , int b ){
//        //gcd(a,b) = gcd(b,a%b);
//        while(b!=0){
//            int olfvalueOfb = b;
//            b = a%b;
//            a = olfvalueOfb;
//
//        }
//        //jab mera b 0 hoga tab mujhe a ki place per gcd milega
//        int ans = a;
//        return ans;
//    }
//    static void main(){
//        System.out.println(getGCD(18,12));

    //LCM of a Numberr

//    static int getGCD(int a , int b){
//        return 1;
//    }
//    static int getLCM(int a , int b){
//        int gcd = getGCD(a,b);
//        //gcd(18,12) = 6
//        int product = a*b;
//        //product(a,b) = 216
//        int lcm = product/gcd;
//        return lcm;
//    }
//    static void main(){
//        System.out.println(getLCM(18,12));

    //Armstrong Number

//    static boolean isArmstrongNumber(int num){
//        int sum = 0;
//        int originalNum = num;
//        while(num!=0){
//
//            int digit = num%10;
//            int cubeofDigit = digit*digit*digit;
//            sum = sum + cubeofDigit;
//            //digits ko remove bhi karnna hai
//            num = num/10;
//        }
//        if(sum == originalNum){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    static void main(){
//        System.out.println(isArmstrongNumber(153));


    //Perfect Number

    static boolean checkPerfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            //i ne num ko perfectly divide kar diya hai
            //toh ab factor pair kya banenge
            //1st factor = i
            //2nd factor = num/i
            int firstFactor = i;
            int seccondFactor = num / i;
            sum = sum + firstFactor + seccondFactor;
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

    static void main() {
        System.out.println(checkPerfectNumber(6));
    }
}