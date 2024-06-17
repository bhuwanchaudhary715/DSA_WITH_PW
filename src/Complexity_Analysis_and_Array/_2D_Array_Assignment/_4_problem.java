/**
 * Q4: Write a program to find the largest element of a given 2D array of integers.
 *
 * Input 1:
 *           {
 *               1 2 4 0
 *               2 5 7 -1
 *               4 2 6 9
 *           }
 *
 * Output : 9
 */

package Complexity_Analysis_and_Array._2D_Array_Assignment;

import java.util.Scanner;

public class _4_problem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Row");
        int row=sc.nextInt();
        System.out.println("Enter the size of Column");
        int column=sc.nextInt();

        int arrayElements[][] = new int[row][column];

        System.out.println("Enter the value of Rows and Columns elements");
        for (int i=0;i<row;i++){     // <--Row
            for (int j=0;j<column;j++){  // <--Column

                arrayElements[i][j]=sc.nextInt();
            }
        }

        int max=Integer.MIN_VALUE;

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){

                if(max < arrayElements[i][j]){
                    max=arrayElements[i][j];

                }
            }
        }
        System.out.println("largest element of a given 2D array of integers is:"+max);
    }
}
