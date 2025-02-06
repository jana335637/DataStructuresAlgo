package AUDevDay;

import java.util.Scanner;

public class D0_NiceGrid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int r = Integer.parseInt(s.split(" ")[0]);
        int c = Integer.parseInt(s.split(" ")[1]);
        int[][] grid = new int[15][15];
        int current = 1;
        grid[7][7]=current; int m=7, n=7;
        while(m >=1 && n<=13){
            current = current*-1;
            fill(--m, ++n, current, grid);
        }
        if(grid[r-1][c-1]==1)
            System.out.println("white");
        else
            System.out.println("black");
    }

    private static void fill(int m, int n,int c,int[][] grid) {
        System.out.println("" + m + " " + n + " " + c);
        for (int i = m; i <= n; i++) {
            for (int j = m; j <= n; j++) {
                if (grid[i][j] == 0) {
                    grid[i][j] = c;
                }
            }
        }
    }
}
