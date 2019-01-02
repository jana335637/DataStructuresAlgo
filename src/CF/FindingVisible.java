package CF;

import java.util.Scanner;

public class FindingVisible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x= in.nextInt(),y=in.nextInt();
            findVis(x,y);
        }
    }

    private static void findVis(int x, int y) {
        if (x == 1 || x == y || y % x == 0) {
            System.out.println(x + " " + y);
            return;
        }
        int q = y / x;
        System.out.println(x + " " + ((x * q)));
    }
}
