package DataStructures;

/**
 * Created by pillutja on 4/19/2018.
 */
public class QueueArrayImplementation {
    static int maxSize = 10;
    static int[] queue = new int[maxSize];
    static int rear = -1;
    static int front = -1;

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
    }

    private static void printQueue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
        } else
        {
            for (int temp = front;temp<=rear;temp++){
                System.out.print(queue[temp]+" ");
            }
            System.out.println();
        }
    }

    private static void peek() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
        } else
            System.out.println("Peek is:"+queue[front]);
    }

    private static void poll() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
        } else if(front==rear){
            System.out.println(queue[front] +" is dequed from Queue.");
            front=-1;
            rear = -1;
        }
        else{
            System.out.println(queue[front] +" is dequed from Queue.");
            ++front;  //front = (front+1)%max_size
        }
    }
    private static void offer(int i) {
        if(isQueueFull())
        {
            System.out.println("Queue is full");
            return;
        }
        else if(isQueueEmpty())
        {
            ++front;
            ++rear;
        }
        else{
            ++rear; //rear = (rear+1)%max_size
        }
        queue[rear] = i;
        System.out.println(i+" offered into queue");
    }

    private static boolean isQueueFull() {
        if(rear==(maxSize-1)) //((rear+1)%max_size == front) for circular queue
            return true;
        else
            return false;
    }

    private static boolean isQueueEmpty() {
        if(rear == -1 && front == -1) // same for circular queue
            return true;
        else
            return false;
    }


}
