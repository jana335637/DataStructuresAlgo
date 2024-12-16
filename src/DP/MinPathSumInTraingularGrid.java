package DP;

import java.util.List;

public class MinPathSumInTraingularGrid {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.toArray().length;
        int[] front=new int[n];
        int[] cur = new int[n];
        for (int i = 0; i < n; i++) {
            front[i] = triangle.get(n-1).get(i);
        }
        for (int i = n-2; i >=0; i--) {
            for (int j = i; j >= 0 ; j--) {
                int down = front[j] + triangle.get(i).get(j);
                int diagonal = front[j+1] + triangle.get(i).get(j);
                cur[j] = Math.min(down, diagonal);
            }
            front =cur.clone();
        }
        return front[0];
    }
}
