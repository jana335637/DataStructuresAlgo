package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public int orangesRotting(int[][] grid) {
        int rows= grid.length;
        if(rows==0) return 0;
        int cols = grid[0].length;
        int total_oranges=0;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
                if(grid[i][j]!=0){
                    total_oranges++;
                }
            }
        }
        if(total_oranges ==0) return 0;
        int cnt=0, countMin=0;
        int[] dx={0,0,1,-1}, dy={1,-1,0,0};
        while(!queue.isEmpty()){
            int size = queue.size();
            cnt+=size;
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int x= point[0]+dx[i];
                    int y=point[1]+dy[i];
                    if(x<0 || y<0 || x>= rows || y>= cols || grid[x][y]==0 || grid[x][y]==2)
                        continue;
                    grid[x][y]=2;
                    queue.offer(new int[]{x,y});
                }
            }
            if(queue.size() > 0) countMin++;
        }
        return (cnt == total_oranges) ? countMin : -1;
    }
}
