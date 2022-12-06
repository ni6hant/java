import java.util.Scanner;

//The code below is very inefficient but this is what I was able to come up with,
//given the time I was writing this code I didn't had the proper understanding of Collections Framework

class Solution {
    public static int solution(int[] A) {

        int finalSum = -1;
        int tempSum = 0;
        int currentSum = 0;

        for(int i=0;i<A.length;i++){
            for(int j=0;j<i;j++){
                currentSum = 0;
                //Debug Code
                //System.out.println("In outer loop at "+i+" and inner "+j);
                if(A[i]==A[j]){
                    //Debug Code
                    //System.out.println("Match found at i =" + i+" and j ="+j);
                    for(int k = j; k<=i;k++){
                        currentSum = currentSum + A[k];
                        //Debug Code
                        //System.out.println("k = "+ k + ". currentSum =" + currentSum);
                    }
                    if(currentSum>tempSum){
                        tempSum = currentSum;
                        //Debug Code
                        //System.out.println("Higher Sum Found =" + currentSum);
                    }
                }
            }
        }
        finalSum = tempSum;
        if(finalSum==0){
            finalSum = -1;
        }
        return finalSum;
    }

    public static void main (String[] args) {  
        int[] A = {1, 3, 6, 1, 6, 6, 9, 9};
        System.out.println(solution(A));
      }
     
}
