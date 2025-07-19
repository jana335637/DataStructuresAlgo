package AlgoUniversity.Matrix;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TableLookup {
    static int keyToLookup;
    public static void main(String[] args) throws IOException {
        int[][] matrix = {};
        matrix=takeInput();
        lookupTable(matrix, keyToLookup);

    }

    private static void lookupTable(int[][] matrix, int keyToLookup) {
        for (int i = 0; i < matrix.length; i++) {
            if(binarySearchKey(matrix[i], keyToLookup)){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    private static boolean binarySearchKey(int[] array, int keyToLookup) {
        int low=0, high=array.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(array[mid]==keyToLookup){
                return true;
            } else if(array[mid]<keyToLookup){
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return false;
    }

    private static int[][] takeInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        keyToLookup = Integer.parseInt(st.nextToken());
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return matrix;
    }
}
