package Recursion.JavaFoundation_RecursionPortion_Only;

public class Print_GCDNumber_BruteForceApproach {

    public static void printGCD(int x,int y,int z){

        // Base case condition or Terminating Condition.
        if( x == 0){

            return;

        }

        if( z % x == 0 && y % x == 0 ){

            System.out.println(x);
            return;
        }

        //Recursive calls
        printGCD(x-1,y,z);

    }

    public static void main(String[] args) {

                  printGCD(12,15,12);
    }
}
