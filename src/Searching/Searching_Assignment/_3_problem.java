/**
 * Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.
 *
 * Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
 * Output 1: 6
 *
 * Input 2: arr = [ 0 0 0 0 0 1 1]
 * Output 2: 2
 *
 */

package Searching.Searching_Assignment;

import java.util.Scanner;

  // -------------->  efficiently count the total number of 1’s in it <----------------------
class efficiencyCount{

    // ------> using simple approach LinearSearch <-------------------
//    public static int totalNumbersOf_1s(int arr[]){
//
//        int count=0;
//        for(int i=0;i<arr.length;i++){
//
//            if(arr[i] == 1){
//
//                count++;
//            }
//        }
//        return count;

      // ------>  using binarySearch approach  <-------------------
      public static int totalNumbersOf_1s(int arr[]){

          int low=0, high=arr.length-1, mid=0;

          int n=arr.length;

          while (low <= high){

              mid=low+(high-low)/2;

              if(arr[mid] == 0){

               low=mid+1;

              }else if( arr[mid] > 0 ) {

                  high=mid-1;
              }
          }
          return (n-low);
    }
}

public class _3_problem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array elements:");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the value of the Elements:");
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();               // Time complexity = O ( log(n) )
        }                                      // Space complexity= O (1)



        int count=efficiencyCount.totalNumbersOf_1s(arr);
        System.out.println("efficiently count the total number of 1’s :"+count);

    }
}
