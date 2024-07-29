package Recursion.JavaFoundation_RecursionPortion_Only;

public class PrintNumberFrom_n_to_1 {

    public static void print_n_to_1(int n){

        // Base case Condition or Terminating Condition.
        if( n == 1 ){

            System.out.println(n);
            return;
        }
        // self work
        System.out.println(n);

        // Recursive calls
        print_n_to_1(n-1);


    }

    public static void main(String[] args) {


        int n=4;
        print_n_to_1(n);
    }
}
