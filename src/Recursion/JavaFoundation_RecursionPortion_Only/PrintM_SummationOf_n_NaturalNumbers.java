/**
 * Q2 - Find m-th summation of first n natural numbers where m-th summation of first n natural
 * numbers is defined as following:
 *  If m > 1: SUM(n, m) = SUM(SUM(n, m - 1), 1)
 *  Else :SUM(n, 1) = Sum of first n natural numbers
 *
 *  nput1: n = 3, m = 2
 *
 * Output1: SUM(3, 2) = 21
 *
 *
 * Explanation : SUM(3, 2)
 *  = SUM(SUM(3, 1), 1)
 *  = SUM(6, 1)
 *  = 21
 *
 *
 * Input2 : n = 4, m = 1
 * Output2 : SUM(4, 1) = 10
 *
 */


package Recursion.JavaFoundation_RecursionPortion_Only;

public class PrintM_SummationOf_n_NaturalNumbers {

    public static int sumOfN(int n){

        // --------->   Base case or terminating condition   <---------
        if( n == 1 )  return n ;


        // -------------->   Recursive call   <-------------
        int ans = sumOfN(n-1) + n ;

        return ans;
    }

    public static int summation( int n , int m ){

        //  ------------>   Base case or terminating condition   <----------
        if( m == 1 )  return sumOfN(n);

        // -------------->   Recusive calls   <------------
            int sum  = summation(n,m-1);

            return sumOfN(sum);

    }

    public static void main(String[] args) {


        System.out.println(summation(3,2));
    }
}
