package Recursion;

import java.util.Scanner;

public class FindingOfPowerUsingRecursion {

//    public static int bruteForceApproach(int a,int b){
//
//        //Base case or Terminating Condition.  ( a^b [ a power of b ] )
//        if( b == 1){
//
//            return a;
//        }
//
//        // Recursive calls
//        int result = bruteForceApproach(a,b-1) * a;
//
//        return result;
//    }


    public static int optimizedApproach( int a,int b ){

        // Base case or Terminating Condition .
        if( b == 1 ){

            return a;
        }
               // Recursion call
            int result = optimizedApproach(a, b / 2);

            if ( b % 2 == 0 ) {   // for Even case

                return result * result ;

            } else {       // for Odd case

                return a * result *result;
            }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        int a = scanner.nextInt();

        System.out.println("Enter the value of b:");
        int b = scanner.nextInt();

//        int result = bruteForceApproach(a,b);
//        System.out.println("The power of "+ a +" in "+ b +" is :"+result);

        int result = optimizedApproach(a,b);
        System.out.println("The power of "+ a +" in "+ b +" is :"+result);




    }
}
