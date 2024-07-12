/**
 * Given an array arr, return the second largest distinct element from an array. If the second largest element doesn't exist then return -1.
 *
 * Examples:1
 *
 * Input: arr = [12, 35, 1, 10, 34, 1]
 * Output: 34
 * Explanation: The largest element of the array is 35 and the second largest element is 34.
 *
 * Input: arr = [10, 10]
 * Output: -1
 * Explanation: The largest element of the array is 10 and the second largest element does not exist so answer is -1.
 *
 * Expected Time Complexity: O(n)
 * Expected Auxiliary Space: O(1)
 */

package Complexity_Analysis_and_Array.ArrayProblem_LeetCode;


public class _3_2LargestElementInArray_Easy {

    public static int print2Largest(int[] arr){

        int firstmax = -1;

        int secondMax = -1;

        for(int i=1;i<arr.length;i++){

            if( firstmax < arr[i]){

                firstmax=arr[i];

            }else if(secondMax < arr[i]){

                secondMax=arr[i];
            }

        }
        return secondMax;
    }

    public static void main(String[] args) {

        int arr[] = {12, 35, 1, 10, 34, 1};


        int secMax = print2Largest(arr);

        if (secMax != -1) {
            System.out.println("The Second largest Element:" + secMax);

        } else {
            System.out.println("Elements is not found" + -1);
        }
    }
}
