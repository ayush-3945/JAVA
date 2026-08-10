public class Methods {

    static void print2KaTable() {

        for (int i = 1; i <= 10; i++) {
            int ans = 2 * i;
            System.out.println("-> " + ans);
        }
    }
    static void printSum (int x , int y ){
        System.out.println("Sum: " + (x+y));
    }

    static void main() {
        printSum( 5 ,  10);

//        System.out.println("hi");
//        // Methods call
//        print2KaTable();
//
//        System.out.println("bye");
    }
}