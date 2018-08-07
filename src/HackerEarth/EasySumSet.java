package HackerEarth;

import java.util.Scanner;

public class EasySumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aSize = scanner.nextInt();
        int[] arrayA = new int[aSize];
        for (int i = 0; i < aSize; i++) {
            arrayA[i]=scanner.nextInt();
        }
        int cSize = scanner.nextInt();
        int[] arrayC = new int[aSize];
        for (int i = 0; i < cSize; i++) {
            arrayC[i]=scanner.nextInt();
        }
    }
}
