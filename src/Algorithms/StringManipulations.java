package Algorithms;

import javax.security.auth.callback.CallbackHandler;

public class StringManipulations {
    public static void main(String[] args) {
        String s = "My code is working";
        System.out.println(urlIfy(s.toCharArray(),s.trim().length()));
        System.out.println(isPalindromePermutation("Tact Coa"));
        System.out.println(Character.getNumericValue('z')+""+ Character.getNumericValue('A')+" " +Character.getNumericValue('a'));
        System.out.println((int)'z');
    }

    private static boolean isPalindromePermutation(String str) {
        return false;
    }

    private static String urlIfy(char[] charArray, int trueLength) {
       // char[]  charArray = s.toCharArray();
        int spaceCount = 0;
        for (char currectCharacter: charArray) {
            if(currectCharacter==' ')
                spaceCount++;
        }
        int index = trueLength + spaceCount*2 -1 ;
        System.out.println(index);
        char[] newArray = new char[index+1];
        /*charArray[trueLength] = '\0';*/
        for (int i=trueLength-1;i>=0;i--){
            if(charArray[i]== ' '){
                newArray[index]='0';
                newArray[index-1]='2';
                newArray[index-2]='%';
                index -=3;
            }
            else{
                newArray[index] = charArray[i];
                index--;
            }
        }
        return new String(newArray);
    }
}
