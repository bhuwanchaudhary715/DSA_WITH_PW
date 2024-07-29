/**
 *
 * Q4 : Find the sum of the values of the array [92, 23, 15, -20, 10]
 *
 */

package Recursion.Assignment;

public class _4_problem {

    public static int sumOfGivenAllArrayElements(int arr[],int index){

          // Base case or Terminating condition.
        if( index == arr.length-1){

            return arr[index];

        }else {
               // Recursive call
            return  arr[index] + sumOfGivenAllArrayElements(arr,index+1) ;

        }
    }

    public static void main(String[] args) {

        int arr[]={92, 23, 15, -20, 10};

        int sum = sumOfGivenAllArrayElements(arr,0);
        System.out.println("The sum of Given Array elements:"+sum);

    }
}
