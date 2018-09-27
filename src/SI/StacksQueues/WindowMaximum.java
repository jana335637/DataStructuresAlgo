package SI.StacksQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WindowMaximum {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            windowMax();
        }

    }
    static void windowMax() throws Exception{
        String s =br.readLine();
        int n = Integer.parseInt(s.split(" ")[0]),k = Integer.parseInt(s.split(" ")[1]),front=0,rear=0,size=n,max=Integer.MIN_VALUE,i;
        s = br.readLine();
        int[] elements = new int[n];
        String[] stringElements = s.split(" ");
        for (int j = 0; j < stringElements.length; j++) {
            elements[j] = Integer.parseInt(stringElements[j]);
        }
        int[] dequeue = new int[n];
        for (i = 0; i < k; i++) {
            if(elements[max]<elements[i])
                max=i;
            dequeue[++rear]=i;
        }
        while((rear-front+1)>0 && elements[i]>dequeue[rear]){
            rear--;
            dequeue[++rear]=elements[i];
            i++;
        }
    }
}
