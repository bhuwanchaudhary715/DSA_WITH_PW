/**
 * Q4: Write a program to find out the second largest element in a given array.
 *
 * Input 1: arr[] = {34,21,54,65,43}
 * Output 1: 54
 *
 * Input 1: arr[] = {4,3,6,7,1}
 * Output 1: 6
 *
 */

package Complexity_Analysis_and_Array._1D_Array_Assignment;

import java.util.*;

public class _4_problem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value size of an Array;");
        int size=sc.nextInt();
        int arrayElements[]= new int[size];


        System.out.println("Enter the arrayElements");
        for(int i=0;i<arrayElements.length;i++){

            arrayElements[i]=sc.nextInt();
        }

        // ----------------> manipulation of maximum element in the array <-------------------
        int firstMax=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;

        // -----> firstMax value <-----
        for(int i=0;i<arrayElements.length;i++){

            if(arrayElements[i] > firstMax){
                firstMax=arrayElements[i];
            }
        }

        // -----> secondMax value <-----
        for(int i=0;i<arrayElements.length;i++){

            if(arrayElements[i] != firstMax){
                 if(arrayElements[i] > secMax)
                     secMax=arrayElements[i];
            }
        }
        System.out.println("Second maximum element in the array:");
        System.out.println(secMax);



    }
}
