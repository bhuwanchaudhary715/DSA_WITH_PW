package Searching_Sorting_and_BitManipulation;

import java.util.Scanner;

class root {

    public static int squareRoot( int num ){

       int  low=0, high=num, mid=0, value=0, result=-1;

        while ( low <= high ){

            mid=low+(high-low);
            value=mid*mid;

            if( value == num ){
                result=mid;      // <--perfect square root of the given number.
                return result;

            } else if( value < num ){
     // store the mid as we need to report the lower value in case of non-perfect square root of the given number.
                result=mid;
                low=mid+1;   // right side of an array

            }else if( value > num){
   // store the mid as we need to report the higher value in case of non-perfect square root of the given number.
            //    result=mid;
                high=mid-1;
            }
        }
    return result;
    }
 }

public class squareRoot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);        //  -->  Time complexity = O ( log(n) )
                                                      // -->  Space complexity= O (1)
        System.out.println("Enter the value of num elements:");
        int num = sc.nextInt();

        int result=root.squareRoot(num);
        System.out.println("Square Root of "+num+" is "+result);

    }
}
