//Buggy code
//The code is supposed to return the first repeated character, not the last one.

import java.util.*;
class Solution {
    static String solution(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }

        char best_char = 'a';
        int  best_res  = 0;

        for (int i = 1; i < 26; i++) {
            if (occurrences[i] >= best_res) {
                best_char = (char)((int)'a' + i);
                best_res  = occurrences[i];
            }
        }

        return Character.toString(best_char);
    }

    public static void main(String[] args){
        System.out.println("Program Starts");
        String s = solution("helloo");
        System.out.println(s);
    }
}
