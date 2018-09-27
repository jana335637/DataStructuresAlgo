package SI.StacksQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RedundantBraces {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            String s = br.readLine();
            System.out.println(redundantBraces(s));
            System.out.println();
        }
    }

    static int redundantBraces(String A) {
        int top = -1,count=0,pCount=0;
        ArrayList<Character> pathsStack = new ArrayList<>();
        String command = A;
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i)=='(' || command.charAt(i)=='[' || command.charAt(i)=='{'){
                if(count>0){
                    pCount=1;
                    count=0;
                }

                top++;
                pathsStack.add(command.charAt(i));
            }
            else if(command.charAt(i)==')' || command.charAt(i)==']' || command.charAt(i)=='}'){
                top--;
                if(count==1){
                    return 1;
                }
                if(count==0 && pCount==0){
                    return 1;
                }
                if(count==0 && pCount==1)
                    pCount=0;
                count=0;
            }
            else{
                count++;

            }
        }
        return 0;
    }
}
