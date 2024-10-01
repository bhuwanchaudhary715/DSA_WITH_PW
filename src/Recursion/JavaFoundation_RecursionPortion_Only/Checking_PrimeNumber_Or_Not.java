/**
 * Q3 - Given a number n, check whether it's a prime number or not using recursion  [ Easy ]
 *
 * Input1 : n = 11
 * Output1 : Yes
 *
 *
 * Input2 : n = 15
 * Output2 : No
 */

package Recursion.JavaFoundation_RecursionPortion_Only;

public class Checking_PrimeNumber_Or_Not {

    public static boolean primeNumber(int num ) {

        // base case condition
        if (num < 2) return false;

        for(int i=2; i <= Math.sqrt(num) ;i++){

            if( num % i == 0 ) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println( primeNumber(4));



    }
}
