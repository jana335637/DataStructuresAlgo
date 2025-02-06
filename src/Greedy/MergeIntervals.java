package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        /*intervals = [[1,3],[2,6],[8,10],[15,18]]
        Output: [[1,6],[8,10],[15,18]]*/
        sort(intervals);
        for (int i = 0; i < intervals.length; i++) {
            if(res.isEmpty() || intervals[i][0] > res.get(res.size() - 1)[1]) {
                res.add(new int[]{intervals[i][0], intervals[i][1]});
            } else {
                res.get(res.size() - 1)[1] = Math.max(res.get(res.size() - 1)[1], intervals[i][1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    private void sort(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    }
}
