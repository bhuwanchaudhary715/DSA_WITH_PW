package Sorting;

import java.util.Scanner;

class displayArray2{

    public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}

public class InsertionSort {

    public static int[] sortAscendingOrder_2(int arr[]){

        for (int i=1;i<arr.length;i++){

            int j=i;

            while( j > 0 && arr[j-1] > arr[j] ){

                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int size=scanner.nextInt();

        int arr[]=new int[size];

        System.out.println("Enter the value of Array");
        for(int i=0;i<arr.length;i++){

            arr[i]=scanner.nextInt();
        }

        System.out.println("Before swapping the given array:");
        displayArray2.printArray(arr);

        int sortArray[]=sortAscendingOrder_2(arr);
        System.out.println("After using Insertion sort the given array:");
        displayArray2.printArray(sortArray);
    }
}
