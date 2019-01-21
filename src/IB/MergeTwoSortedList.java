package IB;

import java.util.List;

/**
 * Created by pillutja on 12/30/2018.
 */
public class MergeTwoSortedList {
    /* public static void main(String[] args) {
         ListNode head = new ListNode(1);
         head.next= new ListNode(1);
         head.next.next= new ListNode(6);
         head.next.next.next= new ListNode(4);
         head.next.next.next.next =  new ListNode(1);
         RemoveDuplicatesFromSorted l = new RemoveDuplicatesFromSorted();
         System.out.println(l.lPalin(head));
     }*/
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode d = new ListNode(-1), h = d;
        while (A != null && B != null) {
            if (A.val <= B.val) {
                d.next = new ListNode(A.val);
                A = A.next;
            } else {
                d.next = new ListNode(B.val);
                B = B.next;
            }
            d = d.next;
        }
        while (A != null) {
            d.next = new ListNode(A.val);
            A = A.next;
            d = d.next;
        }
        while (B != null) {
            d.next = new ListNode(B.val);
            B = B.next;
            d = d.next;
        }
        return h.next;
    }
    public ListNode removeNthFromEnd(ListNode A, int B) {
        int size = getSize(A);
        if(B>=size)
            return A.next;
        else{
            int step=1;
            ListNode s=A,f=A,ps=s;
            while(step<B && f!=null){
                f=f.next;
                step++;
            }
            while(f.next!=null){
                ps=s;
                s=s.next;
                f=f.next;
            }
            ps.next=s.next;
            s.next=null;
        }
        return A;
    }

    private int getSize(ListNode a) {
        int size=0;
        while(a!=null){
            size++;
            a=a.next;
        }
        return size;
    }
    public ListNode rotateRight(ListNode A, int B) {
        int size = getSize(A);
        B = B%size;
        if(size==1 || B==0)
            return A;

        int step=1;
        ListNode s=A,f=A,ps=s;
        while(step<B && f!=null){
            f=f.next;
            step++;
        }
        while(f.next!=null){
            ps=s;
            s=s.next;
            f=f.next;
        }
        ps.next=null;
        f.next=A;
        return s;
    }
}

