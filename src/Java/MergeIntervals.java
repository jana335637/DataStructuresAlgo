package Java;

import java.util.ArrayList;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        List<List<Integer>> in = new ArrayList<>();
        List<Integer> interval = new ArrayList<>();
        interval.add(3);
        interval.add(10);
        List<Integer> interval1 = new ArrayList<>();
        interval.add(2);
        interval.add(5);
        List<Integer> interval2 = new ArrayList<>();
        interval.add(7);
        interval.add(15);
        List<Integer> interval3 = new ArrayList<>();
        interval.add(17);
        interval.add(20);

        in.add(interval);
        in.add(interval1);
        in.add(interval2);
        in.add(interval3);
        mergeIntervals(in);
    }

   static void mergeIntervals(List<List<Integer>> in){
        //sort the input
        List<List<Integer>> res = new ArrayList<>();
        res.add(in.get(0));
        for(int i=1; i<in.size();i++){
            List<Integer> last = res.get(0);
            List<Integer> curr = in.get(i);
            if(curr.get(0) <= last.get(1)){
                last.set(1, Math.max(curr.get(1), last.get(1)));
            } else {
                res.add(curr);
            }
        }
       System.out.println(res);
    }
}
