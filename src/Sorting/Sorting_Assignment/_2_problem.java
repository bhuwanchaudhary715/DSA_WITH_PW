/**
 * Q3. WAP to sort an array in decreasing order using insertion sort
 *
 * Input Array {3,5,1,6,0}
 *
 * Output Array: {6, 5, 3, 1, 0}
 */

package Sorting.Sorting_Assignment;

class displayArray2{

    public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}

public class _2_problem {

    public static int[] insertionSort(int arr[]){

        for(int i=1;i<arr.length;i++){

            int j=i;
            while ( j > 0 && arr[j] > arr[j-1] ){

                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int arr[]={3,5,1,6,0};

        System.out.println("Before swapping the given array:");
        displayArray1.printArray(arr);

        int sortArray[]=insertionSort(arr);
        System.out.println("After using Insertion sort ( Descending Order ) the given array:");
        displayArray2.printArray(sortArray);

    }
}
