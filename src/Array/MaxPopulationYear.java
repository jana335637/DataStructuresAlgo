package Array;

import java.util.ArrayList;
import java.util.List;

public class MaxPopulationYear {
    public static void main(String[] args) {
        MaxPopulationYear maxPopulationYear = new MaxPopulationYear();
        System.out.println(maxPopulationYear.maximumPopulation(new int[][]{{1993,1999}, {2000,2010}}));
    }
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            arr[logs[i][0]-1950]++;
            arr[logs[i][1]-1950]--;
        }
        int max = arr[0], year = 1950;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1]+arr[i];
            if(arr[i] > max) {
                max = Math.max(max, arr[i]);
                year=1950+i;
            }

        }
       return year;
    }

    public boolean isCovered(int[][] ranges, int left, int right) {
        List<Integer> covered = new ArrayList<>();
        for (int i = 0; i < ranges.length; i++) {
            int min = ranges[i][0], max = ranges[i][1];
            for (int j = min; j <= max; j++) {
                covered.add(j);
            }
        }
        for (int i = left; i <= right ; i++) {
            if(!covered.contains(i)) { return false;}
        }
        return true;
    }


}
