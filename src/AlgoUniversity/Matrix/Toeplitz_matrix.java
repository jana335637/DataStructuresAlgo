package AlgoUniversity.Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class Toeplitz_matrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        if(n==1 || m==1) {
            System.out.println(1);
            return;
        }
        int i=0, j=0;
        for (; j < m - 1; j++) {
            if(!isDiagonalValuesEqual(i,j,matrix)){
                System.out.println(0);
                return;
            }
        }
        i=1;
        j=0;
        for ( ; i < n-1; i++) {
            if(!isDiagonalValuesEqual(i,j,matrix)){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
    public static boolean isDiagonalValuesEqual(int i, int j, int[][] matrix) {
        int n=matrix.length, m=matrix[0].length;
        int k= matrix[i][j];
        while(i<n && j<n){
            if(k!=matrix[i][j]){
                return false;
            }
            i++;j++;
        }
        return true;
    }
    public boolean AreDiagonalValuesEqual(int i, int j, int[][] matrix) {
        int n=matrix.length, m=matrix[0].length;
        int k= matrix[i][j];
        while(i<n && j<m){
            if(k!=matrix[i][j]){
                return false;
            }
            i++;j++;
        }
        return true;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        if(n==1 || m==1) {
            System.out.println(1);
            return true;
        }
        int i=0, j=0;
        for (; j < m - 1; j++) {
            if(!AreDiagonalValuesEqual(i,j,matrix)){
                System.out.println(0);
                return false;
            }
        }
        i=1;
        j=0;
        for ( ; i < n-1; i++) {
            if(!AreDiagonalValuesEqual(i,j,matrix)){
                System.out.println(0);
                return false;
            }
        }
        System.out.println(1);
        return true;
    }
}
