package Matrix;

public class SetMatrixZero {
    public static void main(String[] args) {
        
    }
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length, col0=-1;
        int columns;
        if(rows > 0){
            columns = matrix[0].length;
        } else return;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(matrix[i][j] == 0) {
                    if(j==0) col0 = 0;
                    if(i==0) matrix[0][0] =0;
                    if(i != 0 && j!= 0){
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                    }

                }
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                if(matrix[0][j] == 0 || matrix[i][0] == 0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0] == 0){
            for (int i = 0; i < columns; i++) {
                matrix[0][i] = 0;
            }
        }
        if(col0 == 0){
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
