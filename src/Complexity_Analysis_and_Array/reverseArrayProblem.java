package Complexity_Analysis_and_Array;

// ----------------> reverse the Array using swap approach. <----------------
class reverse{

    public static int[] reverseArray(int arr[]){
        int temp;
        int n=arr.length;
        for(int i=0;i<n/2;i++){
              temp=arr[i];
              arr[i]=arr[n-1-i];
              arr[n-1-i]=temp;
        }
        return arr;
    }
}

//-------------> printReverse Array <------------------
class printReverseArray{

    public static void displayReverseArray(int arr[]){

        System.out.println("Before reverse the given Array:");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println("After reverse the given Array:");
        int reverseArray[]=reverse.reverseArray(arr);
        for(int i=0;i<reverseArray.length;i++){
            System.out.print(reverseArray[i]+" ");
        }
    }
}

public class reverseArrayProblem {

    public static void main(String[] args) {

        int array[]={1,2,3,4,5};
        printReverseArray.displayReverseArray(array);

    }
}
