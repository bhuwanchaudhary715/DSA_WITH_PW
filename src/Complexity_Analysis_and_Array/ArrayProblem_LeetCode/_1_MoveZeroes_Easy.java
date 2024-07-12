/**
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 *
 *   Note that you must do this in-place without making a copy of the array.
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0
 */

package Complexity_Analysis_and_Array.ArrayProblem_LeetCode;

public class _1_MoveZeroes_Easy {

    public static void moveZeros(int arr[] ){

        int i=0, j=0 ;

        while( i < arr.length){

            if( arr[i] == 0){

                i=i+1;
            }else {

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i=i+1;
                j=j+1;
            }
        }

        for( i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = {0,1,0,3,12};

        System.out.println();
        moveZeros(arr);
    }
}
