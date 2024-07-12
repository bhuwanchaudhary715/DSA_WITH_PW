/**
 * Given an array arr, the task is to find the largest element in it.
 *
 * Examples:1
 *
 * Input: arr= [1, 8, 7, 56, 90]
 * Output: 90
 * Explanation: The largest element of given array is 90.
 *
 * Input: arr = [5, 5, 5, 5]
 * Output: 5
 * Explanation: The largest element of given array is 5.
 *
 * Input: arr = [10]
 * Output: 10
 * Explanation: There is only one element which is the largest.
 *
 * Expected Time Complexity: O(n)
 * Expected Auxiliary Space: O(1)
 */

package Complexity_Analysis_and_Array.ArrayProblem_LeetCode;

public class _2_LargestElementInArray_Basic {

    public static int printLargest(int arr[] ){

        int max = arr[0];

        for(int i=1;i<arr.length;i++){

            if( max < arr[i]){

                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int arr[] = {1, 8, 7, 56, 90};

        int max=printLargest(arr);
        System.out.println("The Largest Element in Given Array:"+max);

    }
}
