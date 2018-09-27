package SI.StacksQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CollectingMangoes {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            System.out.println("Case :"+(i+1));
            collectMangoes();
        }
    }
    static void collectMangoes() throws Exception{
        String s =br.readLine();
        int n = Integer.parseInt(s),top=-1;
        int[] mangoStack = new int[n],maxStack = new int[n];
        while(n>0){
            String command = br.readLine();
            if(command.length()>1){
                int x = Integer.parseInt(command.split(" ")[1]);
                mangoStack[++top]=x;
                if(top==0)
                    maxStack[top]=x;
                else{
                    if(x>maxStack[top-1])
                        maxStack[top]=x;
                    else
                        maxStack[top]=maxStack[top-1];
                }
            }
            else if(command.equals("Q")){
                if(top==-1)
                    System.out.println("Empty");
                else
                    System.out.println(maxStack[top]);
            }else {
                if(top>-1)
                    --top;
            }
            n--;
        }
    }
}
