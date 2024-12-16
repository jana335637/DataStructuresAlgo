package Matrix;

public class RotateBy90 {
    public static void main(String[] args) {

    }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        int rows=matrix.length;
        int columns=0;
        if(rows > 0 ) columns = matrix[0].length;
        else return;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns/2; j++) {
                int x = matrix[i][j];
                matrix[i][j]=matrix[i][columns-1-j];
                matrix[i][columns-1-j]=x;
            }
        }
    }

    private void transpose(int[][] matrix) {
        int rows=matrix.length;
        int columns=0;
        if(rows > 0 ) columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int x = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=x;
            }
        }
    }
}
