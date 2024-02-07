package DataStructures;

import java.util.HashSet;
import java.util.List;

public class ListNode {
    public int val;
    static ListNode head;
    public ListNode next;

    public ListNode(){

    }
    public ListNode(int val){
        this.val = val;
    }
    private static void recursiveReversePrint(ListNode temp) {
        if(temp == null)
            return;
        recursiveReversePrint(temp.next);
        System.out.print(temp.val +" ");
    }

    private static void recursiveReverseLinkedList(ListNode temp) {
        if(temp.next == null)
        {
            head = temp;
            return;
        }
        recursiveReverseLinkedList(temp.next);
        temp.next.next = temp;
        temp.next = null;

    }

    private static void reverseLinkedList() {
        ListNode currentListNode = head;
        ListNode nextListNode = null;
        ListNode previousListNode = null;
        if(head == null)
        {
            System.out.println("Can't reverse the list as there are no values");
        }
        else{
            while(currentListNode !=null)
            {
                nextListNode = currentListNode.next;
                currentListNode.next = previousListNode;
                previousListNode = currentListNode;
                currentListNode = nextListNode;
            }
        }
        head = previousListNode;
    }

    private static void delete(int position) {
        ListNode currentListNode = head;
        if(position==1)
        {
            if(head!=null)
            {
                head = head.next;
            }
            else
                System.out.println("Value does not exist at given position");
        }
        else {
            int j = 1;
            for (int i = 1; i < (position-1); i++) {
                if(currentListNode != null){
                    j++;
                    currentListNode = currentListNode.next;
                }
            }
            System.out.println("j is :"+j +"   position-1 : "+(position-1));
            if((j == (position-1)) && (currentListNode.next != null)){
                ListNode temp = currentListNode.next;
                currentListNode.next = temp.next;
                temp.next = null;
            }
            else
            {
                System.out.println("Value does not exist at given position");
            }
        }
    }

    private static void insert(int value, int position) {
        ListNode currentListNode = head;
        if(position == 1)
        {
            ListNode listNode = new ListNode();
            listNode.val = value;
            head = listNode;
            return;
        }
        int j = 1;
        for (int i = 1; i < (position-1); i++) {
            if(currentListNode != null){
                j++;
                currentListNode = currentListNode.next;
            }
        }
        System.out.println("j is :"+j +"   position-1 : "+(position-1));
        if((j == (position-1)) && (currentListNode != null)){
            ListNode listNode = new ListNode();
            listNode.val = value;
            listNode.next = currentListNode.next;
            currentListNode.next = listNode;
        }
        else
        {
            System.out.println("Given position does not exist in linked list");
        }
    }

    private static void insertAtBeginning(int value) {
        ListNode listNode = new ListNode();
        listNode.val = value;
        listNode.next = head;
        head = listNode;
    }

    public static void addNode(int value)
    {
        if(head == null){
            head = new ListNode();
            head.val = value;
        }
        else{
            ListNode currentListNode = head;
            while(currentListNode.next != null)
            {
                currentListNode = currentListNode.next;
            }
            currentListNode.next = new ListNode();
            currentListNode = currentListNode.next;
            currentListNode.val =value;
        }
    }
    public static void printLinkedList(){
        if(head == null)
        {
            System.out.println("There are no elements in the LinkedList");
        }
        else
        {
            ListNode currentListNode = head;
            System.out.print(head.val + " ");
            while(currentListNode.next != null)
            {
                currentListNode = currentListNode.next;
                System.out.print(currentListNode.val + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printLinkedList();
        insert(28,1);
        printLinkedList();
        insert(29,2);
        addNode(-2);
        addNode(29);
        printLinkedList();
        for (int i = 0; i < 10; i++) {
            addNode(i);
        }
        printLinkedList();
        /*delete(13);
        insertAtBeginning(-2);
        printLinkedList();
        insertAtBeginning(-1);
        printLinkedList();
        insert(8,5);
        printLinkedList();
        insert(28,16);
        printLinkedList();
        insert(30,18);
        printLinkedList();
        delete(5);
        printLinkedList();
        delete(1);
        printLinkedList();
        delete(2);
        printLinkedList();
        reverseLinkedList();
        printLinkedList();
        recursiveReverseLinkedList(head);
        printLinkedList();
        recursiveReversePrint(head);
        System.out.println();
        printLinkedList();
        addNode(6);
        addNode(7);
        addNode(8);
        printLinkedList();
        deleteDuplicates(head);
        printLinkedList();*/
        head = reverseInPairs(head);
        printLinkedList();
    }

    private static void deleteDuplicates(ListNode head) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(head.val);
        ListNode previousListNode = head;
        ListNode currentListNode = head.next;
        while(currentListNode !=null)
        {
            if(uniqueNumbers.contains(currentListNode.val)){
                previousListNode.next = currentListNode.next;
                currentListNode.next=null;
                currentListNode = previousListNode.next;
            }
            else {
                uniqueNumbers.add(currentListNode.val);
                previousListNode = currentListNode;
                currentListNode = currentListNode.next;
            }
        }
    }

    private static ListNode reverseInPairs(ListNode head){
        printLinkedList();
        ListNode temp1= null, temp2=null;
        while(head != null && head.next != null){
            if(temp1 != null){
               temp1.next.next = head.next;
            }
            temp1 = head.next;
            head.next = head.next.next;
            temp1.next = head;
            if(temp2 == null){ temp2 = temp1;}
            head = head.next;
        }
        return temp2;
    }
}
