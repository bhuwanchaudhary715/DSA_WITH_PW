/**
 * Q1: Write a program to print the sum of all the elements present on even indices in the given array.
 *
 * Input 1: arr[] = {3,20,4,6,9}
 * Output 1: 16
 *
 *
 * Input 1: arr[] = {4,3,6,7,1}
 * Output 1: 11
 */


package Complexity_Analysis_and_Array._1D_Array_Assignment;

import java.util.*;

public class _1_problem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value size of an Array;");
        int size=sc.nextInt();
        int arrayElements[]= new int[size];


        System.out.println("Enter the arrayElements");
        for(int i=0;i<arrayElements.length;i++){

            arrayElements[i]=sc.nextInt();
        }

        // ---------> manipulation of Even indices sum <-------------
        int sumOfEvenIndices=0;
        for(int i=0;i<arrayElements.length;i++){

            if(i % 2 ==0){
                sumOfEvenIndices +=arrayElements[i];
            }
        }

        System.out.println("sum of all the elements present on even indices:");
        System.out.println(sumOfEvenIndices);

    }
}
