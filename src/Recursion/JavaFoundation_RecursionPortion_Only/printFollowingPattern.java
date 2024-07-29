/**
 * Q1 - Given a number n, print the following pattern without using any loop.
 * n, n-5, n-10, ..., 0, 5, 10, ..., n-5, n
 *
 * Input1: n = 16
 * Output1: 16, 11, 6, 1, -4, 1, 6, 11, 16
 *
 * Input2: n = 10
 * Output2: 10, 5, 0, 5, 10
 */

package Recursion.JavaFoundation_RecursionPortion_Only;

public class printFollowingPattern {

    public static void printPattern(int n, int m ,boolean flag) {



        // Base case Condition
        // If we are moving back towards n and we have reached there, then we are done
        if ( flag == false && m == n) {
            return;
        }
        // selfWork
        System.out.println(m);

        // If we are moving towards 0 or negative.
        if(flag){

            if( m -5 > 0){
                    // Recursive work
                // If m is greater, then 5, recur with true flag
                printPattern(n,m-5,true);

            }else {
                   // Recursive work
                // recur with false flag
                printPattern(n,m-5,false);
            }

        }else {
              // recursive work
            // If flag is false.
            printPattern(n,m+5,false);
        }

    }
    
    public static void main(String[] args) {


        printPattern(16,16,true );

    }
}
