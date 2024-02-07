package lc.ll;

import DataStructures.ListNode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current;
        int n1=0, n2=0, n3=0;
        int x=0, y=0, follow=0, res=0;
        ListNode resPreHead = new ListNode(0);
        current = resPreHead;
        while(l1!=null || l2!=null){
            if(l1!=null){
                x=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                y=l2.val;
                l2=l2.next;
            }
            res = x+y+follow;
            current.next = new ListNode(res%10);
            follow = res/10;
            x=0; y=0;
            current = current.next;
        }
        if(follow>0){
            current.next = new ListNode(follow);
        }
        return resPreHead.next;
    }
}
