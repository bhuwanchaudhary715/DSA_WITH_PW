

public class Main {

    public static int countNegatives(int[][] grid) {

        int row = grid.length;
        int column = grid.length;
        int countNeg = 0;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {

                if ( grid[i][j] < 0 ) {

                    countNeg++;
                }
            }
        }
        return countNeg;
    }
        public static void main(String[] args) {

        int arr[][]={  {5,-1,0},
                       {-5,-5,-5}
                    };
       int s= countNegatives(arr);
            System.out.println(s);
    }

}