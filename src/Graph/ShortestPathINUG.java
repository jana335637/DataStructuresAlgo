package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathINUG {
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {

        // code here

        int[] dist = new int[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            dist[i]=(int)1e9;
        }
        dist[src]=0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(src);
        while(!queue.isEmpty()){
            Integer node = queue.poll();
            for(Integer it : adj.get(node)){
                if(dist[node]+1 < dist[it]){
                    dist[it] = dist[node]+1;
                }
                queue.offer(it);
            }
        }
        for (int i = 0; i < adj.size(); i++) {
            if(dist[i]==(int)1e9) dist[i]=-1;
        }
        return dist;
    }

}
