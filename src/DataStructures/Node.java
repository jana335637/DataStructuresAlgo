package DataStructures;

import java.util.HashSet;

public class Node {
    int value;
    static Node head;
    Node next;
    private static void recursiveReversePrint(Node temp) {
        if(temp == null)
            return;
        recursiveReversePrint(temp.next);
        System.out.print(temp.value+" ");
    }

    private static void recursiveReverseLinkedList(Node temp) {
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
        Node currentNode = head;
        Node nextNode = null;
        Node previousNode = null;
        if(head == null)
        {
            System.out.println("Can't reverse the list as there are no values");
        }
        else{
            while(currentNode!=null)
            {
                nextNode = currentNode.next;
                currentNode.next = previousNode;
                previousNode = currentNode;
                currentNode = nextNode;
            }
        }
        head = previousNode;
    }

    private static void delete(int position) {
        Node currentNode = head;
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
                if(currentNode != null){
                    j++;
                    currentNode = currentNode.next;
                }
            }
            System.out.println("j is :"+j +"   position-1 : "+(position-1));
            if((j == (position-1)) && (currentNode.next != null)){
                Node temp = currentNode.next;
                currentNode.next = temp.next;
                temp.next = null;
            }
            else
            {
                System.out.println("Value does not exist at given position");
            }
        }
    }

    private static void insert(int value, int position) {
        Node currentNode = head;
        if(position == 1)
        {
            Node node = new Node();
            node.value = value;
            head = node;
            return;
        }
        int j = 1;
        for (int i = 1; i < (position-1); i++) {
            if(currentNode != null){
                j++;
                currentNode = currentNode.next;
            }
        }
        System.out.println("j is :"+j +"   position-1 : "+(position-1));
        if((j == (position-1)) && (currentNode != null)){
            Node node = new Node();
            node.value = value;
            node.next = currentNode.next;
            currentNode.next = node;
        }
        else
        {
            System.out.println("Given position does not exist in linked list");
        }
    }

    private static void insertAtBeginning(int value) {
        Node node = new Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public static void addNode(int value)
    {
        if(head == null){
            head = new Node();
            head.value = value;
        }
        else{
            Node currentNode = head;
            while(currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = new Node();
            currentNode = currentNode.next;
            currentNode.value=value;
        }
    }
    public static void printLinkedList(){
        if(head == null)
        {
            System.out.println("There are no elements in the LinkedList");
        }
        else
        {
            Node currentNode = head;
            System.out.print(head.value + " ");
            while(currentNode.next != null)
            {
                currentNode = currentNode.next;
                System.out.print(currentNode.value + " ");
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
        delete(13);
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
        printLinkedList();
    }

    private static void deleteDuplicates(Node head) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        uniqueNumbers.add(head.value);
        Node previousNode = head;
        Node currentNode = head.next;
        while(currentNode!=null)
        {
            if(uniqueNumbers.contains(currentNode.value)){
                previousNode.next = currentNode.next;
                currentNode.next=null;
                currentNode = previousNode.next;
            }
            else {
                uniqueNumbers.add(currentNode.value);
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
    }
}
