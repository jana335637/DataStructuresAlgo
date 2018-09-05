package SI;

import java.util.Scanner;

public class Skewers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int fw = (n%(2*k+1))-k,count=0,i=0;
        double loopSize = Math.ceil(n/((2*k+1)*1.0));
        System.out.println((int)loopSize);
        if(fw<=0)
        {
            fw=1;
        }
        System.out.print(fw+" ");
        for (int j = 0; i < loopSize - 1; i++) {
            fw+=(2*k+1);
            System.out.print(fw+" ");
        }
    }
}
