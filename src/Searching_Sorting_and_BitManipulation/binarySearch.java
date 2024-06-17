package Searching_Sorting_and_BitManipulation;

import java.util.Scanner;

public class binarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array elements:");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the value of the Elements:");
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target number:");
        int target=sc.nextInt();

  //  ------------> binarySearch means dividing into two like left and right side. <----------------
        int low=0, high=arr.length-1, mid=0;

        while (low <= high){
                                                        // Time complexity = O ( log(n) )
            mid=low+(high-low)/2;                       //  Space complexity= O (1)

            if(arr[mid] == target){

                System.out.println("Element is found in index:"+mid);
                return;

            }else if ( arr[mid] < target ){

                low=mid+1;

            }else {

                high=mid-1;
            }
        }
        System.out.println("Element is not found in the array");
    }
}
