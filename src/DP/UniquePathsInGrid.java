package DP;

public class UniquePathsInGrid {
    public int uniquePaths(int m, int n) {
        int[] prev = new int[n];
        for (int i = 0; i < m; i++) {
            int[] tmp = new int[n];
            int up=0, left=0;
            for (int j = 0; j < n; j++) {
                if(i==0 && j==0){
                    tmp[j]=1;
                    continue;
                }
                if(i>0){
                    up = prev[j];
                }
                if(j>0){
                    left = tmp[j-1];
                }
                tmp[j] = up+ left;
            }
            prev=tmp;
        }
        return prev[n-1];
    }
}
