package Array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < n1 && j < n2) {
            if(nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;j++;
            }
            if(nums1[i] < nums2[j]) {
                i++;
            }
            if(nums1[i] > nums2[j]) {
                j++;
            }
        }
        return list.stream().mapToInt(x -> x).toArray();
    }
}
