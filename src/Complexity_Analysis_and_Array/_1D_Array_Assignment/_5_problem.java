/**
 *Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than
 * its just left and just right neighbor.
 *
 * Input 1: arr[] = {1,3,2,6,5}
 * Output 1: 3
 *
 *
 * Input 2:  arr[] = {1 4,7,3,2,6,5}
 * Output 1: 7
 */

package Complexity_Analysis_and_Array._1D_Array_Assignment;

import java.util.*;

public class _5_problem {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value size of an Array;");
        int size=sc.nextInt();
        int arrayElements[]= new int[size];


        System.out.println("Enter the arrayElements");
        for(int i=0;i<arrayElements.length;i++){

            arrayElements[i]=sc.nextInt();
        }

        // ---------------->  finding first peak element in the array <----------------
        for(int i=1;i<arrayElements.length;i++){

            if( arrayElements[i-1] < arrayElements[i]  &&  arrayElements[i] > arrayElements[i+1] ){
                System.out.print(arrayElements[i]+" ");
                break;
            }
        }

    }
}
