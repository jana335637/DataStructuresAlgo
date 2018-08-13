package HackerEarth;

import java.util.Scanner;

public class BirthdayCandles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noOfCandles = in.nextInt();
        int blowOut = 0,maxHeight=-1;
        for (int i = 0; i < noOfCandles; i++) {
            int height = in.nextInt();
            if(height==maxHeight)
                blowOut++;
            if(height>maxHeight)
                maxHeight=height;
        }
        System.out.println(++blowOut);
    }
}
