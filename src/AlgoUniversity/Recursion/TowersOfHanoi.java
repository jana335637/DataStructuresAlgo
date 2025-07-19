package AlgoUniversity.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class TowersOfHanoi {
    static int n, noOfMoves ;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static List<List<Integer>> moves = new ArrayList<List<Integer>>();

    public static void main(String[] args) throws IOException {
        takeInput();
        TOH(n,1,2,3);
        System.out.println(noOfMoves);
        for(List list: moves){
            for(Object x : list){
                System.out.print(x);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void TOH(int n,int s, int t, int x) {
        if(n==1){
            moves.add(Arrays.asList(1, s, t));
            noOfMoves++;
            return;
        }
        TOH(n-1, s, x, t);
        moves.add(Arrays.asList(n, s, t));
        noOfMoves++;
        TOH(n-1, x, t, s);
    }

    public static void takeInput() throws IOException {
        st = new StringTokenizer(reader.readLine());
        n = Integer.parseInt(st.nextToken());
    }
}
