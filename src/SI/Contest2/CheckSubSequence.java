package SI.Contest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by pillutja on 8/26/2018.
 */
public class CheckSubSequence {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            System.out.println(checkSS());
        }
    }
    static String checkSS() throws Exception {
        String s = br.readLine();
        String a = s.split(" ")[0], b = s.split(" ")[1];
        if(a.length()==1)
            return (b.contains(a))?"Yes":"No";
        if(a.length()>b.length())
            return "No";
        ArrayList<ArrayList<Integer>> indices = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            ArrayList<Integer> charIndices = new ArrayList<>();
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j))
                    charIndices.add(j);
            }
            indices.add(charIndices);
        }
        int count = 0;
        for (int i = 0; i < indices.size() - 1; i++) {
            ArrayList<Integer> x = indices.get(i);
            ArrayList<Integer> y = indices.get(i + 1);
            for (int num : x) {
                if (count == (i + 1))
                    break;
                for (int n1 : y) {
                    if (num < n1) {
                        count++;
                        break;
                    }
                }
            }
            if (count != (i + 1))
                return "No";
        }
        if(count==0)
            return "No";
        return "Yes";
    }
}
