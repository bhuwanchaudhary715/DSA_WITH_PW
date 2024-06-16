/**
 *Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
 *   -> number of positive numbers
 *   -> number of negative numbers
 *   -> number of odd numbers
 *   -> number of even numbers
 *   -> number of 0.
 *
 * Input 1:
 *          {
 *           1 2 -3 4
 *           0 0 -4 2
 *           1 -1 2 3
 *          -4 -5 -7 0
 *          }

 * Output :
 *        -> number of positive numbers = 7
 *        -> number of negative numbers = 6
 *        -> number of odd numbers = 7
 *        -> number of even numbers = 9
 *        -> number of 0 = 3
 */

package Complexity_Analysis_and_Array._2D_Array_Assignment;
import java.util.*;
public class _1_problem {

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
        int positive=0, negative=0, odd=0, even=0, zero=0;

        for (int i=0;i<arrayElements.length;i++){     // <--Row
            for (int j=0;j<arrayElements.length;j++){  // <--Column

                if(arrayElements[i][j] > 0 ){
                    positive++;
                }

                if(arrayElements[i][j] < 0 ){
                    negative++;
                }

                if(arrayElements[i][j] % 2 != 0){
                    odd++;
                }

                if(arrayElements[i][j] % 2 == 0){
                    even++;
                }

                if(arrayElements[i][j] == 0){
                    zero++;
                }
            }
        }
        System.out.println("Number of positive:"+positive);
        System.out.println("Number of negative:"+negative);
        System.out.println("Number of odd:"+odd);
        System.out.println("Number of even:"+even);
        System.out.println("Number of zero:"+zero);
    }
}
