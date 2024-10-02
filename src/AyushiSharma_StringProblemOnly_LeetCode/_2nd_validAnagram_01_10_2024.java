package AyushiSharma_StringProblemOnly_LeetCode;

import java.util.HashMap;

public class _2nd_validAnagram_01_10_2024 {

    public static boolean isAnagram(String s,String t){

        // Create two HashMaps to store the frequency of characters
        HashMap<Character,Integer> m1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> m2 = new HashMap<Character,Integer>();

        // Populate the map for string s
        for(int i=0; i<s.length();i++){
            m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);

        }
        System.out.println(m1);


        // Populate the map for string t
        for(int i=0; i<t.length();i++){
            m2.put(t.charAt(i),m2.getOrDefault(t.charAt(i),0)+1);

        }
        System.out.println(m2);


        // Compare both maps
        if(m1.equals(m2)){
            return true;

        }else {
            return false;

        }
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram","nagaram"));

    }
}
