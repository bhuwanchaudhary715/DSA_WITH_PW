package Complexity_Analysis_and_Array;

public class duplicateElementFinding {

    public static void main(String[] args) {

        int arrayElements[]= { 2,4,4,8,9,6 };

        for(int i=0;i<arrayElements.length;i++){

            for (int j=i+1;j<arrayElements.length;j++){

                if(arrayElements[i] == arrayElements[j]){
                    System.out.println("Duplicate Array is:"+arrayElements[i]);
                    return;
                }
            }
        }
    }
}
