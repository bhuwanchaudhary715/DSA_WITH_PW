/**
 * Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
 * not present return -1.
 *
 * Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
 * Output 1: 6
 *
 * Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
 * Output 2: -1
 */

package Searching.Searching_Assignment;

import java.util.Scanner;

class binarySearch{

    public static int lastOccurrence(int arr[],int target){

        int low=0, high=arr.length-1, mid=0, result=-1;
        while(low <= high){

            mid=low+(high-low)/2;

            if(arr[mid] == target){

                result=mid;
                /*  Key point --> we want lastOccurrence of an element,
                                       so we need to traverse towards right side of an array. */
                low=mid+1;

            } else if (arr[mid] < target) {

                low=mid+1;

            }else {

                high=mid-1;
            }
        }
        return result;
    }
}

public class _2_problem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array elements:");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the value of the Elements:");
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();               // Time complexity = O ( log(n) )
        }                                      // Space complexity= O (1)

        System.out.println("Enter the target number:");
        int target=sc.nextInt();

        int result=binarySearch.lastOccurrence(arr,target);
        System.out.println("last occurrence of “target” in the array is:"+result);
    }
}
