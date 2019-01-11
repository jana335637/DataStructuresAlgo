package CF;

import java.util.Scanner;

public class Snowball {
    public static void main(String[] args) {
        /*System.out.println(getWeight());*/
        System.out.println(Math.ceil(Math.sqrt(35)));
    }

    private static int getWeight() {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt(),h=in.nextInt(),w1 = in.nextInt(),h1=in.nextInt(),w2 = in.nextInt(),h2=in.nextInt();
        for (int i = 0; i < h; i++) {
            w+=(h-i);
            if(h-i == h1)
                w-=w1;
            if(h-i == h2)
                w-=w2;
            if(w<0)
                w=0;
        }
        return w;
    }
}
