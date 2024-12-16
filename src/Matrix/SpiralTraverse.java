package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {
    public static void main(String[] args) {
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length;
        List<Integer> res = new ArrayList<>();
        int columns=0;
        if(rows > 0 ) columns = matrix[0].length;
        else {
            return res;
        }

        int top=0, right=columns-1, bottom = rows-1, left = 0;
        while(top<=bottom && left <= right){
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom ; i++) {
                res.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}
