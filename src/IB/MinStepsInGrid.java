package IB;

import java.util.ArrayList;

/**
 * Created by pillutja on 8/17/2018.
 */
public class MinStepsInGrid {
    public static void main(String[] args) {
        /*int[] test = [44, 41, 12, 42, 71, 45, 28, 65, 75, 93, 66, 66, 37, 6, 24, 59];*/

    }
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int steps=0;
        for (int i = 0; i < A.size()-1; i++) {
            int x = A.get(i) - A.get(i+1);
            int y = B.get(i) - B.get(i+1);
            x=(x<0)?(x*-1):x;
            y=(y<0)?(y*-1):y;
            steps+= ((x>y)?x:y);
        }
        return steps;
    }
}
