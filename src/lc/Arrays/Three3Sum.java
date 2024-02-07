package lc.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Three3Sum {
    public static void main(String[] args) {
        System.out.println( three3Sum(new int[]{-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> three3Sum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map h = new HashMap<Integer, ArrayList<ArrayList<Integer>>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i!=j){
                    int sum = nums[i] + nums[j];
                    boolean insert = true;
                    if(h.get(sum)!=null){
                        List<List> list = (ArrayList) h.get(sum);
                        for (List li :
                                list) {
                            if(li.contains(nums[i]) && li.contains(nums[j])){
                                insert = false;
                            }
                        }
                        if(insert)
                        list.add(new ArrayList<>(Arrays.asList(nums[i], nums[j])));
                    } else {
                        List list = new ArrayList();
                        list.add(new ArrayList<>(Arrays.asList(nums[i], nums[j])));
                        h.put(sum, list);
                    }
                }
            }
        }
        System.out.println(h);
        for (int i = 0; i < nums.length; i++) {
            if(h.get(0-nums[i]) != null){
                List<List> list = (ArrayList) h.get(0-nums[i]);
                boolean alreadyExists = false;

                for (List li : list) {
                    if(li.size()==2){
                        li.add(nums[i]);
                        for (List l : res) {
                           if(l.contains(nums[i]) && l.contains(li.get(0)) && l.contains(li.get(1)) )
                               alreadyExists = true;
                        }
                        if(!alreadyExists)
                        res.add(li);
                    }
                }
            }
        }
        return res;
    }

}
