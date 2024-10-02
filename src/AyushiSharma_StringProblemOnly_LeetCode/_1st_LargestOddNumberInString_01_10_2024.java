/**
 * 1903.--> Largest Odd Number in String  [Easy]   { LeetCode Problem }
 *
 * You are given a string num, representing a large integer.
 * Return the largest-valued odd integer (as a string) that is a non-empty substring of num,
 * or an empty string "" if no odd integer exists.
 *
 * --> A substring is a contiguous sequence of characters within a string.
 *
 *
 */


package AyushiSharma_StringProblemOnly_LeetCode;

public class _1st_LargestOddNumberInString_01_10_2024 {

    public static String largestOddNumber(String num){

        for(int i=num.length()-1; i>=0; i--){

            if(Character.getNumericValue(num.charAt(i)) % 2 != 0){

                return num.substring(0,i+1);
            }
        }

        return "";
    }

    public static void main(String[] args) {

        String str="52387982";
        String largestOddNumberString = largestOddNumber(str);
        System.out.println(largestOddNumberString);

    }
}
