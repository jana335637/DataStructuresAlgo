package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FractionalKnapsack {
    public static void main(String[] args) {
        FractionalKnapsack f = new FractionalKnapsack();
        List<Integer> val = new ArrayList<>();
        val.add(10);
        val.add(10);
        val.add(10);
        List<Integer> wt = new ArrayList<>();
        wt.add(30);
        wt.add(20);
        wt.add(20);
        f.fractionalKnapsack(val, wt, 1);
    }
    double fractionalKnapsack(List<Integer> val, List<Integer> wt, int capacity) {
        int n = wt.size();
        // code here
        List<Knapsack> knapsacks = new ArrayList<>();
        for (int i = 0; i < val.size(); i++) {
            knapsacks.add(new Knapsack(val.get(i), wt.get(i)));
        }
        Collections.sort(knapsacks, new KnapsackComparator());
        double ans = 0 ;
        for (int i = 0; i < n && capacity>0; i++) {
            if(knapsacks.get(i).wt <= capacity){
                capacity -= knapsacks.get(i).wt;
                ans += knapsacks.get(i).val;
            } else{
                ans += (knapsacks.get(i).val/knapsacks.get(i).wt)*capacity;
                capacity =0;
                break;
            }
        }
        return ans;
    }


}
class Knapsack {
    int val;
    int wt;

    Knapsack(int val, int wt) {
        this.val = val;
        this.wt = wt;

    }
}
class KnapsackComparator implements Comparator<Knapsack> {

    @Override
    public int compare(Knapsack k1, Knapsack k2) {
        return k2.val/k2.wt - k1.val/k1.wt;
    }
}