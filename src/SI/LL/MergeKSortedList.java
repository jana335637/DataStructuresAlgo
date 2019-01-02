package SI.LL;

import java.util.HashSet;
import java.util.List;

public class MergeKSortedList {
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[4];
        lists[0]= new ListNode(1);lists[0].next=new ListNode(4);
        lists[1]= new ListNode(1);lists[1].next=new ListNode(3);
        lists[2]= new ListNode(2);lists[2].next=new ListNode(6);

        ListNode x  = mergeKLists(lists);
        while(x!=null){
            System.out.println(x.val);
            x=x.next;
        }
    }

    private static ListNode mergeKLists(ListNode[] lists) {
        ListNode[] curPointers = new ListNode[lists.length];
        int minIndex=Integer.MAX_VALUE,min=Integer.MAX_VALUE;
        for (int i = 0; i < lists.length; i++) {
            curPointers[i]=lists[i];
            if(curPointers[i]!=null){
                if(curPointers[i].val<min){
                    min=curPointers[i].val;
                    minIndex=i;
                }
            }
        }
        ListNode head =null,temp=head;
        if(minIndex<lists.length){
            head = new ListNode(min);
            temp=head;
            curPointers[minIndex]=curPointers[minIndex].next;
        }
        int x=1;
        while(x==1){
            x=0;
            minIndex=Integer.MAX_VALUE;min=Integer.MAX_VALUE;
            for (int i = 0; i < curPointers.length; i++) {
                if(curPointers[i]!=null){
                    x=1;
                    if(curPointers[i].val<min){
                        minIndex=i;
                        min=curPointers[i].val;
                    }
                }
            }
            if(minIndex<lists.length){
                temp.next = new ListNode(min);
                temp=temp.next;
                curPointers[minIndex]=curPointers[minIndex].next;
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
