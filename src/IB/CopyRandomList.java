package IB;

public class CopyRandomList {
    public NodeR copyRandomList(NodeR head) {
        if (head == null) {
            return null;
        }
        NodeR oldHead = head;
        //create new nodes and have 1->1'->2->2'->3->3'
        while(head != null) {
            NodeR newNode = new NodeR(head.val);
            newNode.next = head.next;
            head.next = newNode;
            head = newNode.next;
        }
        head = oldHead;
        //Iterate and assign random pointers based on original random pointers
        while(head !=null && head.next != null) {
            head.next.random = head.random.next;
            head = head.next.next;
        }
        //Iterate and separate out new copied List
        head=oldHead;
        NodeR dummyHead = new NodeR(0);
        NodeR copyItr = dummyHead;
        while(head != null) {
            copyItr.next = head.next;
            head.next = head.next.next;
            head= head.next;
            copyItr = copyItr.next;
        }
        return dummyHead.next;
    }
}
