package IB;

public class KReverseLL {
    public ListNode reverseList(ListNode a, int b) {
        ListNode h=a,head=a,p=a ,temp;
        int step=1,size = getSize(a);
        for (int i = 0; i < size/b ; i++) {
            step=1; h=a;
            while(a!=null && step<b){
                a=a.next;
                step++;
            }
            temp=a.next;
            a.next=null;
            a = reverse(h);
            if(i==0){
                head=a;
            }else{
                p.next=a;
            }
            while(a.next!=null){
                a=a.next;
            }
            p=a;
            a.next=temp;
            a=a.next;
        }
        return head;
    }

    private int getSize(ListNode a) {
        int size=0;
        while(a!=null){
            size++;
            a=a.next;
        }
        return size;
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
