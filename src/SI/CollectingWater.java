package SI;

import java.util.Scanner;

public class CollectingWater {
    static Scanner in = new Scanner(System.in);
    static int ans = 0;

    public static void main(String[] args) {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            collectWater();
        }
    }
    static public  void collectWater(){
        int n = in.nextInt();
        int[] a = new int[n];
        int[] l = new int[n];
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        l[0]=a[0];
        for (int i = 1; i < n; i++) {
            l[i]=(Integer.compare(l[i-1],a[i])>=0)?l[i-1]:a[i];
        }
        r[n-1]=a[n-1];
        for (int i = n-2; i >=0 ; i--) {
            r[i]=(Integer.compare(r[i+1],a[i])>=0)?r[i+1]:a[i];
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            int x = (l[i]<=r[i])?l[i]:r[i];
            count+=(x-a[i]);
        }
        System.out.println(count);
    }
}
