//Buggy code
//The code is supposed to return the first repeated character, not the last one.
//TODO: The program should return -1 if no match is found

import java.util.*;
class Solution {
    static String solution(String S) {
        int[] occurrences = new int[26];
        for (char ch : S.toCharArray()) {
            occurrences[ch - 'a']++;
        }

        char best_char = 'a';
        int  best_res  = 0;

        for (int i = 0; i < 26; i++) {
            if (occurrences[i] > best_res) {
                best_char = (char)((int)'a' + i);
                best_res  = occurrences[i];
            }
        }

        return Character.toString(best_char);
    }

    public static void main(String[] args){
        System.out.println("Program Starts");
        System.out.println(solution("helo")); //This is producing wrong result
        System.out.println(solution("hello"));
        System.out.println(solution("helloo"));
    }
}
