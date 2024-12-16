package Binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class bincatmod {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter no of cases");
        int testCases = scanner.nextInt();
        //System.out.println("Enter :");
        BufferedReader bi = new BufferedReader(
                new InputStreamReader(System.in));

        // Custom integer array of size 10
        int num[] = new int[testCases];
        // Array of string type to store input
        String[] inputArray;
        // Reading input a string
        inputArray = bi.readLine().split(" ");
        int index=0;
        while(index < testCases){
            printBinCatMod(Long.parseLong(inputArray[index]));
            index++;
        }
/*        System.out.println();
        String binaryNumber= "11011100101110111";
        StringBuffer sbr = new StringBuffer(binaryNumber);

        // Reverse String
        sbr.reverse();
        binaryNumber = sbr.toString();
        binaryNumber="11011100101110111";
        System.out.println(binaryNumber);
        long decimalNumber = 1;
        for (int i = 0; i < binaryNumber.length() - 1; i++) {
            decimalNumber = decimalNumber * 10 + Character.getNumericValue(binaryNumber.charAt(i + 1));
        }
        System.out.println(decimalNumber%998244353);*/
        //System.out.println(Math.pow(10,16)%998244353);
    }

    private static void printBinCatMod(long l) {
        String binaryNumber = "";
        for (long i = 1; i <= l; i++) {
            binaryNumber+=binaryRep(i);
        }
        //System.out.println(binaryNumber);
        long decimalNumber = 1;
        for (int i = 0; i < binaryNumber.length() - 1; i++) {
            decimalNumber = decimalNumber * 10 + Character.getNumericValue(binaryNumber.charAt(i + 1));
        }
        System.out.println(decimalNumber%998244353);
    }

    private static String binaryRep(long i) {
        long remainder, quotient = i;
        Integer.parseInt("1111",2);
        String binaryNum = "";
        while (quotient > 0) {
            remainder = quotient % 2;
            binaryNum
                    = Long.toString(remainder) + binaryNum;
            quotient = quotient / 2;
        }
        return binaryNum;
    }
}
