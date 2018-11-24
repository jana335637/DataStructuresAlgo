package SI.Graphs;

import javafx.util.Pair;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NumberOfConnectedComponents {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases =in.nextInt();
        for (int i = 0; i < testCases; i++) {
            printNoOfConnectedComponents();
        }
    }

    private static void printNoOfConnectedComponents() {
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
        int cc=0;
        boolean[] vis = new boolean[G.size()];
        for (int i = 1; i <= n ; i++) {
            if(!vis[i])
                cc++;
            DFS(G,i,vis);
        }
        System.out.println(cc);
    }

    private static void DFS(ArrayList<ArrayList<Pair<Integer, Integer>>> G, int s, boolean[] vis) {
        if(vis[s]) return ;
        vis[s]=true;
        for(Pair<Integer,Integer> newNode:G.get(s)){
            DFS(G,newNode.getKey(),vis);
        }
    }
}
