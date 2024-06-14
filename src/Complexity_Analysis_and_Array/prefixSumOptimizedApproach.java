package Complexity_Analysis_and_Array;

import java.util.*;

class optimizedApproach{

    public static int[][] prefixSum(int arrayElements[][]){

        // ------> Traverse the array row-wise to calculate the prefixSum <--------
        for (int i=0;i<arrayElements.length;i++) {     // <--Row
            for (int j = 1; j < arrayElements.length; j++) {  // <--Column

                arrayElements[i][j] += arrayElements[i][j-1];
            }
        }

        // ------> Traverse the array column-wise to calculate the prefixSum <--------
        for (int i=1;i<arrayElements.length;i++) {     // <--Row
            for (int j = 0; j < arrayElements.length; j++) {  // <--Column

                arrayElements[i][j] += arrayElements[i-1][j];
            }
        }
        return arrayElements;
    }

    // ----------> Sum of all sum Region <------------------------
    public static int sumRegion(int arrayElements[][],int r1,int r2,int c1,int c2){

        int prefixSum=0, up=0, left=0, repeated=0, result=0;

        prefixSum=arrayElements[r2][c2];
        up=arrayElements[r1-1][c2];
        left=arrayElements[r2][c1-1];
        repeated=arrayElements[r1-1][c1-1];

        result=prefixSum-left-up+repeated;
        return result;
    }
}

public class prefixSumOptimizedApproach {

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

        int prefixSumArray[][] = optimizedApproach.prefixSum(arrayElements);
        int result= optimizedApproach.sumRegion(prefixSumArray,r1,r2,c1,c2);
        System.out.println("Sum of element of rectangle:"+result);





    }
}
