package Sorting;

import java.util.Scanner;

class displayArray1{

    public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}

public class BubbleSort {

    public static int[] sortAscendingOrder_1(int arr[]){

        int swap=0;
        for (int i=0;i<arr.length;i++){

            for (int j=0;j<arr.length-1-i;j++){

                if( arr[j] > arr[j+1] ){

                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if( swap == 0 )
                break;
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
        displayArray1.printArray(arr);

        int sortArray[]=sortAscendingOrder_1(arr);
        System.out.println("After Bubble Sorting ( Ascending Order ) the given array:");
        displayArray1.printArray(sortArray);

    }
}
