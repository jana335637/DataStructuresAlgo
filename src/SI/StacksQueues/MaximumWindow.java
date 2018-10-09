package SI.StacksQueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by pillutja on 8/17/2018.
 */
public class MaximumWindow  {

    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        int testCases = Integer.parseInt(s);
        for (int i = 0; i < testCases; i++) {
           maxWindow();
        }
    }

    public static void maxWindow() throws IOException  {
        String s = br.readLine();
        int n = Integer.parseInt(s.split(" ")[0]),k= Integer.parseInt(s.split(" ")[1]),sum=0;
        int[] a = new int[n];
        s=br.readLine();
        Deque<Integer> dequeue = new ArrayDeque<>();
        String[] stringElements = s.trim().split(" ");
        for (int j = 0; j < stringElements.length; j++) {
            a[j] = Integer.parseInt(stringElements[j]);
        }
        for (int i = 0; i < k; i++) {
            while(!dequeue.isEmpty() && a[i]>a[dequeue.peekFirst()]){
                dequeue.pollFirst();
            }
            if( dequeue.isEmpty() || a[i]>a[dequeue.peekFirst()]){
                dequeue.addFirst(i);
            }else{
                while(!dequeue.isEmpty() && a[i]>a[dequeue.peekLast()]){
                    dequeue.pollLast();
                }
                dequeue.addLast(i);
            }
        }
        for (int i = k; i < n ; i++) {
            sum+=a[dequeue.peekFirst()];
            if(dequeue.peekFirst()==(i-k)){
                dequeue.pollFirst();
            }
            while(!dequeue.isEmpty() && a[i]>a[dequeue.peekFirst()]){
                dequeue.pollFirst();
            }
            if( dequeue.isEmpty() || a[i]>a[dequeue.peekFirst()]){
                dequeue.addFirst(i);
            }else{
                while(!dequeue.isEmpty() && a[i]>a[dequeue.peekLast()]){
                    dequeue.pollLast();
                }
                dequeue.addLast(i);
            }
        }
        System.out.println(sum+a[dequeue.peekFirst()]);
    }
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        Deque<Integer> dequeue = new ArrayDeque<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < B; i++) {
            while(!dequeue.isEmpty() && A.get(i)>A.get(dequeue.peekFirst())){
                dequeue.pollFirst();
            }
            if( dequeue.isEmpty() || A.get(i)>A.get(dequeue.peekFirst())){
                dequeue.addFirst(i);
            }else{
                while(!dequeue.isEmpty() && A.get(i)>A.get(dequeue.peekLast())){
                    dequeue.pollLast();
                }
                dequeue.addLast(i);
            }
        }
        for (int i = B; i < A.size() ; i++) {
            ans.add(A.get(dequeue.peekFirst()));
            if(dequeue.peekFirst()==(i-B)){
                dequeue.pollFirst();
            }
            while(!dequeue.isEmpty() && A.get(i)>A.get(dequeue.peekFirst())){
                dequeue.pollFirst();
            }
            if( dequeue.isEmpty() || A.get(i)>A.get(dequeue.peekFirst())){
                dequeue.addFirst(i);
            }else{
                while(!dequeue.isEmpty() && A.get(i)>A.get(dequeue.peekLast())){
                    dequeue.pollLast();
                }
                dequeue.addLast(i);
            }
        }
        ans.add(A.get(dequeue.peekFirst()));
        return ans;
    }
}
