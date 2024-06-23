package Searching;

import java.util.Scanner;

class occurrence{

    public static int firstOccurrence(int arr[],int target){

        int low=0, high=arr.length-1, mid=0, result=-1;
        while( low <= high ){

            mid=low+(high-low)/2;

            if( arr[mid] == target ){

                result=mid;
                /*   Key point  ---> we want firstOccurrence of an element,
                                       so we need to traverse towards left side of an array. */
                high=mid-1;

            }else if( arr[mid] < target ){

                low=mid+1;

            }else {

                high=mid-1;
            }
        }
        return result;
    }
}

public class lowerBound_OR_firstOccurrence {           // Time complexity = O ( log(n) )
                                                       // Space complexity= O (1)
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

        int result=occurrence.firstOccurrence(arr,target);

        if( result == -1){

            System.out.println("Element is not found");

        } else {

            System.out.println("Element is found index:"+result);

        }
    }
}
