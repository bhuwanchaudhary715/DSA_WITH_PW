/**
 * Q1 : Given an integer, find out the sum of its digits using recursion.
 *
 * Input: n= 1234
 *
 * Output: 10
 *
 * Explanation: 1+2+3+4=10;
 */

package Recursion.Assignment;
import java.util.Scanner;

public class _1_problem {

    public static int digitSum(int number) {

       // Base case or Terminating condition.
        if( number == 0){

            return 0;
        }

        // Recursive Condition
        int result = number%10 + digitSum(number/10);

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of number:");
        int number = scanner.nextInt();

        int result = digitSum(number);
        System.out.println(" The sum of digits of "+number+" is "+result);

    }
}
