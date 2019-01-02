package IB;

import java.util.Map;
import java.util.TreeMap;

public class ReverseLL2MtoN {
    public ListNode reverseBetween(ListNode l, int m, int n) {
        if (m == n) return l;
        ListNode h = l, r, x, p = l,px=l,temp;
        int step = 1;
        if(m==1){
            r=h;
        }
        else {
            while (step < m) {
                p = l;
                l = l.next;
                step++;
            }
            r = p.next;
        }
        px = r;
        step = 1;
        while (step < (n - m + 1)) {
            px = px.next;
            step++;
        }
        temp=px.next;
        px.next=null;
        r = reverse(r);
        if (m == 1) {
            h=r;
        }
        else{
            p.next = r;
        }
        l=h;
        while(l.next!=null){
            l=l.next;
        }
        l.next=temp;
        return h;
    }

    private ListNode reverse(ListNode r) {
        if (r.next == null) {
            return r;
        }
        ListNode x = reverse(r.next);
        r.next.next = r;
        r.next = null;
        return x;
    }
}
