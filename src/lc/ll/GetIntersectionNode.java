package lc.ll;

import DataStructures.ListNode;

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //Find lengths and get difference
        //walk longest ll for diff and start checking for intersected node
        int l1=0, l2=0, diff = 0;
        ListNode current = headA, list1=null, list2=null;
        while(current != null){
            l1++;
            current = current.next;
        }
        current = headB;
        while(current != null){
            l2++;
            current = current.next;
        }
        if(l1>l2){
            list1 = headA;
            list2 = headB;
            diff = l1-l2;
        } else {
            list1 = headB;
            list2 = headA;
            diff = l2-l1;
        }
        while(diff>0){
            list1 = list1.next;
            diff--;
        }
        while(list1 != null && list2 != null){
            if(list1 == list2){
                return list1;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        return null;
        //Test cases: 1,1 : no Inters; null, null ; 1-2-3, null
    }
}
