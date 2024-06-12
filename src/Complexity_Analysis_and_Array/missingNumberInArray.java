package Complexity_Analysis_and_Array;

import java.util.*;

public class missingNumberInArray {

    public static void main(String[] args) {

        int arrayElements[]={1,2,3,4,5,6,8};

        // -------------------> finding the missing elements <------------------------

        //  ------ sum of natural Number --------
        int n= arrayElements.length+1;
        int sumOfNaturalNum=n*(n+1)/2;

        // -------- sum of all the elements present inside Array.-----------
        int sumOfElements=0;
        for (int i=0;i<arrayElements.length;i++){

            sumOfElements +=arrayElements[i];
        }

        System.out.println(sumOfNaturalNum-sumOfElements);
    }
}
