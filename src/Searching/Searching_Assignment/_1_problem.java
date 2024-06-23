/**
 * Given an array. FInd the number X in the array. If the element is present, return the index of the element,
 * else print “Element not found in array”. Input the size of array, array from user and the element X from user.
 * Use Linear Search to find the element.
 *
 */

package Searching.Searching_Assignment;

import java.util.Scanner;

class linearSearch{

    public static int searchElement(int arr[],int x){

        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}

public class _1_problem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array elements:");
        int size=sc.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the value of the Elements:");
        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();               // Time complexity = O (n)
        }                                      // Space complexity= O (1)

        System.out.println("Enter the target number:");
        int x=sc.nextInt();

        int index=linearSearch.searchElement(arr,x);

        if(index == -1){

            System.out.println("Element is not found:");
        }else {
            System.out.println("Element is found at location:"+index);
        }
    }
}
