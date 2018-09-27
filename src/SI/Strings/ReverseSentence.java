package SI.Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseSentence {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            sentenceReversal();
        }
    }
    static void sentenceReversal() throws Exception{
        String s =br.readLine();
        char[] array = s.toCharArray();
        array = arrayReversal(array,0,array.length);
        int start=0;
        //System.out.println(new String(array));
        for (int i = 0; i < array.length; i++) {
            if(array[i]==' '){
                //System.out.println(start+" "+i);
                System.out.print(arrayReversal(array,start,i));
                System.out.print(array[i]);
                start=i+1;
            }
            if(i==array.length-1)
                System.out.print(arrayReversal(array,start,i+1));
        }
       /* int end = s.length()-1;
        for (int i = s.length()-1; i > 0; i--) {
            if(s.charAt(i)==' '){
                System.out.print(s.substring(i+1,end+1));
                System.out.print(s.charAt(i));
                end=i-1;
            }
        }
        System.out.print(s.substring(0,end+1));
        System.out.println();*/
    }
    private static char[] arrayReversal(char[] array, int start, int end) {
        char[] tempArray = new char[end-start];
        for (int i = 0; i <= (end-start)/2; i++) {
            char temp = array[start+i];
            tempArray[i]=array[end-1-i];
            tempArray[end-1-i-start] = temp;
        }
        return tempArray;
    }
}
