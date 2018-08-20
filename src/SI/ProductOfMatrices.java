package SI;

import java.util.Scanner;

/**
 * Created by pillutja on 8/16/2018.
 */
public class ProductOfMatrices {
    static  Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases=in.nextInt();
        for (int i=0;i<testCases;i++){
            productOfMatrices();
        }
    }

    private static void productOfMatrices() {
        int M1 = Integer.parseInt(in.next());
        int M2 = Integer.parseInt(in.next());
        int[][] matrix1 = new int[M1][M2];
        for (int i = 0; i < M1; i++) {
            for (int j = 0; j < M2; j++) {
                matrix1[i][j] =Integer.parseInt(in.next());
            }
        }
        int N1 = Integer.parseInt(in.next());
        int N2 = Integer.parseInt(in.next());
        int[][] matrix2 = new int[N1][N2];
        for (int i = 0; i < M1; i++) {
            for (int j = 0; j < N2; j++) {
                matrix2[i][j] =Integer.parseInt(in.next());
            }
        }
        for (int i = 0; i < M2; i++) {
            for (int j = 0; j < N2; j++) {
                int sum = 0;
                for (int k = 0; k < N1; k++) {
                    sum+=matrix1[i][k]*matrix2[k][j];
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
