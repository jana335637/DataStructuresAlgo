package SI.Graphs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LongestPathInGraph {}/*{

    static Scanner in = new Scanner(System.in);
    static int longestPathLength = 0;

    public static void main(String[] args) throws IOException {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            findLongestPath();
        }
    }

    private static void findLongestPath() {
        int n = in.nextInt(), v = in.nextInt();
        ArrayList<ArrayList<Pair<Integer, Integer>>> G = new ArrayList<ArrayList<Pair<Integer, Integer>>>();
        for (int j = 0; j <= n; j++) {
            G.add(new ArrayList<>());
        }
        for (int i = 0; i < v; i++) {
            int node1 = in.nextInt(), node2 = in.nextInt();
            G.get(node1).add(new Pair<>(node2, 0));
            G.get(node2).add(new Pair<>(node1, 0));
        }
        longestPathLength = 0;
        int lastNode = (int) BFS(G, 1).getKey();
        longestPathLength = 0;
        System.out.println(BFS(G, lastNode).getValue());
    }

    private static Pair BFS(ArrayList<ArrayList<Pair<Integer, Integer>>> G, int s) {
        boolean[] vis = new boolean[G.size()];
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new LinkedList<>();
        int newNode = 0, pl = 0;
        q.add(s);
        q1.add(pl);
        vis[s] = true;
        Pair<Integer, Integer> p2 = new Pair<>(0, 0);
        int x = 1;
        while (!q.isEmpty()) {
            int p = q.poll();
            pl = q1.poll();
            for (Pair<Integer, Integer> p1 : G.get(p)) {
                newNode = p1.getKey();
                if (!vis[newNode]) {
                    p1 = new Pair<>(p1.getKey(), p2.getValue() + 1);
                    q.add(newNode);
                    q1.add(pl+1);
                    vis[newNode] = true;
                }
            }
        }
        return new Pair(newNode, pl+1);
    }
}*/
