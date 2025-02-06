package Graph;

import java.util.*;

public class ZeroOneMatri {

    public static void main(String[] args) {
        List<String> tenantIds =new ArrayList<>();
        tenantIds.add("1");
        tenantIds.add("2");
        String url = "?tenantIds=" + tenantIds +"&busId=" + "9";
        System.out.println(url + "?busId=" + "9");

    }

    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] vis = new int[m][n];
        int[][] dist = new int[m][n];
        Queue<Node> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(isWater[i][j]==1){
                    vis[i][j]=1;
                    queue.add(new Node(i,j,0));
                } else {
                    vis[i][j]=0;
                }
            }
        }
        int delRow[] = {0,0,1,-1};
        int delCol[] = {1,-1,0,0};
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int row = node.first, col = node.second, steps = node.third;
            dist[row][col] = steps;
            for (int i = 0; i < 4; i++) {
                int newRow = row + delRow[i], newCol = col + delCol[i];
                if(newRow>=0 && newRow <m && newCol>=0 && newCol < n && vis[newRow][newCol]==0){
                    vis[newRow][newCol]=1;
                    queue.add(new Node(newRow,newCol,steps+1));
                }
            }
        }
        return dist;
    }
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] vis = new int[m][n];
        int[][] dist = new int[m][n];
        Queue<Node> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j]==0){
                    vis[i][j]=1;
                    queue.add(new Node(i,j,0));
                } else {
                    vis[i][j]=0;
                }
            }
        }
        int delRow[] = {0,0,1,-1};
        int delCol[] = {1,-1,0,0};
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int row = node.first, col = node.second, steps = node.third;
            dist[row][col] = steps;
            for (int i = 0; i < 4; i++) {
                int newRow = row + delRow[i], newCol = col + delCol[i];
                if(newRow>=0 && newRow <m && newCol>=0 && newCol < n && vis[newRow][newCol]==0){
                    vis[newRow][newCol]=1;
                    queue.add(new Node(newRow,newCol,steps+1));
                }
            }
        }
        return dist;
    }

}
class Node{
    int first, second, third;
    Node(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
}