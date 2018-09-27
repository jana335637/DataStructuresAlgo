package SI.StacksQueues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class KillingDragons {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        String s =br.readLine();
        int n = Integer.parseInt(s);
        for (int i = 0; i < n; i++) {
            System.out.println(killDragons());
        }
    }
    static int killDragons() throws Exception{
        String s =br.readLine();
        int n = Integer.parseInt(s),aSum=0,bSum=0;
        s=br.readLine();
        int[] a = new int[n];
        String[] numbers = s.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            a[i]=Integer.parseInt(numbers[i]);
            aSum+=a[i];
        }
        int[] b = new int[n];
        s=br.readLine();
        numbers = s.split(" ");
        for (int i = 0; i < numbers.length; i++) {
            b[i]=Integer.parseInt(numbers[i]);
            bSum+=b[i];
        }
        if(aSum>bSum)
            return -1;
        TreeSet<Integer> ans = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            if(a[i]<=b[i]){
                ans.add(i);
            }
        }
        if(ans.size()==0)
            return -1;
        Iterator iterator = ans.iterator();
        int totalPower = 0,powerIndex=-1;
        while (iterator.hasNext()){
            powerIndex = (int) iterator.next();
            boolean flag=true;
            totalPower=0;
            for (int i = 0; i < n; i++) {
                int index = (powerIndex+i)%n;
                totalPower += (b[index]);
                if(totalPower<a[index]){
                    flag=false;
                    powerIndex=-1;
                    break;
                }
                totalPower -= a[index];
            }
            if(flag==true){
                break;
            }
        }
        if(powerIndex==-1)
            return powerIndex;
        return powerIndex+1;
    }
}
