/**
 * Q1 - Given a number n. Print if it is an armstrong number or not. { Easy }
 *   An armstrong number is a number if the sum of every digit in that number raised to the power
 *   of total digits in that number is equal to the number.
 *
 *   Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 ,(NOTE THAT) -> hence 153 is an armstrong number.
 *
 * Input1 : 153
 * Output1 : Yes
 *
 * Input 2 : 134
 * Output2 : No
 */

package Recursion.JavaFoundation_RecursionPortion_Only;

import java.util.Scanner;

public class PrintArmstrong_Or_Not_MamApproach {

    // Calculating the power of given number
    public static int power(int a, int b){

        //Base case condition
        if( b == 0 ) return 1; // Corrected base case

        // Recursive calls.
        int result = power(a,b/2);

        if( b % 2 == 0 ){

            return   result * result;

        }else {

            return a * result * result;

        }
    }

    public static int Armstrong(int n,int len){

        if( n == 0)  return 0;

        return   Armstrong(n/10,len) + power(n % 10,len);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        String s =Integer.toString(n);
        int len=s.length();

        if( Armstrong(n,len) == n){ // Changed the condition to ==

            System.out.println("YES");

        }else {

            System.out.println("NO");
        }


    }
}
