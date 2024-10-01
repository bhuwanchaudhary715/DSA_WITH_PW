/**
 * Q2 - Given two number x and y find product using recursion    [ Easy ]
 *
 * Input1 : x = 5, y = 2
 * Output1 : 10
 *
 *
 * Input2 : x = 100, y = 5
 * Output2 : 500
 */


package Recursion.JavaFoundation_RecursionPortion_Only;

import java.util.Scanner;

public class PrintTwoNumberProduct_Recursion {

    public static int productOfTwoNum(int a,int b){

        //base case condition.
        if( a <= 0 ){

            return 0;

        } else if ( a > b) {

            return productOfTwoNum(b-a,b)+a*b;

        }else {

            return productOfTwoNum(a-b,b)+a*b;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A:");
        int a=sc.nextInt();

        System.out.println("Enter the value of B:");
        int b=sc.nextInt();

        System.out.println(productOfTwoNum(a,b));

    }
}
