package HackerEarth;

import java.util.Arrays;
import java.util.Scanner;

public class fillTheBoxes {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases>0)
        {
            int[] input = new int[3];
            for (int i = 0; i < 3; i++) {
                input[i]=scanner.nextInt();
            }
            Integer[] boxSizes = new Integer[input[0]];
            for (int i = 0; i < input[0]; i++) {
                boxSizes[i] = scanner.nextInt()+input[2];
            }

            Integer[] ballSizes = new Integer[input[1]];
            for (int i = 0; i < input[1]; i++) {
                ballSizes[i] = scanner.nextInt();
            }
            Arrays.sort(boxSizes);
            Arrays.sort(ballSizes);
            int output=0, largeNumberIndex=boxSizes.length-1;
            for (int i = ballSizes.length-1; i >=0; i--) {
                if(boxSizes[largeNumberIndex]>=ballSizes[i]){
                    output++;
                    largeNumberIndex--;
                }
            }
            System.out.println(output);
            testCases--;
        }
    }
}
