import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class MaximumTipCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Total Orders:");
        int totalOrders = in.nextInt();
        System.out.println("X Orders:");
        int x = in.nextInt();
        System.out.println("Y Orders:");
        int y = in.nextInt();
        int totalTips=0;
        TreeSet<Tip> tips = new TreeSet<>();
        for (int i = 0; i < totalOrders ; i++) {
            Tip tip = new Tip();
            System.out.println("Ai:");
            tip.a = in.nextInt();
            System.out.println("Bi:");
            tip.b = in.nextInt();
            tip.diff = tip.a - tip.b;
            tips.add(tip);
        }
        Iterator iterator = tips.iterator();
        while(iterator.hasNext())
        {
            Tip tip = (Tip) iterator.next();
            System.out.println("A:"+tip.a+" B:"+tip.b+" Diff:"+tip.diff);
        }
/*
        while(x>0 && y>0 && current<totalOrders){
            if(tips.)
            current++;
        }
*/

    }
}

class Tip implements Comparable{
    int a;
    int b;
    int diff;


    @Override
    public int compareTo(Object o) {
        Tip tip = (Tip)o;
        return Integer.compare((tip.diff<0)?tip.diff*-1:tip.diff,(this.diff<0)?this.diff*-1:this.diff);
    }
}
