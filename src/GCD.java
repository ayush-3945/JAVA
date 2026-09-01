import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;

        //which divide both  x and y
        int gcd = 1;

        for(int i = 1; i<=x && i<=y; i++){
            if(x%i==0 && y%i==0){
                gcd = i;
            }
        }
        System.out.println("GCD = " + x);
    }
}