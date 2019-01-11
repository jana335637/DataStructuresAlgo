package IB;

import java.util.List;

public class ReOrderList {
    public static ListNode reorderList(ListNode d) {
        int size = getSize(d);
        if (size < 3) return d;
        ListNode mid = getMid(d),head=d;
        ListNode list2 = reverse(mid.next);
        mid.next=null;
        merge(d,list2);
        return head;
/*
        head = d;
        start = d;
        temp = d.next;
        x = d;
        int size = getSize(d);
        if (size < 3) return head;
        reorder(d);
        return head;
*/
    }

    private static void merge(ListNode a, ListNode b) {
        while (a!=null && b!=null){
            ListNode temp = a.next,temp2=b.next;
            a.next=b;
            b.next=temp;
            a=temp;
            b=temp2;
        }
    }

    private static ListNode reverse(ListNode d) {
        if(d.next==null)
            return d;
        ListNode x= reverse(d.next);
        d.next.next=d;
        d.next=null;
        return x;
    }

    private static ListNode getMid(ListNode d) {
        ListNode s=d,f=d;
        while (f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }


    private static int getSize(ListNode d) {
        int size = 0;
        while (d != null) {
            size++;
            d = d.next;
        }
        return size;
    }

/*
    private static void reorder(ListNode d) {
        if (d.next == null) return;
        reorder(d.next);
        if (temp == null) {
            return;
        }
        x = d.next;
        if(x==temp){
            temp=null;
            return;
        }
        start.next = x;
        x.next = temp;
        d.next = null;
        start = temp;
        temp = temp.next;
        if (temp == null) {
            return;
        }
    }

    public static void main(String[] args) {
        h = new ListNode(1);
        ListNode s = h;
        h.next = new ListNode(2);
        h = h.next;
        h.next = new ListNode(3);

        h = h.next;
        h.next = new ListNode(4);
        h = h.next;
        h.next = new ListNode(5);
        h = h.next;
        h.next = new ListNode(6);
        h = h.next;
        h.next = new ListNode(7);
        h = h.next;

        reorderList(s);
        while (s != null) {
            System.out.print(s.val + " ");
            s = s.next;
        }
    }
*/
}
