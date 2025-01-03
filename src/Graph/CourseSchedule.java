package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        boolean[] vis = new boolean[numCourses];
        boolean[] pathVis = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if(vis[i] == false && dfsCheck(i, prerequisites,vis,pathVis)){
                return false;
            }

        }
        return true;
    }

    private boolean dfsCheck(int node, int[][] prerequisites, boolean[] vis, boolean[] pathVis) {
        vis[node]=true;
        pathVis[node]=true;
        ArrayList<Integer> pre = getPre(node, prerequisites);
        for (Integer it : pre) {
            if(vis[it]==false){
                if(dfsCheck(it, prerequisites, vis, pathVis)) return true;
            } else if( pathVis[it] ){
                return true;
            }
        }
        pathVis[node]=false;
        return false;
    }
    private ArrayList<Integer> getPre(int x, int[][] prerequisites){
        ArrayList<Integer> pre = new ArrayList<>();
        for (int i = 0; i < prerequisites.length; i++) {
            if(prerequisites[i][0]==x)
                pre.add(prerequisites[i][1]);
        }
        return pre;
    }


    public void printArray(boolean[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] indegree = new int[numCourses], topo  = new int[numCourses] ;
        int index=0;
        for (int i = 0; i < adj.size(); i++) {
            for(Integer it : adj.get(i)){
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int node = q.poll();
            topo[index++]=node;
            for(Integer it: adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.offer(it);
                }
            }
        }
        if(index==numCourses) return topo;
        int[] arr={};
        return arr;
    }
}
