public class Loop {
    static void main(){

        // For Loop
        for(int i=1; i<=5; i++){
            System.out.println("value of i : " +i);
        }

        for(int i=1; i<=4; i++){
            System.out.println("Ayush pandey");
        }

        //Even Number

        for(int i=2; i<=20; i+=2){
            System.out.println(i);
        }

        //Sqare of *

        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                System.out.println("i = " + i  + " j = " +j);
            }
        }
        // Break and Continue
        for(int i=1; i<=10; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }
        for(int i=1; i<=10; i++){
            if(i == 1  || i == 2){
                continue;
            }
            System.out.println(i);
        }

        // While Loop
        //Initialization
        int i = 1;
        //condition
        while (i<=10){
            //process
            System.out.println("Ayush Pandey");
            //Updtion
            i++;

        }
    }
}
