package IB;

import java.util.*;

public class DeleteDuplicatesUnique {

    public ListNode deleteDuplicates(ListNode a) {
        if(a.next==null) return a;
        ListNode d = new ListNode(-1),h=d;
        Map<Integer,Integer> map=new TreeMap<>();
        while(a!=null){
            if(map.get(a.val)==null){
                map.put(a.val,1);
            }else{
                map.put(a.val,map.get(a.val)+1);
            }
            a=a.next;
        }
        for (int n : map.keySet()) {
            if(map.get(n)==1){
                d.next=new ListNode(n);
                d=d.next;
            }
        }
        return h.next;
    }
}
