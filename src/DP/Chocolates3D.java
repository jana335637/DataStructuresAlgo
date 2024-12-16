package DP;

public class Chocolates3D {
    static int maximumChocolates(int n, int m, int[][] grid) {
        // Create two 2D arrays to store computed results: front and cur
        int[][] front = new int[m][m];
        int[][] cur = new int[m][m];

        // Initialize the front array with values from the last row of the grid
        for (int j1 = 0; j1 < m; j1++) {
            for (int j2 = 0; j2 < m; j2++) {
                if (j1 == j2)
                    front[j1][j2] = grid[n - 1][j1];
                else
                    front[j1][j2] = grid[n - 1][j1] + grid[n - 1][j2];
            }
        }

        //print2DArray(front);

        // Iterate through the rows in reverse order
        // Outer nested loops to traverse the DP array from the second last row to the first row
        for (int i = n - 2; i >= 0; i--) {
            //print2DArray(front);
            for (int j1 = 0; j1 < m; j1++) {
                for (int j2 = 0; j2 < m; j2++) {
                    int maxi = Integer.MIN_VALUE;

                    // Inner nested loops to try out 9 options
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int ans;

                            if (j1 == j2)
                                ans = grid[i][j1];
                            else
                                ans = grid[i][j1] + grid[i][j2];

                            // Check if the indices are valid
                            if ((j1 + di < 0 || j1 + di >= m) || (j2 + dj < 0 || j2 + dj >= m))
                                ans += (int) Math.pow(-10, 9);
                            else
                                ans += front[j1 + di][j2 + dj];

                            // Update maxi with the maximum result
                            maxi = Math.max(ans, maxi);
                        }
                    }
                    // Store the result in the cur array
                    cur[j1][j2] = maxi;
                }
            }

            // Update the front array with the values from the cur array for the next row
            for (int a = 0; a < m; a++) {
                front[a] = cur[a].clone();
            }
            //print2DArray(front);
        }

        // The final result is stored at the top left corner of the front array
        return front[0][m - 1];
    }

    private static void print2DArray(int[][] front) {
        for (int i = 0; i < front.length; i++) {
            for (int j = 0; j < front[0].length; j++) {
                System.out.print(front[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int matrix[][] = {{2, 3, 1, 2},
                {3, 4, 2, 2},
                {5, 6, 3, 5}};

        int n = matrix.length;
        int m = matrix[0].length;

        // Call the maximumChocolates function and print the result
        System.out.println(maximumChocolates(n, m, matrix));
    }
}
