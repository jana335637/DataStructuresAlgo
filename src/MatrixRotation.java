public class MatrixRotation {
    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        int count=1;
        for(int j=0;j<4;j++){
            for (int i = 0; i <4 ; i++) {
                matrix[j][i]=count++;
            }
        }
        System.out.println(matrix.length);
        int n=matrix.length;
        printMatrix(matrix);
        System.out.println();
        for (int layer = 0; layer < n/2; layer++) {
            int first=layer;
            int last=n-1-layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i];
                System.out.println("Top::::::::::::"+top+"Offset::::::"+offset);
/*              90 degrees rotation
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
*/
                //180 degrees rotation

                matrix[first][i] = matrix[last][last-offset];
                matrix[last][last-offset] = top;

                int bottomLeft = matrix[last-offset][first];
                matrix[last-offset][first] =  matrix[i][last];
                matrix[i][last] = bottomLeft;

                System.out.println("In loop:");
                printMatrix(matrix);
                System.out.println();
            }
            printMatrix(matrix);
            System.out.println();
        }
    }
    static void printMatrix(int[][] matrix){
        for(int j=0;j<4;j++){
            for (int i = 0; i <4 ; i++) {
                System.out.print(matrix[j][i]+ "   ");
            }
            System.out.println();
        }
    }

}
