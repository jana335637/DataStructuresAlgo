package SI;

import java.util.Scanner;

public class HallowPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases=in.nextInt();
        int[] patternSizes = new int[testCases];
        for (int i=0;i<testCases;i++){
            patternSizes[i]=in.nextInt();
        }
        int x=-1;
        while(testCases>0){
            x++;
            System.out.println("Case #"+(x+1)+":");
            printHallowPattern(patternSizes[x]);
            testCases--;
        }
    }

    private static void printHallowPattern(int patternSize) {
        printMiddleStar(patternSize);
        printFirstHalfPattern(patternSize);
        printSecondHalfPattern(patternSize);
        printMiddleStar(patternSize);
    }

    private static void printMiddleStar(int patternSize) {
        for (int i = 0; i < patternSize; i++) {
            if(i==(patternSize/2))
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    private static void printFirstHalfPattern(int patternSize) {
        int mid=patternSize/2;
        for (int i = 1; i <= mid; i++) {
            printStars(mid,i,patternSize);
            System.out.println();
        }
    }
    private static void printSecondHalfPattern(int patternSize) {
        int mid=patternSize/2;
        for (int i = mid-1; i >= 1 ; i--) {
            printStars(mid,i,patternSize);
            System.out.println();
        }
    }

    private static void printStars(int mid, int i,int patternSize) {
        for (int j = 0; j < patternSize; j++) {
            if(j==(mid-i) || j==(mid+i))
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }

}
