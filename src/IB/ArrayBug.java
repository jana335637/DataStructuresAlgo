package IB;

import java.util.ArrayList;

/**
 * Created by pillutja on 8/17/2018.
 */
public class ArrayBug {
    public static void main(String[] args) {
        /*int[] test = [44, 41, 12, 42, 71, 45, 28, 65, 75, 93, 66, 66, 37, 6, 24, 59];*/
    }
    public ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        B = B%A.size();
        for (int i = 0; i < A.size() - B; i++) {
            ret.add(A.get(i + B));
        }
        for (int i = 0; i < B; i++) {
            ret.add(A.get(i));
        }

        return ret;
    }
}
