package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindEventualSafeNodes {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adjRev = new ArrayList<>();
        if(graph.length == 0 ) new ArrayList<Integer>();
        for (int i = 0; i < graph.length; i++) {
            adjRev.add(new ArrayList<>());
        }
        int[] indegree = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                adjRev.get(graph[i][j]).add(i);
                indegree[i]++;
            }
        }
        printArray(indegree);
        System.out.println("adj: "+adjRev);
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        List<Integer> safeNodes = new ArrayList<>();

        while(!queue.isEmpty()){
            int node = queue.poll();
            safeNodes.add(node);
            for(Integer it: adjRev.get(node)){
                indegree[it]--;
                if(indegree[it]==0)
                    queue.offer(it);
            }
        }
        Collections.sort(safeNodes);
        return safeNodes;
    }
    void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FindEventualSafeNodes f = new FindEventualSafeNodes();
        f.eventualSafeNodes(new int[][]{{1,2},{2,3},{5},{0},{5},{},{}});
    }
}
