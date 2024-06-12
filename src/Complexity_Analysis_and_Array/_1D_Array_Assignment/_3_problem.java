/**
 *Q3: Write a program to calculate the maximum element in the array.
 *
 * Input 1: arr[] = {34,21,54,65,43}
 * Output 1: 65
 *
 */

package Complexity_Analysis_and_Array._1D_Array_Assignment;

import java.util.Scanner;

public class _3_problem {

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
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arrayElements.length;i++){

            if(arrayElements[i] > max){
                max=arrayElements[i];
            }
        }
        System.out.println("maximum element in the array:");
        System.out.println(max);

    }
}
