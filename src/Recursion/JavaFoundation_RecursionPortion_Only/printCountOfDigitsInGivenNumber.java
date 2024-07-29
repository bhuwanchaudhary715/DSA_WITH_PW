package Recursion.JavaFoundation_RecursionPortion_Only;

public class printCountOfDigitsInGivenNumber {

    public static int countNumber(int n ){

        int count=0;
        // Base case condition.
        if( n == 0 ) return 0;

        return countNumber(n/10) + count+1;
    }

    public static void main(String[] args) {

        System.out.println(countNumber(123));
    }
}
