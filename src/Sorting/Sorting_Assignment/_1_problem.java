/**
 * Q1. Write a program to sort an array in descending order using bubble sort.
 *
 * Input Array {3,5,1,6,0}
 *
 * Output Array: {6, 5, 3, 1, 0}
 */

package Sorting.Sorting_Assignment;

class displayArray1{

    public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}


public class _1_problem {

    public static int[] bubbleSort(int arr[]){

        int swap=0;
        for (int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length-1-i;j++){

                if(arr[i] < arr[j] ){

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swap++;
                }
            }
            if (swap == 0) break;
        }
        return arr;
    }

    public static void main(String[] args) {

        int arr[]={3,5,1,6,0};

        System.out.println("Before swapping the given array:");
        displayArray1.printArray(arr);

        int sortArray[]=bubbleSort(arr);
        System.out.println("After Bubble Sorting ( Descending order ) the given array:");
        displayArray1.printArray(sortArray);

    }
}
