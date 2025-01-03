package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int eColor = image[sr][sc];
        int rows= image.length;
        if(rows==0) return image;
        int cols = image[0].length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{sr,sc});
        int[] dx={0,0,1,-1}, dy={1,-1,0,0};
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int x= point[0]+dx[j];
                    int y=point[1]+dy[j];
                    if(x<0 || y<0 || x>= rows || y>= cols || image[x][y]!=eColor)
                        continue;
                    image[x][y]=color;
                    queue.offer(new int[]{x,y});
                }
            }
        }
        return image;
    }
}
