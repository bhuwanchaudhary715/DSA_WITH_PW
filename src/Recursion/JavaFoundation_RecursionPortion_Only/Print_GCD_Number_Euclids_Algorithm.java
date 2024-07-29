package Recursion.JavaFoundation_RecursionPortion_Only;

public class Print_GCD_Number_Euclids_Algorithm {

    public static int printEuclidAlgorithm(int x,int y){

        // Base case condition or Terminating condition
        if( y == 0){

            return x;
        }

        // Recursive algorithm
        return printEuclidAlgorithm(y,x%y);

    }

    public static void main(String[] args) {

        System.out.println(" Ecluids Algorithm:"+printEuclidAlgorithm(24,15));


    }
}
