/**
 *Q5: Write a function which accepts a 2D array of integers and its size as arguments and
 *  displays the elements of middle row and the elements of middle column. Printing can be done in any order.
 *
 *     [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]
 *

 *    Input 1:
 *              {
 *                  1 2 3 4 5
 *                  3 4 5 6 7
 *                  7 6 5 4 3
 *                  8 7 6 5 4
 *                  1 2 37 8 0
 *              }
 *
 *
 *
 *    Output : 3 5 5 6 37 7 6 4 3
 */

package Complexity_Analysis_and_Array._2D_Array_Assignment;
import java.util.Scanner;

class squareMatrix{

    public static void result(int array[][],int row,int column){

//        for(int i=0;i<row;i++){
//            for (int j=0;j<column;j++){
//
//                if( row/2 == j || column/2 == i){                  <------ Time complexity= O(n*n)
//
//                    System.out.print(" "+array[i][j]);
//                }
//            }
//        }

        // -----------> elements of middle row <------------
        for(int i=0;i<row;i++){

            System.out.print(" "+array[i][row/2]);
        }
                                                               //   <--------  Time complexity= O(n)
        // ----------> elements of middle column <-----------
        for(int j=0;j<column;j++){

            System.out.print(" "+array[column/2][j]);
        }


    }
}

public class _5_problem {

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

        System.out.println("Elements of middle row and the elements of middle column are:");
        squareMatrix.result(arrayElements,row,column);

    }
}
