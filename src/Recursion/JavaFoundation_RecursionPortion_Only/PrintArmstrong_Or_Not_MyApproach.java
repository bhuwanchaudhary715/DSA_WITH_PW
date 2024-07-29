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

public class PrintArmstrong_Or_Not_MyApproach {

    public static double armstrongNumber(int n , int len){

        // Base case Condition
        if( n == 0 ){

            return 0;
        }
               // Recursive calls

        int rem=n%10;
        return armstrongNumber(n/10,len) +Math.pow(rem,len)   ;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        String s =Integer.toString(n);
        int len=s.length();

        double armsStrongNumber=armstrongNumber(n,len);

        if( armsStrongNumber != n){

            System.out.println("NO");

        }else {

            System.out.println("YES");
        }

    }
}
