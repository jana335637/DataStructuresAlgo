package Array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    /*public int longestSubarray(int[] arr, int k) {
        // code here
        //[1,2,3,1,1,1,1,1,-1,-2,5]
        //10 5 2 7 1 -10, 15
        int n = arr.length, l=0, r=0, maxLen=0, sum=0;
        while(r<n){
            while(sum>k && l<r){
                sum-=arr[l];
                l++;
            }
            if(sum==k){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
            if(r<n){
                sum+=arr[r];
            }
        }
        return maxLen;
    }*/
    public int longestSubarray1(int[] arr, int k) {
        // code here
        //[1,2,3,1,1,1,1,1,-1,-2,5]
        int n = arr.length, l=0, r=0, maxLen=0, sum=0;
        while(r<n){
            while(sum>k && l<=r){
                sum-=arr[l];
                l++;
            }
            if(sum==k){
                maxLen = Math.max(maxLen, r-l+1);
            }
            r++;
            if(r<n){
                sum+=arr[r];
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubArrayWithSumK obj = new LongestSubArrayWithSumK();
        System.out.println(obj.longestSubarray(new int[]{1,2,2,3,3,4}, 2));
    }

    public int longestSubarray(int[] arr, int k) {
        // code here
        //[10, 5, 2, 7, 1, -10]
        int n = arr.length;
        int sum = 0, maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(sum == k){
                System.out.println(maxLen);
                maxLen = Math.max(maxLen, i+1);
            }
            if(map.containsKey(sum-k)){
                System.out.println(i + " - " + map.get(sum-k));
                maxLen = Math.max(maxLen, i - map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLen;
    }

}
