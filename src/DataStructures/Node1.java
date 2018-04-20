package DataStructures;

/**
 * Created by pillutja on 4/19/2018.
 */
public class Node1 {
    static Node1 head;
    int value;
    Node1 previousNodeReference;
    Node1 nextNodeReference;

    public static void main(String[] args) {
        System.out.println("****************Doubly Linked List*****************");
        printDLL();
        addNode(0);
        for (int i = 1; i < 10; i++) {
            addNode(i);
        }
        printDLL();
        printReverseByPreviousReference();
    }

    private static void printReverseByPreviousReference()
        {
            Node1 currentNode = head;
            while(currentNode.nextNodeReference!=null){
                currentNode = currentNode.nextNodeReference;
            }
            if(currentNode==head)
                System.out.println("There are no elements in DLL");
            else{
                while(currentNode!=null)
                {
                    System.out.print(currentNode.value+" ");
                    currentNode = currentNode.previousNodeReference;
                }
            }
        }

    private static void printDLL() {
        if(head==null)
        {
            System.out.println("There are no elements in DLL");
        }
        else{
            System.out.print(head.value + " ");
            Node1 currentNode = head.nextNodeReference;
            while(currentNode!=null){
                System.out.print(currentNode.value +" ");
                currentNode = currentNode.nextNodeReference;
            }
        }
        System.out.println();
    }


    private static void addNode(int i) {
        Node1 currentNode = head;
        if(currentNode == null)
        {
            currentNode = new Node1();
            currentNode.value =i;
            head = currentNode;
        }
        else
        {
            Node1 prevNode =head;
            while ((currentNode)!=null){
                prevNode = currentNode;
                currentNode = currentNode.nextNodeReference;
            }
            Node1 newNode = new Node1();
            newNode.value = i;
            newNode.previousNodeReference = prevNode;
            prevNode.nextNodeReference = newNode;
        }
    }
}
