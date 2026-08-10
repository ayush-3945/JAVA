import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    static void main(){

//        int a = 5;
//        int b = 6;
//        System.out.println(a+b);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of firstNum : ");
        int FirstNum = sc.nextInt();
        System.out.println("Enter the value of SecondNum : ");
        int SecondNum = sc.nextInt();
        int ans = FirstNum + SecondNum;
        System.out.println("Answer is :" + ans);

        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger : " + bg);

        boolean flag = sc.nextBoolean();
        System.out.println("Enter the value for flag : ");
        short val = sc.nextShort();
        System.out.println("Enter the value for val  : ");
        float floatValue = sc.nextFloat();
        System.out.println("Enter the value of floatValue : ");

        System.out.println("flag is : " + flag);
        System.out.println("val is  : " + val );
        System.out.println("floatValue : " + floatValue);

     // Java Garbage Collector
        //When you create objects, they take up memory (RAM).
        // When those objects are no longer needed, the Garbage Collector automatically deletes them to free up memory.
    }
}
