package AlgoUniversity.Matrix;

import java.util.Scanner;

public class RotateAntiClockWise {
    public static void main(String[] args) {
        int[][] matrix = {};
        matrix=takeInput();
        int n = matrix.length;
        if(n==1) {
            printMatrix(matrix);
            return;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(i, j, matrix);
            }
        }
        reverseRows(matrix);
        printMatrix(matrix);
    }

    private static void reverseRows(int[][] matrix) {
        int a=0,b=matrix.length-1;
        while(a<b){
            int[] temp=matrix[a];
            matrix[a]=matrix[b];
            matrix[b]=temp;
            a++;b--;
        }
    }

    private static void swap(int i, int j,int[][] matrix) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] takeInput() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
}
