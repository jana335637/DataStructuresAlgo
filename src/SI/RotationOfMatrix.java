package SI;

import java.util.Scanner;

/**
 * Created by pillutja on 8/16/2018.
 */
public class RotationOfMatrix {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.println("Test Case #"+(i+1)+":");
            rotateMatrix();
        }
    }

    private static void rotateMatrix() {
        int size = in.nextInt();
        int[][] m = new int[size][size];
        int[][] n = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                m[i][j]=in.nextInt();
            }
        }
        int k=size-1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                n[j][k] = m[i][j];
            }
            k--;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
}
