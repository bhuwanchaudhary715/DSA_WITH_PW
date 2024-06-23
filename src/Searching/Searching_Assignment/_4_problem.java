/**
 * Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element
 * is not found in the array, report that as well.
 *
 * Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
 * target = 5
 * Output: Target 5 occurs 3 times
 *
 * Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
 * target = 6
 * Output: Target 6 occurs 2 times
 */

package Searching.Searching_Assignment;

import java.util.Scanner;
public class _4_problem {

    // --------> FirstOccurrence <-------------
    public static int firstOccurrence(int arr[], int target) {

        int low = 0, high = arr.length - 1, mid = 0, firstResult = -1;
        while (low <= high) {

            mid = low + (high - low) / 2;

            if (arr[mid] == target) {

                firstResult = mid;
                /*   Key point  ---> we want firstOccurrence of an element,
                                       so we need to traverse towards left side of an array. */
                high = mid - 1;

            } else if (arr[mid] < target) {

                low = mid + 1;

            } else {

                high = mid - 1;
            }
        }
        return firstResult;
    }

    // --------> LastOccurrence <-------------
    public static int lastOccurrence(int arr[], int target) {

        int low = 0, high = arr.length - 1, mid = 0, lastResult = -1;
        while (low <= high) {

            mid = low + (high - low) / 2;

            if (arr[mid] == target) {

                lastResult = mid;
                /*  Key point --> we want lastOccurrence of an element,
                                       so we need to traverse towards right side of an array. */
                low = mid + 1;

            } else if (arr[mid] < target) {

                low = mid + 1;

            } else {

                high = mid - 1;
            }
        }
        return lastResult;
    }

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of Array elements:");
            int size = sc.nextInt();

            int arr[] = new int[size];

            System.out.println("Enter the value of the Elements:");
            for (int i = 0; i < arr.length; i++) {

                arr[i] = sc.nextInt();               //  -->  Time complexity = O ( log(n) )
            }                                      // -->  Space complexity= O (1)

            System.out.println("Enter the target number:");
            int target = sc.nextInt();

            int firstOccurrence=_4_problem.firstOccurrence(arr,target);
            int lastOccurrence=_4_problem.lastOccurrence(arr,target);

            int count=lastOccurrence-firstOccurrence+1;

            if( firstOccurrence == -1 && lastOccurrence == -1 ){

                System.out.println("Elements is not found");

            } else {

                System.out.println( "Target "+ target +" occurs "+count+" times");
            }
        }
    }

