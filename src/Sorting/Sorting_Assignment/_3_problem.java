/**
 * Q2. WAP to sort an array in descending order using selection sort.
 *  *
 *  * Input Array {3,5,1,6,0}
 *  *
 *  * Output Array: {6, 5, 3, 1, 0}
 */

package Sorting.Sorting_Assignment;

class displayArray3{

    public static void printArray(int arr[]){

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
}

public class _3_problem {

    public static int[] selectionSort(int arr[]){

        for(int i=0;i<arr.length;i++){

            int max_index=i;//<--- max_idx is responsible to store the index of Maximum value in every iteration.
            for(int j=i+1;j<arr.length;j++){

                if( arr[max_index] < arr[j] ){

                    max_index=j;
                }
            }

            if( max_index != i ){
                // swapping is required.
                int temp = arr[i];
                arr[i]=arr[max_index];
                arr[max_index]=temp;

            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int arr[]={3,5,1,6,0};


        System.out.println("Before swapping the given array:");
        displayArray3.printArray(arr);

        int sortArray[]=selectionSort(arr);
        System.out.println("After using Selection sort (Decresing order ) the given array:");
        displayArray3.printArray(sortArray);

    }
}
