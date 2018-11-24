package SI.Graphs;

import javafx.util.Pair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PathInGraph {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases =in.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.println("Test Case #"+(i+1)+":");
            checkPath();
        }
    }

    private static void checkPath() {
        int n = in.nextInt(),v=in.nextInt();
        ArrayList<ArrayList<Pair<Integer,Integer>>> G = new ArrayList<ArrayList<Pair<Integer,Integer>>>();
        for (int j = 0; j <= n ; j++) {
            G.add(new ArrayList<>());
        }
        for (int i = 0; i < v; i++) {
            int node1=in.nextInt(),node2=in.nextInt();
            G.get(node1).add(new Pair<>(node2,0));
            G.get(node2).add(new Pair<>(node1,0));
        }
        int pathChecks =in.nextInt();
        for (int i = 0; i < pathChecks; i++) {
            int node1=in.nextInt(),node2=in.nextInt();
            //if(BFS(G,node1,node2))
            boolean[] vis = new boolean[G.size()];
            if(DFS(G,node1,node2,vis))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    private static boolean DFS(ArrayList<ArrayList<Pair<Integer, Integer>>> G, int s, int d, boolean[] vis) {
        if(vis[s]) return false;
        vis[s]=true;
        if(s==d) return true;
        for(Pair<Integer,Integer> newNode:G.get(s)){
            if(DFS(G,newNode.getKey(),d,vis))
                return true;
        }
        return false;
    }

    private static boolean BFS(ArrayList<ArrayList<Pair<Integer, Integer>>> G, int s, int d) {
        boolean[] vis = new boolean[G.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        vis[s]=true;
        while(!q.isEmpty()){
           int p = q.poll();
            for (Pair<Integer, Integer> p1:G.get(p)){
                int newNode = p1.getKey();
                if(!vis[newNode]) {
                    if (Integer.compare(newNode,d)==0)
                        return true;
                    q.add(newNode);
                    vis[newNode]=true;
                }
            }
        }
        return false;
    }

}
