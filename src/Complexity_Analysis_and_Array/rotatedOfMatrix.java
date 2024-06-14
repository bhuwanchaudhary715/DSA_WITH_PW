package Complexity_Analysis_and_Array;
import java.util.Scanner;

class firstApproach{

    public static int[][] rotate_90DegreeArray(int arrayElements[][]){
        // -------------> 1st Approach <--------------
        // ------------> Transpose the matrix from rows to columns OR column to rows <---------------
        System.out.println("rotated of matrix 90 degree in clockWise direction using 2nd approach");
        for(int i=0;i<arrayElements.length;i++){
            for (int j=i;j<arrayElements.length;j++){

                int temp=arrayElements[i][j];
                arrayElements[i][j]=arrayElements[j][i];
                arrayElements[j][i]=temp;
            }
        }

        // ---------------> Swap the light and right side columns <--------------------
        for (int i=0;i<arrayElements.length;i++){

            int left=0;
            int right=arrayElements.length-1;

            while (left < right){
                int temp=arrayElements[i][left];
                arrayElements[i][left]=arrayElements[i][right];
                arrayElements[i][right]=temp;
                left++;
                right--;
            }
        }
        return arrayElements;
    }
}

public class rotatedOfMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Row");
        int row=sc.nextInt();
        System.out.println("Enter the size of Column");
        int column=sc.nextInt();

        int arrayElements[][] = new int[row][column];

        System.out.println("Enter the value of Rows and Columns elements");
        for (int i=0;i<arrayElements.length;i++){     // <--Row
            for (int j=0;j<arrayElements.length;j++){  // <--Column

                arrayElements[i][j]=sc.nextInt();
            }
        }

      int rotatedArray[][]=firstApproach.rotate_90DegreeArray(arrayElements);

        for(int i=0;i<arrayElements.length;i++){
            for (int j=0;j<arrayElements.length;j++){

                System.out.print(" "+arrayElements[i][j]);
            }
            System.out.println();
        }
    }
}
