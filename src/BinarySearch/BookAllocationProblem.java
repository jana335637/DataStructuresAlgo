package BinarySearch;

import java.util.ArrayList;

public class BookAllocationProblem {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        int low = maxElements(arr), high = sum(arr), ans = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(getNoOfStudents(arr, n, m, mid)>m){
                ans=mid;
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static int maxElements(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public static int sum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    private static int getNoOfStudents(ArrayList<Integer> arr, int n, int m, int target)
    {
        int load =0, students=1;
        for (int i = 0; i < arr.size(); i++) {
            if(load+arr.get(i) > target){
                students++;
            }else{
                load+=arr.get(i);
            }
        }
        return students;
    }
}
