package IB;

/**
 * Created by pillutja on 12/30/2018.
 */
public class PalindormLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next= new ListNode(1);
        head.next.next= new ListNode(6);
        head.next.next.next= new ListNode(4);
        head.next.next.next.next =  new ListNode(1);
        PalindormLL l = new PalindormLL();
        System.out.println(l.lPalin(head));
    }
    public int lPalin(ListNode A) {
        int size = getSize(A);
        if(size==1)
            return 1;
        if(size==2){
            if(A.val == A.next.val)
                return 1;
            return 0;
        }
        ListNode mid = findMid(A);
        mid.next=reverse(mid.next);
        mid=mid.next;
        while (mid!=null){
            if(A.val==mid.val){
                A=A.next;
                mid=mid.next;
            }
            else{
                return 0;
            }
        }
        return 1;
    }

    private ListNode reverse(ListNode next) {
        if(next.next ==null) return next;
        ListNode x = reverse(next.next);
        next.next.next = next;
        next.next=null;
        return x;
    }

    private int getSize(ListNode a) {
        int size=0;
        while(a!=null){
            size++;
            a=a.next;
        }
        return size;
    }

    private ListNode findMid(ListNode a) {
        ListNode s=a,f=a;
        if(a==null) return null;
        while (f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
}

