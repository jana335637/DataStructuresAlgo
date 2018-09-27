package SI.StacksQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ImplementQueue {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        queueOperations();
    }
    static void queueOperations() throws Exception{
        String s =br.readLine();
        int n = Integer.parseInt(s),front=-1,rear=-1;
        int[] queue = new int[n];
        while(n>0){
            String command = br.readLine().trim();
            if(command.equals("Dequeue")){
                if(front==rear)
                    System.out.println("Empty");
                else
                    System.out.println(queue[++front]);
            }
            else {
                int x = Integer.parseInt(command.split(" ")[1]);
                queue[++rear]=x;
            }
            n--;
        }
    }
}
