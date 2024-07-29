package Recursion.JavaFoundation_RecursionPortion_Only;

public class Print_GCDNumber_DivisionApproach {

    public static int printDivisionApproach(int x,int y){

        // Base case condition or Terminating conditon.
        if( y == 0 ){

            return x;
        }

            int rem = x % y;
            x=y;
            y=rem;

           // Recursive calls
        return printDivisionApproach(x,y);

    }

    public static void main(String[] args) {

        System.out.println(" Remainder is:"+printDivisionApproach(24,15));



    }
}
