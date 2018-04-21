import java.util.PriorityQueue;

public class QueuePractice{
    public static void main(String[] args) {
        //NavigableSet navigableSet = new NavigableSet() {};
          //      NavigableMap;

        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.offer(1);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        //System.out.println(priorityQueue.remove());
        priorityQueue.offer(1);
        priorityQueue.peek();
        System.out.println(priorityQueue);
        priorityQueue.offer(2);
        System.out.println(priorityQueue.element());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.element());
        System.out.println(priorityQueue);
    }
}
