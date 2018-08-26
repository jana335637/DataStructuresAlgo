package SI;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by pillutja on 8/25/2018.
 */
public class TowersOfHanoiEasy {
    static Scanner in = new Scanner(System.in);
    static ArrayList<String> moves;
    static int movesCount;
    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int noOfHanoi = in.nextInt();
            moves = new ArrayList<>();
            movesCount=0;
            towerofHanoi(noOfHanoi,"A","C","B");
            System.out.println(movesCount);
            for (String move :
                    moves) {
                System.out.println(move);
            }
        }
    }

    private static void towerofHanoi(int n,String src,String dest,String temp) {
        if(n==0)
            return;
        towerofHanoi(n-1,src,temp,dest);
        moves.add("Move "+n+" from "+src+" to "+dest);
        movesCount++;
        towerofHanoi(n-1,temp,dest,src);
    }
}

