/**
 * Q4. Find out how many pass would be required to sort the following array in decreasing order using bubble sort
 *
 * Input Array {3,5,1,6,0}
 */

package Sorting.Sorting_Assignment;

public class _4_problem {

    public static int bubbleSort(int arr[]){

        int count=1;
        int swap=0;
        for (int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length-1-i;j++){

                if(arr[i] < arr[j] ){

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                    swap++;
                    count++;
                }
            }

            if (swap == 0) break;
        }
        return count;
    }

    public static void main(String[] args) {


        int arr[]={3,5,1,6,0};
        int count=bubbleSort(arr);
        System.out.println("There are "+count+" Iteration Bubble Sorting ( Descending order ) the given array:");
    }
}
