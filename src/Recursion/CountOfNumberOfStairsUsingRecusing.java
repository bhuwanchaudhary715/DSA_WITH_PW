package Recursion;

import java.util.Scanner;

public class CountOfNumberOfStairsUsingRecusing {

    public static int printCountStair(int n ){

        //Base case condition
        if( n <= 1  ){

            return n;

        }else {

            return printCountStair(n-2) + printCountStair(n-1);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();

        System.out.println(printCountStair(n+1));
    }
}