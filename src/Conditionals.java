import java.util.Scanner;

public class Conditionals {
    static void main() {
        // IF Statement
        //Executes code only when a condition is true.
        int age = 18;
        if (age >= 17) {
            System.out.println("You are eligible to vote : ");

        }
        // IF-ELSE Statement
        //Executes one block if condition is true, another if false.

        int score = 42;
        if (score >= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        // IF-ELSE-IF-Ladder
        //Used when multiple conditions exist.


        int accuracy = 78;

        if (accuracy >= 90) {
            System.out.println("Excellent");
        } else if (accuracy >= 75) {
            System.out.println("Good");
        } else if (accuracy >= 60) {
            System.out.println("Average");
        } else {
            System.out.println("Needs Improvement");


            // NESTED IF-ELSE
            //Used when multiple conditions exist.

            boolean hasSubscription = true;
            int solvedProblems = 220;

            if (hasSubscription) {

                if (solvedProblems >= 200) {
                    System.out.println("Unlock Advanced Sheet");
                } else {
                    System.out.println("Practice More Problems");}

            } else {
                System.out.println("Upgrade to Premium");


            }

            // Ternary Operator
            //Shortcut for if-else.

            int streakDays = 35;

            String status = (streakDays >= 30) ? "Consistent" : "Irregular";

            System.out.println(status);


            //Switch Expression
            // It is used when multiple variable depends on a single variable

            System.out.println("Enter the value for day : ");
            Scanner sc = new Scanner(System.in);
            int day = sc.nextInt();
            switch (day){
                case 1 :
                    System.out.println("Monday");
                case 2 :
                    System.out.println("Tuesday");
                case 3 :
                    System.out.println("Wednesday");
                case 4 :
                    System.out.println("Thursday");
                case 5 :
                    System.out.println("Friday");
                case 6 :
                    System.out.println("Saturday");
                default:
                    System.out.println("Sunday");







            }
        }
    }
}

