package Searching;

import java.util.Scanner;

public class linearSearch {

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
        int target=sc.nextInt();

        // ------------------> linearSearch means traversing in linear order( Straight line ) <-------------
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                idx=i;
                break;
            }
        }

        if(idx == -1){

            System.out.println("Element is not found");
        }else {

            System.out.println("Element is found in index:"+idx);
        }
    }
}
