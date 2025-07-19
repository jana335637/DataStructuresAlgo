package AlgoUniversity.Matrix;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {};
        matrix=takeInput();
        printSpiralPattern(matrix);
    }

    private static void printSpiralPattern(int[][] matrix) {

        int n=matrix.length, m=matrix[0].length;
        if(n==1 || m==1){
            printMatrix(matrix);
            return;
        }
        int s=0, end = n-1, l=0, r=m-1;
        while(end>s && r>l) {
            printOuter(s, end, l, r, matrix);

            s++;end--;
            l++;r--;
        }

    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    private static void printOuter(int s, int end, int l, int r, int[][] matrix) {
        for (int i = l; i <= r; i++) {
            System.out.print(matrix[s][i]+" ");
        }
        for (int i = s+1; i <= end ; i++) {
            System.out.print(matrix[i][r]+" ");
        }

        for (int i = r-1; i >=l ; i--) {
            System.out.print(matrix[end][i]+" ");
        }
        for (int i = end-1; i > s ; i--) {
            System.out.print(matrix[i][l]+" ");
        }
    }


    private static int[][] takeInput() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m=input.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
}
