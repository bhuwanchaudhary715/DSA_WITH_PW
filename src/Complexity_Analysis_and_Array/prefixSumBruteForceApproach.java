package Complexity_Analysis_and_Array;

import java.util.*;

class bruteForceApproach{

    public static int prefixSum(int arraysElements[][],int r1,int r2,int c1,int c2){
        int sum=0;
        for(int i=r1; i<=r2;i++){
            for (int j=c1; j<=c2;j++){

                sum +=arraysElements[i][j];
            }
        }
        return sum;
    }
}

public class prefixSumBruteForceApproach {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Row");
        int row=sc.nextInt();
        System.out.println("Enter the size of Column");
        int column=sc.nextInt();
        int arrayElements[][] = new int[row][column];

        System.out.println("Enter the value of Rows and Columns elements");
        for (int i=0;i<arrayElements.length;i++) {     // <--Row
            for (int j = 0; j < arrayElements.length; j++) {  // <--Column

                arrayElements[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entert the value of coordinates r1");
        int r1= sc.nextInt();
        System.out.println("Entert the value of coordinates r2");
        int r2= sc.nextInt();
        System.out.println("Entert the value of coordinates c1");
        int c1= sc.nextInt();
        System.out.println("Entert the value of coordinates c2");
        int c2= sc.nextInt();

        int sum=bruteForceApproach.prefixSum(arrayElements,r1,r2,c1,c2);
        System.out.println("sum of rectangle size is :"+sum);

    }
}
