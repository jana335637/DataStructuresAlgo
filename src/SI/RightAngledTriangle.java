package SI;

import java.util.Scanner;

public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases=in.nextInt();
        int[] triangleSizes = new int[testCases];
        for (int i=0;i<testCases;i++){
            triangleSizes[i]=in.nextInt();
        }
        int x=-1;
        while(testCases>0){
            x++;
            System.out.println("Case #"+(x+1)+":");
            printRightAngledTriangle(triangleSizes[x]);
            testCases--;
        }
    }

    private static void printRightAngledTriangle(int size) {
        for (int i = 1; i <= size ; i++) {
            printSpaces(size-i);
            printStars(i);
            System.out.println();
        }
    }

    private static void printStars(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
    }

    private static void printSpaces(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
    }
}
