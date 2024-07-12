package Recursion;

import java.util.Scanner;

public class FindingOfFactorialUsingRecursion {

    public static int factorial(int number){

        // Base case condition or Terminating Condition.
        if( number == 0 || number == 1 ){

            return 1;
        }

        // Recursive call
        int result = number * factorial(number-1);

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of number:");
        int number = scanner.nextInt();

        int result = factorial(number);
        System.out.println(" The factorial of "+number+" is "+result);
    }
}
