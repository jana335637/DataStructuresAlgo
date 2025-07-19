package AlgoUniversity;

public class SnakePatternInMatrix {
    public static void main(String[] args) {

    }
    void printSnakePattern(int[][] m){
        if(m.length == 0) return;
        for (int i = 0; i < m.length; i++) {
            if(i%2==0){
                for (int j = 0; j < m[0].length; j++) {
                    System.out.print(m[i][j]+" ");
                }
            } else {
                for (int j = m[0].length-1; j >=0 ; j--) {
                    System.out.print(m[i][j]+" ");
                }
            }
        }
    }
    void printBoundary(int[][] m){
        if(m.length == 0) return;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                if(i==0 || j==0 || i==m.length-1 || j==m[0].length-1)
                    System.out.print(m[i][j]+" ");
            }
        }
    }
    void spiralMatrix(int[][] m){
        int tr=0, br=m.length-1, lc=0, rc=m[0].length-1;
        if(m.length == 0) return;


    }
    void lastBoundary(int[][] m, int tr, int br, int lc, int rc){
        for (int i = tr; i <= br; i++) {
            for (int j = lc; j <= rc; j++) {

            }

        }
    }
}
