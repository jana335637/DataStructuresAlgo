package CF;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class ArrayStabilization {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),j=0;
        int[] a = new int[n];
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(in.nextInt());
        }
/*
        Arrays.sort(a);
        for (int i = 0; i < n-1; i++) {
            if(a[i]!=a[i+1])
                a[j++]=a[i];
        }
        a[j]=a[n-1];
        if(j==1){
            System.out.println(0);
            return;
        }
*/
        if(set.size()==2){
            System.out.println(0);
            return;
        }
        int max = set.last(),min=set.first();
        int ans = max-min;
        set.remove(max);
        if((set.last()-min) < ans)
            ans = (set.last()-min);
        set.add(max); set.remove(min);

        if((max-set.first()) < ans)
            ans = (max-set.first());

        System.out.println(ans);
    }
}
