package SI.StacksQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ImplementDequeue {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        dequeueOperations();
    }
    static void dequeueOperations() throws Exception{
        String s =br.readLine();
        int n = Integer.parseInt(s),front=0,rear=0,size=n;
        int[] dequeue = new int[n];
        while(n>0){
            String command = br.readLine().trim();
            if(command.equals("pop_front")){
                if(front==rear)
                    System.out.println("Empty");
                else{
                    front= (front+1)%size;
                    System.out.println(dequeue[front]);
                }
            }
            else if(command.equals("pop_back")){
                if(front==rear)
                    System.out.println("Empty");
                else{
                    System.out.println(dequeue[rear]);
                    rear = (rear-1);
                    if(rear==-1)
                        rear+=size;
                }
            }else {
                String c = command.split(" ")[0];
                int x = Integer.parseInt(command.split(" ")[1]);
                if(c.equals("push_front")){
                    dequeue[front]=x;
                    front--;
                    if(front<0)
                        front+=size;
                    }
                else if(c.equals("push_back")){
                    ++rear;
                    rear=rear%size;
                    dequeue[rear]=x;
                    }
            }
            n--;
        }
    }
}
