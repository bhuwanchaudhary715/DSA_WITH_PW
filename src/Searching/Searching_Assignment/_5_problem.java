/**
 * Q5: Given a positive integer num, return true if num is a perfect square or false otherwise.
 *
 * A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer
 * with itself.
 *
 * Example 1:
 * Input: num = 16
 * Output: true
 * Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
 *
 * Example 2:
 * Input: num = 14
 * Output: false
 * Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.
 */


package Searching.Searching_Assignment;
import java.util.Scanner;

class Root {

    public static boolean squareRoot( int num ){

        int  low=0, high=num, mid=0, value=0;

        while ( low <= high ){

            mid=low+(high-low);
            value=mid*mid;

            if( value == num ){
                return true;            // <--perfect square root of the given number.

            } else if( value < num ){
                low=mid+1;   // right side of an array

            }else if( value > num){
                high=mid-1;

            }
        }
        return false;
    }
}

public class _5_problem {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);        //  -->  Time complexity = O ( log(n) )
        // -->  Space complexity= O (1)
        System.out.println("Enter the value of num elements:");
        int num = sc.nextInt();

        boolean result= Root.squareRoot(num);
        System.out.println("Square Root of "+num+" is "+result);

    }
}
