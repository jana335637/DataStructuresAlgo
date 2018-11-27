package SI.Graphs;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfIslands {

    static Scanner in = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int testCases =Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            printNumberOfIslands();
        }
    }

    private static void printNumberOfIslands() throws IOException {
        String mn = br.readLine();
        int m = Integer.parseInt(mn.split(" ")[0]),n=Integer.parseInt(mn.split(" ")[1]);
        int[][] mat = new int[m][n];
        int c=0;
        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            for (int j = 0; j < n; j++) {
                mat[i][j]=Integer.parseInt(input.charAt(j)+"");
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j]==1){
                    c++;
                    DFS(i,j,m,n,mat);
                }
            }
        }
        System.out.println(c);
    }

    private static void DFS(int i,int j,int m,int n, int[][] mat) {
        if( i<0 || i >= m || j<0 || j>=n || mat[i][j]==0)
            return;
        mat[i][j]=0;
        DFS(i-1,j,m,n,mat);
        DFS(i-1,j+1,m,n,mat);
        DFS(i,j+1,m,n,mat);
        DFS(i+1,j+1,m,n,mat);
        DFS(i+1,j,m,n,mat);
        DFS(i+1,j-1,m,n,mat);
        DFS(i,j-1,m,n,mat);
        DFS(i-1,j-1,m,n,mat);
    }
}
