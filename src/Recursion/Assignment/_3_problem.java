/**
 * Q3: Print the max value of the array [ 13, 1, -3, 22, 5 ]
 */

package Recursion.Assignment;

import java.util.Scanner;

public class _3_problem {

    public static int maxValue(int arr[],int n ) {




        // Base case or Terminating condition
        if( n == arr.length-1 )
            return  arr[n];

         if(  maxValue(arr,n+1) < arr[n] )
            return arr[n];

         else
             return  maxValue(arr,n+1);
    }
    
    public static void main(String[] args) {

        int arr[]={ 13, 1, -3, 22, 5 };

        int result =maxValue(arr,0);

        System.out.println(result);

    }
}
