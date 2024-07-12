/**
 * Q2: Given a number n. Find the sum of natural numbers till n but with alternate signs.
 *
 * That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
 *
 * Constraints : 0<=n<=1e6
 *
 * Input1 : n = 10
 * Output 1 : -5
 *
 * Explanation : 1-2+3-4+5-6+7-8+9-10 = -5
 *
 * Input 2 : n = 5
 * Output 2 : 3
 */

package Recursion.Assignment;

import java.util.Scanner;

public class _2_problem {

    public static int naturalSumOfAlternativeNum(int num){

        int sum=0;

        // Base case condition or Terminating condition
        if( num == 0){

            return 0;

        }else if (num % 2 == 0){
            // Recursive condition
            sum = naturalSumOfAlternativeNum(num-1) - num;

        }else {
           // Recursive condition
            sum = naturalSumOfAlternativeNum(num-1) + num;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of number:");
        int number = scanner.nextInt();

        int result = naturalSumOfAlternativeNum(number);

        System.out.println("sum of natural numbers till n but with alternate signs "+number+" is "+result);

    }
}
