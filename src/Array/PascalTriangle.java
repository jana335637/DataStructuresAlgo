package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            result.add(generateRow(i));
        }
        return result;
    }

    private List<Integer> generateRow(int row) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        long ans=1;
        for (int col = 1; col < row; col++) {
            ans = ans * (row-col);
            ans = ans/  col;
        }
        return result;
    }
}
