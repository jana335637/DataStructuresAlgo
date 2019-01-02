package CF;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubstringRem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        Set<Character> set = new HashSet<>();
        int[] fre = new int[26];int z=0;
        for (int i = 0; i < n; i++) {
            set.add(s.charAt(i));
            fre[s.charAt(i)-'a']++;
            if(s.charAt(i)!=s.charAt(0) && i>1 && s.charAt(i)==s.charAt(i-1)){
                z++;
            }
        }
        int x=getFirst(s,s.charAt(0)),y=getLast(s,s.charAt(n-1));
        if(set.size()>2  ){
            System.out.println(x+y+1);
            return;
        }

    }

    private static int getLast(String s,char c) {
        for (int i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i)!=c)
                return s.length()-i-1;
        }
        return 0;
    }

    private static int getFirst(String s,char c) {
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=c)
                return i;
        }
        return 0;
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
