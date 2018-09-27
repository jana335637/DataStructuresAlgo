package CF;

import java.util.Scanner;

public class DancePalindrome
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        int[] costs = new int[2];
        costs[0]=in.nextInt();
        costs[1]=in.nextInt();
        for (int i = 0; i < size; i++) {
            array[i]=in.nextInt();
        }
        System.out.println(getMinCost(array,costs));

    }

    private static int getMinCost(int[] array, int[] costs) {
        int size=array.length;
        int loopsize=0,cost=0;
        loopsize = (size/2)-1;
        for (int i = 0; i <= loopsize ; i++) {
            int p1=i,p2=size-1-i;
            if(array[p1]<=1 && array[p2]<=1){
                if(array[p1]!=array[p2])
                {
                    return -1;
                }
            }
            if(array[p1]==2 || array[p2]==2){
                if(array[p1]<=1)
                {
                    array[p2]=array[p1];
                    cost+=costs[array[p1]];
                }
                else if(array[p2]<=1)
                {
                    array[p1]=array[p2];
                    cost+=costs[array[p2]];
                }
                else
                    cost+=(2*((costs[0]<costs[1])?costs[0]:costs[1]));
            }
        }
        if((size&1)==1){
            if(array[size/2]==2)
                cost+=(costs[0]<costs[1])?costs[0]:costs[1];
        }
        return cost;
    }
}
