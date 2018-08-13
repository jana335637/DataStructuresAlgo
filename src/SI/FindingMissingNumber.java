package SI;

import java.util.Scanner;

public class FindingMissingNumber {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int testCases=in.nextInt();
        for (int i = 0; i < testCases ; i++) {
            System.out.println(findMissingNumber());
        }
    }

    private static int findMissingNumber() {
        int sizeOfArray = in.nextInt();
        long userXOR =0,calculatedXOR = 0;
        int[] array = new int[sizeOfArray+1];
        for (int i = 0; i < sizeOfArray ; i++) {
            array[i]=in.nextInt();
            userXOR=userXOR^array[i];
        }
        for(int i=1;i<=sizeOfArray+1;i++)
            calculatedXOR=calculatedXOR^i;
        return (int) (calculatedXOR^userXOR);
    }
}
