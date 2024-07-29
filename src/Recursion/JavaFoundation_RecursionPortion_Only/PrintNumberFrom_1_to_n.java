package Recursion.JavaFoundation_RecursionPortion_Only;

public class PrintNumberFrom_1_to_n {

    public static void print_1_to_n(int n){

        // -------- Base case Condition or Terminating Condition. -------------
        if( n == 1 ){

            System.out.println(n);
            return;
        }

        //-------------------- Recursive calls ----------------------
        print_1_to_n(n-1);

        //------------------------- self work --------------------------
        System.out.println(n);

    }

    public static void main(String[] args) {


        int n=4;
        print_1_to_n(n);
    }
}
