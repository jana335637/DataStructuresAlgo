package DataStructures;

/**
 * Created by pillutja on 4/20/2018.
 */
public class QueueLinkedListImplementation {
    static ListNode front;
    static ListNode rear;
    public static void main(String[] args) {
        offer(0);
        poll();
        peek();
        printQueue();
        for (int i = 1; i < 12; i++) {
            offer(i);
        }
        printQueue();
        peek();
        poll();
        printQueue();
        offer(11);
        offer(12);
        printQueue();
        for (int i = 0; i < 13; i++) {
            poll();
        }
        printQueue();
    }

    private static void printQueue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
        } else
        {
            ListNode currentListNode = front;
            while (currentListNode !=null){
                System.out.print(currentListNode.val +" ");
                currentListNode = currentListNode.next;
            }
            System.out.println();
        }
    }

    private static void peek() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
        } else
            System.out.println("Peek is:"+front.val);
    }

    private static void poll() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
        } else if(front==rear){
            System.out.println(front.val +" is dequed from Queue.");
            front=null;
            rear = null;
        }
        else{
            System.out.println(front.val +" is dequed from Queue.");
            front=front.next;  //front = (front+1)%max_size
        }
    }
    private static void offer(int i) {
        ListNode currentListNode = new ListNode();
        currentListNode.val = i;
        System.out.println(i+" offered into queue");
        if(isQueueEmpty())
        {
            front = currentListNode;
            rear = currentListNode;
        }
        else{
            rear.next = currentListNode;
            rear = currentListNode;
        }
    }

    private static boolean isQueueEmpty() {
        if(rear == null && front == null) // same for circular queue
            return true;
        else
            return false;
    }
}
