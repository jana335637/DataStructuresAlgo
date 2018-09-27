package SI.StacksQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ImplementStack {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        stackOperations();
    }
    static void stackOperations() throws Exception{
        String s =br.readLine();
        int n = Integer.parseInt(s),top=-1;
        int[] stack = new int[n];
        while(n>0){
            String command = br.readLine();
            if((command.trim()).equals("pop")){
                if(top==-1)
                    System.out.println("Empty");
                else
                    System.out.println(stack[top--]);
            }
            else {
                int x = Integer.parseInt(command.split(" ")[1]);
                stack[++top]=x;
            }
            n--;
        }
    }
}
