package Recursion;

import java.util.Scanner;

public class FindingOf_Nth_FibonacciSeriesUsingRecursion {

    public static int fibonacciSeries(int num){

        //  Base case condition or Terminating condition.
        if( num == 0 || num == 1){

            return num;
        }

        // Recursive calls
        int result=fibonacciSeries(num-1)+fibonacciSeries(num-2);

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of number:");
        int number = scanner.nextInt();

        int result = fibonacciSeries(number);

        System.out.println(result);

    }
}
