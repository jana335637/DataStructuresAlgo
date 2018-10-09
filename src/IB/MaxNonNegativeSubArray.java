package IB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pillutja on 8/17/2018.
 */
public class MaxNonNegativeSubArray {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int[] test = [44, 41, 12, 42, 71, 45, 28, 65, 75, 93, 66, 66, 37, 6, 24, 59];
        * [1, 2, 5, -7, 2, 3]*/
        int testCases = in.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            A.add(in.nextInt());
        }
        A = maxset(A);
        for (int num : A) {
            System.out.print(num+" ");
        }

    }

    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {
        if(A.size()==1){
            if(A.get(0)<0)
                return new ArrayList<>();
            return A;
        }
        int sum=0,ansStart=-1,ansEnd=-1,tempStart=0,tempEnd=-1,ansSum=Integer.MIN_VALUE,preNegSum=0,negativeSum=0,flag=0;
        ArrayList<Integer> prefixSums = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : A) {
            if(num>=0)
                flag=1;
            prefixSums.add(sum+=num);
        }
        if(flag==0)
            return new ArrayList<>();
        for (int i = 0; i < prefixSums.size()-1; i++) {
            if(A.get(i)<0)
                continue;
            if(prefixSums.get(i)>prefixSums.get(i+1)){
                negativeSum = prefixSums.get(i+1);
                tempEnd=i;
                int tempSum = (ansStart==-1)?prefixSums.get(i):(prefixSums.get(i)-preNegSum);
                if(ansSum<tempSum){
                    ansSum=tempSum;
                    ansStart=tempStart;
                    ansEnd=tempEnd;
                }
            }
            if(i>0 && A.get(i-1)<0)
            {
                tempStart=i;
            }
            preNegSum = negativeSum;
        }
        int last=prefixSums.size()-1,ite=last-1;
        if(ansEnd!=prefixSums.size()-2 && A.get(last)>=0) {
            while (ite >= 0) {
                if (ite == 0) {
                    ansStart = 0;
                    ansEnd = prefixSums.size() - 1;
                }
                if (A.get(ite) < 0) {
                    int tempSum = prefixSums.get(last) - prefixSums.get(ite);
                    if (ansSum < tempSum) {
                        ansSum = tempSum;
                        ansStart = ite + 1;
                        ansEnd = last;
                    }
                    break;
                }
                ite--;
            }
        }
        if(ansStart==0 && ansEnd==prefixSums.size()-1)
            return A;
        for (int i = ansStart; i <= ansEnd ; i++) {
            ans.add(A.get(i));
        }
        return ans;
    }
}
