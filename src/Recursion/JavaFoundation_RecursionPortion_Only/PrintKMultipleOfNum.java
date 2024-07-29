/**
 * Problem 1 : Given a number num and a value k. Print k multiple  of num.
 * Constraint : k > 0
 *
 * Input 1 : num = 12 , k = 5
 * Output 1 : 12 , 24 , 36 , 48 , 60
 *
 * Input 2 : num = 3 , k = 8
 * Output 2 :  3 , 6 , 9 , 12 , 15 , 18 , 21 , 24.
 *
 */

package Recursion.JavaFoundation_RecursionPortion_Only;

public class PrintKMultipleOfNum {

    public static void kMultipleNum(int num,int k){

        // Base case or Terminating conditions
        if( k == 1){

            System.out.println(num*k);   // 3
            return;
        }

        // Recursive calls
        kMultipleNum(num,k-1);  // 6 9 12 15  18 24

        // selfWork
        System.out.println(num*k);

    }

    public static void main(String[] args) {

        kMultipleNum(3,8);

    }
}
