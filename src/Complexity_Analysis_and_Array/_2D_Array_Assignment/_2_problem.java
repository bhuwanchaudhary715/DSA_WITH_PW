/**
 * Q2: write a program to print the elements above the secondary diagonal in a user inputted
 * square matrix.
 *
 * Input 1:
 *          {
 *              1 2 3
 *              4 5 6
 *              7 8 9
 *          }

 * Output : 1 2 4
 *
 */

package Complexity_Analysis_and_Array._2D_Array_Assignment;

import java.util.Scanner;

public class _2_problem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Row");
        int row=sc.nextInt();
        System.out.println("Enter the size of Column");
        int column=sc.nextInt();

        int arrayElements[][] = new int[row][column];

        System.out.println("Enter the value of Rows and Columns elements");
        for (int i=0;i<arrayElements.length;i++){     // <--Row
            for (int j=0;j<arrayElements.length;j++){  // <--Column

                arrayElements[i][j]=sc.nextInt();
            }
        }

        System.out.println("Elements above secondary diagonal are:");
        for(int i=0;i<arrayElements.length-1;i++){

            for(int j=0;j<arrayElements.length-1-i;j++){

                System.out.print(" "+arrayElements[i][j]);
            }
        }

    }
}
