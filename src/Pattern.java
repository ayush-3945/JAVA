public class Pattern {
    //Solid Square
    static void main() {
//
//        int n = 4;
//        for (int row = 1; row <= n; row++) {
////* * * *
////* * * *
////* * * *
////* * * *
//        // for each row -> n columns
//            for (int col = 1; col <= n; col++) {
//
//                // print star
//                System.out.print("* ");
//            }
//
//            // move to next line or row
//            System.out.println();
//        }
//
//
//        //Solid Rectangular
//        // * * * * *
//        // * * * * *
//        // * * * * *
//
//        int n = 3;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= 5; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        //Right Angle Traingle
//        //*
//        //* *
//        //* * *
//        //* * * *
//        //* * * * *
//
//        int row = 5;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//
//        //Solid Rhombus
//           //* * * * *
//         //* * * * *
//        // * * * * *
//        // * * * * *
//        //* * * * *
//
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//
//            // spaces
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print(" ");
//            }
//
//            // stars
//            for (int col = 1; col <= n; col++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//    }
//
//    // Inverted Traingle
//
//    int n = 5;
//
//    for(int row = 1; row<=n; row++){
//        for(int col = 1; col<= n-row+1; col++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }
//
//    // Pyramid Patteren
//    int n = 5;
//    for (int row = 1; row <= n; row++) {
//
//        // spaces
//        for (int col = 1; col <= n - row; col++) {
//            System.out.print(" ");
//        }
//
//        // stars
//        for (int col = 1; col <= 2 * row - 1; col++) {
//            System.out.print("*");
//        }
//
//        // move to next row
//        System.out.println();
//    }
//
//    //Inverted Pyramid
//    int n = 4;
//
//for (int row = 1; row <= n; row++) {
//
//        // spaces
//        for (int col = 1; col <= row - 1; col++) {
//            System.out.print(" ");
//        }
//
//        // stars
//        for (int col = 1; col <= 2 * n - 2 * row + 1; col++) {
//            System.out.print("* ");
//        }
//
//        // move to next row
//        System.out.println();
//    }
//
//    // Hollow Pyramid
//    int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//
//        // for each row -> 6 columns
//        for (int col = 1; col <= 6; col++) {
//
//            if (row == 1 || row == n) {
//                System.out.print("* ");
//            } else {
//                // middle rows
//                if (col == 1) {
//                    System.out.print("* ");
//                } else if (col == 6) {
//                    System.out.print("* ");
//                } else {
//                    // middle columns
//                    System.out.print("  ");
//                }
//            }
//        }
//
//        System.out.println();
//    }
//
//    // Hollow Traingle
//    int n = 10;
//
//        for (int row = 1; row <= n; row++)
//
//    {
//
//        // first 2 rows and last row
//        if (row == 1 || row == 2 || row == n) {
//
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//
//        } else {
//
//            // middle rows
//            System.out.print("* ");
//
//            // (row - 2) spaces
//            for (int col = 1; col <= (row - 2); col++) {
//                System.out.print("  ");
//            }
//
//            System.out.print("* ");
//        }
//
//        System.out.println();
//    }
//
//        int n = 5;
//        int count = 1;
//
//        for(int row = 1; row<=n; row++){
//            for(int col = 1; col<=row; col++){
//                System.out.print(count + " ");
//                count++;
//            }
//            System.out.println();
//    }
//
//    A
//    A B
//    A B C
//    A B C D
//    A B C D E
//
//
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//
//        // for each row -> variable columns
//        for (int col = 1; col <= row; col++) {
//
//            int a = col;
//            int b = ('A' - 1);
//
//            int ans = a + b;
//            char finalAns = (char) ans;
//
//            System.out.print(finalAns + " ");
//        }
//
//        System.out.println();
//    }
//
//    E
//    E D
//    E D C
//    E D C B
//    E D C B A
//
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//
//        for (int col = 1; col <= row; col++) {
//
//            int a = n - col;
//            int b = 'A';
//
//            int ans = a + b;
//            char finalAns = (char) ans;
//
//            System.out.print(finalAns + " ");
//        }
//
//        System.out.println();
//    }
//
//
//
//                      1
//                    2 2 2
//                 3 3 3 3 3
//                 4 4 4 4 4 4 4
//                    5 5 5 5 5 5 5 5 5
        int n = 5;

        for (int row = 1; row <= n; row++) {

            // Part 1: Spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }

            // Part 2: Numbers
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print(row + " ");
            }

            System.out.println();
        }
    }
}
//
