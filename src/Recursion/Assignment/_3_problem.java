/**
 * Q3: Print the max value of the array [ 13, 1, -3, 22, 5 ]
 */

package Recursion.Assignment;

import java.util.Scanner;

public class _3_problem {

    public static int maxValue(int arr[],int n ) {


        // Base case or Terminating condition
        if( n == arr.length-1 ) {

            return arr[n];

        }
              // Recursive call
        int max = maxValue(arr,n+1);

        if(  arr[n] > max ) {

             return arr[n];
         }


        return max;
    }
    
    public static void main(String[] args) {

        int arr[]={ 13, 1, -3, 22, 5 };

        int result =maxValue(arr,0);

        System.out.println(result);

    }
}
