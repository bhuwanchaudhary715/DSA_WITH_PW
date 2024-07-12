package Sorting;

import java.util.Scanner;

class displayArray3{

    public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}

public class SelectionSort {

    public static int[] sortAscendingOrder_3(int arr[]){

        for (int i=0 ; i<arr.length; i++){
            int min_idx=i;  //<--- min_idx is responsible to store the index of minimum value in every iteration.

            for (int j=i+1;j<arr.length;j++){

                if(arr[min_idx] > arr[j]){
                    min_idx=j;

                }
            }
            if( arr[min_idx] < arr[i] ){
                // Swapping is required.
                int temp=arr[i];
                arr[i]=arr[min_idx];
                arr[min_idx]=temp;
            }
        }
        return arr;
    }


    public static void main(String[] args) {

        int arr[]={50,25,38,44,99,16,11,21};

        System.out.println("Before swapping the given array:");
        displayArray2.printArray(arr);

        int sortArray[]=sortAscendingOrder_3(arr);
        System.out.println("After using Selection sort ( Ascending order ) the given array:");
        displayArray2.printArray(sortArray);
    }
}
