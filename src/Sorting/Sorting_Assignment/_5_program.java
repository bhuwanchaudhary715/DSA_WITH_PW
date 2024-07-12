/**
 * Q5. Find out the number of iterations to sort the array in descending order using selection sort.
 *
 * Input Array {3,5,1,6,0}
 *
 */
package Sorting.Sorting_Assignment;

public class _5_program {

    public static int selectionSort(int arr[]){

        int count=1;
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
                count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {

        int arr[]={3,5,1,3,0};

        int count=selectionSort(arr);
        System.out.println("There are "+count+" Iteration Selection sort (Decresing order ) the given array:");

    }
}
