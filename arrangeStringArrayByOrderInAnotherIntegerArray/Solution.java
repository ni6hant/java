class Solution {
    public static String solution(String S, int[] A) {
        // write your code in Java SE 8

        //Store the String as characters in a new character array
        char[] characterArray = S.toCharArray();

        //Initial Message of the first character at 0
        String finalMessage = String.valueOf(characterArray[0]);

        //Spot -0 person tells me where to send the message
        int end = A[0];
        //Until the array reaches the int array with the element 0
        while (end!=0){
            //Append the array with the message
            finalMessage += characterArray[end];
            //Assign the end to the provideed step
            end = A[end];
        }
        return finalMessage;
    }

    public static void main(String[] args) {
        System.out.println("Program Starts");
        System.out.println(solution("cdeo", new int[]{3, 2, 0, 1}));
        System.out.println(solution("cdeenetpi", new int[]{5, 2, 0, 1, 6, 4, 8, 3, 7}));
        System.out.println(solution("bytdag", new int[]{4, 3, 0, 1, 2, 5}));
    }
}
