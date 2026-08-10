import java.util.Scanner;
public class StringBasics {


    //Each character in string
//    static void printString(String str) {
//
//        int n = str.length();
//
//        for (int i = 0; i < n; i++) {
//            char ch = str.charAt(i);
//            System.out.println(ch);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        String str = "Ayush";
//
//        printString(str);
//
    // Charcters in name without using length
//    static void getLengthOfString(String str) {
//
//        char[] arr = str.toCharArray();
//
//        int len = arr.length;
//
//        System.out.println(len);
//    }
//    public static void main(String[] args) {
//        getLengthOfString("Ayush");
//    }
//
//}


    // counts vowels
//    static int getVowelsCount(String str) {
//
//        int count = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//
//            char ch = str.charAt(i);
//
//            if (ch == 'a' || ch == 'e' || ch == 'i'
//                    || ch == 'o' || ch == 'u') {
//
//                count++;
//            }
//        }
//
//        return count;
//    }
//    public static void main(String[] args) {
//
//        String str = "ayush";
//
//        int vowels = getVowelsCount(str);
//
//        System.out.println(vowels);
//    }
//}
    //Reverse a string

//    static String reverseString(String str) {
//
//        String reverse = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reverse = reverse + str.charAt(i);
//        }
//
//        return reverse;
//    }
//
//    public static void main(String[] args) {
//
//        String str = "Ayush";
//
//        System.out.println("Original String: " + str);
//        System.out.println("Reversed String: " + reverseString(str));
//    }
//}


    //String is palindrome or not
    static boolean isPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "madam";

        if (isPalindrome(str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}



        //How to take input in String
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Provide the string content: ");
//        String str = sc.nextLine();
//        System.out.println("Value: " + str);

//        String firstName = "Ayush";
//        String lastName = new String("Pandey");
//        System.out.println(firstName + " " + lastName);
//    }

//        String name1 = "Ayush";
//        String name2 = "AYUSH";
//
//        if (name1 == (name2)){   // == ye opreation string mein mat use karo name1.equals(name2) use this
//            System.out.println("Both strings are equal");
//        } else {
//            System.out.println("Both strings are not equal");
//        }

        //Methods in java

//        String str = "Ayush";
//
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
//
//        String name = "AYUSH";
//
//        System.out.println(str.equals(name));
//        System.out.println(str.equalsIgnoreCase(name));


        // empty -> length = 0
// blank -> sirf spaces hain string me

//        String str = " ";
//
//        System.out.println(str.length());
//        System.out.println(str.isEmpty());
//        System.out.println(str.isBlank());
//
//        String name = "   Love   ";
//
//        System.out.println(name.length());
//
//        name = name.trim();
//
//        System.out.println(name.length());



//        String str = "My Name is Love Babbar";

    // 0 -> M
    // 1 -> y
        // 2 -> space
// and so on

// beginIndex -> 3 (inclusive)
// endIndex -> 7 (exclusive)

//        System.out.println(str.substring(3, 7));
//        System.out.println(str.contains("Love"));


//        int num = 5123;
//
//        String str = String.valueOf(num);
//
//        System.out.println(num + 1);
//        System.out.println(str + 1);

        //Lets Practice some question

        //Print each char in String

//        int n = str.length();
//        for(int n = 0; i<n; i++){
//            char ch = str.charAt(i);
//            System.out.println(ch);
//        }



