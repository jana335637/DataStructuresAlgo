package Array;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {}
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> leaders = new ArrayList<>();
        int n=  arr.length;
        int max=arr[n-1];
        leaders.add(max);
        for (int i = n-2; i >=0; i--) {
            if(arr[i]>max){
                max=arr[i];
                leaders.add(max);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
