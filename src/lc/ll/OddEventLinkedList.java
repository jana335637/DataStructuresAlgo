package lc.ll;

import DataStructures.ListNode;

public class OddEventLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){ return head;}
        ListNode oddHead = head, eventHead = null, lastOdd = head, lastEven = null;
        if(head.next != null){
            eventHead = head.next;
            lastEven = head.next;
        }
        int i=0;
        while(head!=null){
            ++i;
            if(head.next == null || head.next.next == null){
                break;
            }
            ListNode temp= head.next;
            head.next = head.next.next;
            if(i%2==0){ lastEven = head;}
            else {lastOdd = head; }
            head = temp;

        }
        if(i>=3)
            lastEven = lastEven.next;
        lastOdd = lastOdd.next;

        lastOdd.next = eventHead;
        lastEven.next = null;
        return oddHead;
    }
}
