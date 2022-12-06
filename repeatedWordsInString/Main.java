
import java.util.*; 
import java.io.*;

//I wrote this code in the very intial days of my programming with java
//I realize that this code is very complex then it needs to be
//Using any collection framework will certainly make this code faster

//Bugs: The repeated word is printed more than once
//Bugs: If hello is input, something weird happens and the hello word is sent back twice

 
class Main {
 
  public static String StringChallenge(String str) {
 
    //Split string based on spaces and store it in a string array: splitString
    String[] splitString = str.split("\\s+");
 
    //Store the total number of words in the given string, or the first dimension
    int stringLength = splitString.length;
    String finalString ="";
    int nullCount = 0;
 
    String tempString = splitString[0];
    for(int i = 0; i<stringLength; i++){
      /*Debugging
      Test Code to see if everything's working
      System.out.println(splitString[i]);
      */
 
      /*Debugging
      countMaxCharacterString(splitString[i]);
      System.out.println(countMaxCharacterString(splitString[i]));
      */
      for(int j=0;j<stringLength;j++){
         /*Debugging
         System.out.println(countMaxCharacterString(splitString[i])+" "+countMaxCharacterString(splitString[j]));
          */
        if(countMaxCharacterString(splitString[i])>countMaxCharacterString(splitString[j])){
          if(tempString.length()!=splitString[i].length()){
          tempString = splitString[i];
          }
        } 
      }
 
      //Test case for no repeatations in the word
      if(countMaxCharacterString(splitString[i])!=1){
        
      nullCount = nullCount + countMaxCharacterString(splitString[i]) - 1;
      }
     //System.out.println(nullCount+" "+countMaxCharacterString(splitString[i]));
    }
  
  //If there are no repetations
  if (nullCount == 0){
  //  System.out.println("null "+tempString);
    return "-1";
  }
 
  System.out.println(tempString);
  return tempString;
    //return str;
  }
 
//A function to count and return the maximum number of characters in a string
  public static int countMaxCharacterString(String initialString){
    
    //Debugging
    //System.out.println(initialString);
    //return 0;
 
    int count = 0;
 
    //Store the string into a character array
    char[] characterArray = new char[initialString.length()];
    for (int i =0; i<initialString.length();i++){
      characterArray[i] = initialString.charAt(i);
     // System.out.println(characterArray[i]);
    }
 
    //Count the number of characters in the string
    for(int i=0;i<initialString.length();i++){
      int tempCount = 0;
      for(int j=0;j<initialString.length();j++){
        if(characterArray[j]==characterArray[i]){
          tempCount++;
 
        }
      }
      if (tempCount>count){
        count = tempCount;
 
      }
 
    }
// //If no repeating words then return -1
// if (count == 0){
//   return -1;
// }
    return count;
  }
 
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StringChallenge(s.nextLine())); 
  }
 
}
