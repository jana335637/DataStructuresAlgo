package SI;

import java.util.Scanner;

/**
 * Created by pillutja on 9/6/2018.
 */
public class CabinetsPartitioning {
    static Scanner in = new Scanner(System.in);
    static int ans = 0;
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            cabinetsPartition();
        }
    }

    private static void cabinetsPartition() {
        int tasksCount = in.nextInt();
        int workers = in.nextInt(),sum=0,avg, calculated=0;
        int[] tasks = new int[tasksCount];
        for (int i = 0; i < tasksCount; i++) {
            tasks[i] = in.nextInt();
            sum+=tasks[i];
        }
        if(tasksCount==1)
            System.out.println(sum);
        else{
            avg =sum/workers;
            int low =avg,high =sum;
            //System.out.println("low:"+low+",high:"+high);
            while(low<high){
                calculated=1;
                int mid = low+(high-low)/2;
                //System.out.println("mid:"+mid);
                //System.out.println("valid:"+valid(tasks,mid,workers));
                if(valid(tasks,mid,workers)==true)
                    high=mid;
                else
                    low=mid+1;
            }
            valid(tasks,low,workers);
            if( calculated==0)
                System.out.println(low);
            else
                System.out.println(ans);
        }

    }

    private static boolean valid(int[] tasks,int key,int workers) {
        int currentSum=0,partitions=0,max=Integer.MIN_VALUE;
        for (int i = 0; i < tasks.length; i++) {
            currentSum+=tasks[i];
            if(currentSum>key){
                //System.out.println("comparing Max:"+(currentSum-tasks[i])+",Max"+max);
                if((currentSum-tasks[i])>max)
                    max=currentSum-tasks[i];
                currentSum=tasks[i];
                partitions++;
            }
            if(currentSum==key){
                //System.out.println("comparing Max:"+(currentSum)+",Max"+max);
                if((currentSum)>max)
                    max=currentSum;
                currentSum=0;
                if(i!=tasks.length-1)
                    partitions++;
            }
        }
        ans=max;
        //System.out.println("Partitions:"+partitions);
        if(partitions<=(workers-1))
            return true;
        return false;
    }
}
