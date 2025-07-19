package AlgoUniversity.PrefixSumRangeQueriesUpdates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChasingTheDragon {
    static int n, q;
    static int[] arr;
    static long[][] queries;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        takeInput();
        int[] prefixSum = new int[n]; prefixSum[0]=arr[0];
        int[] suffixSum = new int[n]; suffixSum[n-1]=arr[n-1];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
            suffixSum[n-1-i] = suffixSum[n-i] + arr[n-1-i];
        }
        int currIndex = 0, targetIndex = 0;
        for (int i = 0; i < q; i++) {
            long direction = queries[i][0];
            long distance = queries[i][1];
            distance = distance % n;
            if(direction == 1){
                targetIndex = (int) (currIndex+distance);
                targetIndex = targetIndex % n;
            } else {
                targetIndex = (int) (currIndex-distance);
                if(targetIndex < 0){
                    targetIndex += n;
                }
            }
            //System.out.println(currIndex + " " + targetIndex);
            if(currIndex == targetIndex){
                System.out.println(0);
            }
            else if(currIndex > targetIndex){
                System.out.println(Math.min(getPrefixSum(targetIndex-1, currIndex-1,prefixSum), getPrefixSum(-1, targetIndex,prefixSum)+ getPrefixSum(currIndex, n-1,prefixSum)));
            } else {
                System.out.println(costForTravel(currIndex, targetIndex, arr, prefixSum, suffixSum));
            }
            currIndex = targetIndex;
        }
    }
    static int costForTravel(int currIndex, int targetIndex, int[] arr, int[] prefixSum, int[] suffixSum) {
        int clockWiseCost = getPrefixSum(currIndex, targetIndex, prefixSum);
        int reverseCostToEnd = 0;
        if(currIndex != 0){
            reverseCostToEnd = prefixSum[currIndex-1];
        }
        int antiClockWiseCost = reverseCostToEnd + suffixSum[targetIndex];
        return Math.min(clockWiseCost, antiClockWiseCost);
    }
    static int getPrefixSum(int l, int r, int[] prefixSum) {
        if(l==-1) return prefixSum[r];
        return prefixSum[r]-prefixSum[l];
    }
    static int getSuffixSum(int l, int r, int[] suffixSum) {
        return suffixSum[r];
    }

    public static void takeInput() throws IOException {
        st = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(reader.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(reader.readLine());
        q = Integer.parseInt(st.nextToken());
        queries = new long[q][2];
        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(reader.readLine());
            queries[i][0] = Integer.parseInt(st.nextToken());
            queries[i][1] = Integer.parseInt(st.nextToken());
        }
    }
}
