package IB;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pillutja on 12/30/2018.
 */
public class RemoveDuplicatesFromSorted {
   /* public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next= new ListNode(1);
        head.next.next= new ListNode(6);
        head.next.next.next= new ListNode(4);
        head.next.next.next.next =  new ListNode(1);
        RemoveDuplicatesFromSorted l = new RemoveDuplicatesFromSorted();
        System.out.println(l.lPalin(head));
    }*/
   public ListNode deleteDuplicates(ListNode A) {
       if(A==null) return A;
       while (A.next!=null && A.val == A.next.val){
           A.next = A.next.next;
       }
       if(A.next ==null) return A;
       ListNode p = A.next, c = p.next;
       while(c!=null){
           if(c.val==p.val){
               p.next=c.next;
           }
           else{
               p=p.next;
           }
           c=c.next;
       }
        return A;
   }

    public ListNode deleteDuplicatesFromUnsorted(ListNode A) {
        Map<Integer, Integer> map = new HashMap<>();
        if(A==null) return A;
        while (A.next!=null && A.val == A.next.val){
            A.next = A.next.next;
        }
        if(A.next ==null) return A;
        ListNode p = A, c = A.next;
        map.put(p.val, p.val);
        while(c!=null){
            if(map.get(c.val) == null){
                map.put(c.val, c.val);
                p=p.next;
                c=p.next;
            } else {
                p.next=c.next;
                c.next=null;
                c=p.next;
            }

        }
        return A;
    }
}

