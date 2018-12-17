package SI.Graphs;

import javafx.util.Pair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItAForest {
    static int n = 0, e = 0;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            isForest();
        }
    }

    private static void isForest() {
        int n = in.nextInt(), v = in.nextInt(),cc=0;
        boolean acyclic = true;
        ArrayList<ArrayList<Pair<Integer, Integer>>> G = new ArrayList<ArrayList<Pair<Integer, Integer>>>();
        for (int j = 0; j <= n; j++) {
            G.add(new ArrayList<>());
        }
        for (int i = 0; i < v; i++) {
            int node1 = in.nextInt(), node2 = in.nextInt();
            G.get(node1).add(new Pair<>(node2, 0));
            G.get(node2).add(new Pair<>(node1, 0));
        }
        boolean[] vis = new boolean[G.size()];
        for (int i = 1; i <= n; i++) {
            if (!vis[i]) {
                cc++;
                if(DFS(G, i, vis,-1))
                    acyclic=false;
            }
        }
        if(cc>1 && acyclic)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean DFS(ArrayList<ArrayList<Pair<Integer, Integer>>> G, int s, boolean[] vis,int parent) {
        vis[s] = true;
        for (Pair<Integer, Integer> newNode : G.get(s)) {
            if(!vis[newNode.getKey()])
                return DFS(G, newNode.getKey(), vis,s);
            if(newNode.getKey()!=parent)
                return true;
        }
        return false;
    }
}
