package SI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class CoffeeBreak {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedHashMap<Long,String> a = new LinkedHashMap<>();
        int n = in.nextInt(),m=in.nextInt(),d=in.nextInt();
        in.nextLine();
        int[] bMinutes =new int[n];
        HashMap<Integer,Integer> map = new HashMap();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            bMinutes[i]=in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            map.put(bMinutes[i],-1);
            set.add(bMinutes[i]);
        }
        int day=1;
        int breakM= set.first();
        while(set.size()>0){
            if(map.get(breakM)==-1){
                map.put(breakM,day);
                set.remove(breakM);
            }
            if((breakM+=d)>m)
            {
                day++;
                breakM%=m;
            }
            while(!map.keySet().contains(breakM) || map.get(breakM)!=-1 && set.size()>0) {
                ++breakM;
                if (breakM > m && set.size()>0) {
                    breakM = set.first();
                }
            }
        }
        System.out.println(day);
        for (int i = 0; i < n; i++) {
            System.out.print(map.get(bMinutes[i])+ " ");
        }
        System.out.println();
    }

}
