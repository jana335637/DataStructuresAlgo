package SI;

import java.util.Scanner;

public class BinaryRepresentation{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases=in.nextInt();
        for (int i = 0; i < testCases ; i++) {
            int number = in.nextInt();
            if(number==0)
                System.out.print("0");
            else
                printBinaryForm(number);
            System.out.println();
        }
    }

    private static void printBinaryForm(int number) {
        int[] binaryArray = new int[32];
        int index=0;
        while(number>0){
            binaryArray[index]=number%2;
            number/=2;
            index++;
        }
        index--;
        while(index>=0){
            System.out.print(binaryArray[index]);
            index--;
        }
    }
}
