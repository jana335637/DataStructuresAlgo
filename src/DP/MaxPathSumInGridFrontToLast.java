package DP;

public class MaxPathSumInGridFrontToLast {
    public int minFallingPathSum(int[][] matrix) {
        int n= matrix.length;
        int[] front = new int [n];
        int[] cur = new int[n];
        printArray(matrix[0]);
        for (int i = 0; i < n ; i++) {

            System.out.println("i"+i+ ": " +matrix[0][i]);
            front[i] = matrix[0][i];
        }
        printArray(front);
        for (int i = 1; i < n; i++) {
            printArray(front);
            for (int j = 0; j < n; j++) {
                if(j==0){
                    cur[j]=Math.min(front[j], front[j+1]) + matrix[i][j];
                }
                else if(j==n-1){
                    cur[j]=Math.min(front[j], front[j-1]) + matrix[i][j];
                } else {
                    cur[j] = Math.min(front[j], Math.min(front[j-1], front[j+1]) ) + matrix[i][j];
                }
            }
            printArray(cur);
            front = cur.clone();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, front[i]);
        }
        return min;
    }

    private void printArray(int[] cur) {
        for (int i = 0; i < cur.length; i++) {
            System.out.print("["+cur[i]+",");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String args[]) {
        int[][] m ={{2,1,3},{6,5,4},{7,8,9}};
        MaxPathSumInGridFrontToLast maxPathSumInGridFrontToLast = new MaxPathSumInGridFrontToLast();
        System.out.println(maxPathSumInGridFrontToLast.minFallingPathSum(m));
    }
}
