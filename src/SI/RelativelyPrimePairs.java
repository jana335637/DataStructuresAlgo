package SI;

import java.util.*;

public class RelativelyPrimePairs {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        long l=in.nextLong(),r=in.nextLong();
        int count=0;
        HashMap<Long,Long> map = new HashMap<>();
        for (long i = l; i <=r; i++) {
            for (long j = i; j < (2*l); j++) {
                long gcd = ((i<=j)?(gcd(i,j)):gcd(j,i));
                if(gcd(i,j)==1){
                    count++;
                    map.put(i,j);
                }
            }
        }
        String result="";
        if(count==(r-l+1)){
            System.out.println("YES");
            Set<Long> set = (map.keySet());
            Iterator iterator = set.iterator();
            System.out.println(result);
            while(iterator.hasNext())
            {
                Long n = (Long)iterator.next();
                System.out.println(n+" "+map.get(iterator.hasNext()));
            }
        }
        else
            System.out.println("NO");
    }
    private static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
