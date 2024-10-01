import java.util.Scanner;
class Series{

        public static int fibonacciNum(int num) {


        // Base case condition or Terminating Condition
        if (num <= 1) {

            return num;
        } else

            // Recursive calls
            return fibonacciNum(num - 1) + fibonacciNum(num - 2);
         }
    }
class Main{

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of Number:");
        int num=sc.nextInt();

        System.out.println("Fibonacci Series are:");


        for(int i=0;i<num;i++){


        }

    }
}