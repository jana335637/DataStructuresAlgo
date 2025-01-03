package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class ShortestPathInDAG {
    public int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            ArrayList<Pair> tmp = new ArrayList<>();
            adj.add(tmp);
        }
        for (int i = 0; i < E; i++) {
            int[] edge = edges[i];
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            adj.get(u).add(new Pair(v,wt));
        }
        int[] vis= new int[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if(vis[i]==0) topoSort(adj, i,vis, st);
        }
        int[] dist = new int[V];
        dist[0]=0;
        for (int i = 0; i < V; i++) {
            dist[i] = (int)1e9;
        }
        while(!st.empty()){
            int node= st.pop();
            for (int i = 0; i < adj.get(node).size(); i++) {
                int v=adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;
                if(dist[node]+wt < dist[v]){
                    dist[v] = dist[node]+wt;
                }
            }
        }
        for (int i = 0; i < V; i++) {
            if(dist[i]==1e9) dist[i]=-1;
        }
        return dist;

    }

    private void topoSort(ArrayList<ArrayList<Pair>> adj, int node, int[] vis, Stack<Integer> st) {
        vis[node] = 1;
        for (int i = 0; i < adj.get(node).size(); i++) {
            int it = adj.get(node).get(i).first;
            if(vis[it]==0)
                topoSort(adj, it, vis, st);
        }
        st.push(node);
    }
}
class Pair{
    int first, second;
    public Pair(int first, int second){
        this.first = first;
        this.second =second;
    }
    int getFirst(){
        return first;
    }
    int getSecond(){
        return second;
    }
}
