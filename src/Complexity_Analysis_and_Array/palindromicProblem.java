package Complexity_Analysis_and_Array;

public class palindromicProblem {

    public static void main(String[] args) {

        int studentScore[]={1,2,3,2,1};
        int n=studentScore.length;
        boolean flag = true;

        for(int i=0; i<n/2;i++){

            if(studentScore[i] != studentScore[n-1-i]){

                System.out.println("Given number is not palindrome:");
                flag=false;
                break;
            }
        }

        if(flag== true){

            System.out.println("Given number is palindrome");
        }
    }

}
