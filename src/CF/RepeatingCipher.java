package CF;

import java.util.Scanner;

public class RepeatingCipher {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),x=1,i=0;
        String s= in.next();
        StringBuilder sb = new StringBuilder();
        while(i<n){
            sb.append(s.charAt(i));
            i+=x;
            x++;
        }
        System.out.println(sb.toString());
    }
}
