package Graph;

import java.util.ArrayList;

public class NumberOfProvinces {
    public void dfs(int v, int[][] matrix, boolean[] visited){
        if(visited[v]==false){
            visited[v]=true;
            int m = matrix[v].length;
            for (int i = 0; i < m; i++) {
                if(matrix[v][i] == 1 && v!=i && !visited[i]){
                    dfs(i, matrix, visited);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n=isConnected.length,m=0;
        if(n==0){ return 0;}
        else {
            m = isConnected[0].length;
        }
        boolean[]  visited = new boolean[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            if(visited[i] == false){
                count++;
                dfs(i, isConnected, visited);
            }
        }
        return count;
    }
}
