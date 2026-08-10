public class Operator {
        public static void main(String[] args) {

            // Arithmetic Operator
            int solvedThisWeek = 25;
            int solvedLastWeek = 15;

            int total = solvedThisWeek + solvedLastWeek;
            int difference = solvedThisWeek - solvedLastWeek;
            int projected = solvedThisWeek * 4;
            int average = solvedThisWeek / 7;
            int remainder = solvedThisWeek % 7;

            System.out.println(total);
            System.out.println(difference);
            System.out.println(projected);
            System.out.println(average);
            System.out.println(remainder);

            // Relational Operator
            int currentStreak = 45;
            int targetStreak = 50;

            System.out.println(currentStreak == targetStreak);
            System.out.println(currentStreak != targetStreak);
            System.out.println(currentStreak > targetStreak);
            System.out.println(currentStreak < targetStreak);
            System.out.println(currentStreak >= targetStreak);
            System.out.println(currentStreak <= targetStreak);

            // Logical Operator

            boolean completedDSA = true;
            boolean completedCore = false;

            System.out.println(completedDSA && completedCore);  // && True if both condition are true
            System.out.println(completedDSA || completedCore);  // true if any condition is true
            System.out.println(!completedCore); // Reverse boolean value

            // Assignment Operator
            int ratingPoints = 100;

            ratingPoints += 20;  // ratingPoints = ratingPoints + 20
            System.out.println(ratingPoints);
            ratingPoints -= 10;  // ratingPoints = ratingPoints - 10
            System.out.println(ratingPoints);
            ratingPoints *= 2;   // ratingPoints = ratingPoints * 2
            System.out.println(ratingPoints);
            ratingPoints /= 4;   // ratingPoints = ratingPoints / 4
            System.out.println(ratingPoints);
            ratingPoints %= 30;  // ratingPoints = ratingPoints % 30
            System.out.println(ratingPoints);

            // Unary Operator

            int activeUsers = 100;

            int prefix = ++activeUsers; // first increment then utilize
            int postfix = activeUsers++; // first utilize then increment

            System.out.println(prefix);
            System.out.println(postfix);
            System.out.println(activeUsers);


            // Bitwise Operator

            int x = 6;  // 00000110
            int y = 3;  // 00000011

            System.out.println(x & y);
            System.out.println(x | y);
            System.out.println(x ^ y);
            System.out.println(~x);
            System.out.println(x << 1);
            System.out.println(x >> 1);


        }
    }

