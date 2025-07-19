package BinarySearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindCapacityOfShipToLoad {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //list.add(1, 1);
        System.out.println(list);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(0, 2);
        map.put(-1, 2);
        for (int i = 2; i < 100; i++) {
            map.put(i, i);
        }
        for(Map.Entry i: map.entrySet()){
            System.out.println(i.getKey());
        }
        System.out.println(map);
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = maxElement(weights), high = sum(weights), ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(getDaysWithCapacity(weights, mid) <= days){
                ans =mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return ans;
    }
    private int getDaysWithCapacity(int[] weights, int target){
        int load=0, days=1;
        for (int i = 0; i < weights.length; i++) {
            if(load+weights[i]>target){
                days+=1;
                load=weights[i];
            } else{
                load+=weights[i];
            }
        }
        return days;
    }
    private int maxElement(int[] weights){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<weights.length; i++){
            if(weights[i]>max){
                max = weights[i];
            }
        }
        return max;
    }
    private int sum(int[] weights){
        int sum = 0;
        for(int i=0; i<weights.length; i++){
            sum += weights[i];
        }
        return sum;
    }
}
