/**
 *Q2: Write a program to traverse over the elements of the array using for each loop and print all even
 * elements.
 *
 * Input 1: arr[] = {34,21,54,65,43}
 * Output 1: 34 54
 *
 *
 * Input 1: arr[] = {4,3,6,7,1}
 * Output 1: 4 6
 *
 */


package Complexity_Analysis_and_Array._1D_Array_Assignment;

import java.util.*;

public class _2_problem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value size of an Array;");
        int size=sc.nextInt();
        int arrayElements[]= new int[size];


        System.out.println("Enter the arrayElements");
        for(int i=0;i<arrayElements.length;i++){

            arrayElements[i]=sc.nextInt();
        }

        // --------------> print Even elements present inside the Array <-----------------
        System.out.println("all even elements are:");
        for(int i=0;i<arrayElements.length;i++){

            if(arrayElements[i] % 2 == 0){

                System.out.print(arrayElements[i]+" ");

            }
        }
    }
}
