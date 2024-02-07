package DataStructures;

import static jdk.nashorn.internal.objects.NativeArray.push;

/**
 * Created by pillutja on 4/19/2018.
 */
public class StackLinkedListImplementation {
    static ListNode head;
    public static void main(String[] args) {
        push(2);
        printStack();
        pop();
        printStack();
        System.out.println(isEmpty());
        printStack();
        for (int i = 0; i < 9; i++) {
            push(i);
        }
        System.out.println(top());
        printStack();
        pop();
        printStack();
    }

    private static void printStack() {
        if(head == null)
            System.out.println("Stack under flow");
        else{
            ListNode temp = head;
            while(temp!=null)
            {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
    private static void push(int i) {
        ListNode newListNode = new ListNode();
        newListNode.val = i;
        if(head==null){
            head = newListNode;
        }
        else{
            newListNode.next=head;
            head = newListNode;
        }
    }
    private static void pop() {
        if(head == null)
            System.out.println("Stack under flow");
        else{
            ListNode temp =head;
            head = head.next;
            temp.next=null;
        }
    }
    private static boolean isEmpty() {
        return head==null;
    }
    private static int top() {
        if(head==null){
            System.out.println("Stack under flow");
            return -100;
        }
        else {
            return head.val;
        }
    }
}
