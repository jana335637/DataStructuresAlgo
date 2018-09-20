package SI;

import java.util.Scanner;

/**
 * Created by pillutja on 9/6/2018.
 */
public class Equality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        in.nextLine();
        String s = in.next();
        int[] array = new int[k];
        int min = Integer.MAX_VALUE,flag=0;
        for (int i = 0; i < n; i++) {
            array[s.charAt(i) - 'A']++;
        }
        for (int i = 0; i < k; i++) {
            if(min>array[i])
                min=array[i];
            if(array[i]==0)
            {
                flag=1;
            }
        }
        if(flag==1)
            System.out.println(0);
        else
            System.out.println(min*k);
    }
}
