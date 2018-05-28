package HackerEarth;

import java.util.Scanner;


class SumOfDigitsInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        int[] sums = new int[testCases];
        for (int j = 0; j < testCases; j++) {
            int sum = 0;
            String s = in.next();
            for (int i = 0; i < s.length(); i++) {
                if (s.substring(i, i + 1).equals("0") || s.substring(i, i + 1).equals("1") || s.substring(i, i + 1).equals("2")|| s.substring(i, i + 1).equals("3")|| s.substring(i, i + 1).equals("4")
                        || s.substring(i, i + 1).equals("5")|| s.substring(i, i + 1).equals("6")|| s.substring(i, i + 1).equals("7")|| s.substring(i, i + 1).equals("8")|| s.substring(i, i + 1).equals("9") ){
                    sum += Integer.parseInt(s.substring(i, i + 1));
                }
            }
            sums[j] = sum;
        }
        for (int i = 0; i <testCases ; i++) {
            System.out.println(sums[i]);
        }

    }
}
