package DataStructures;

import java.util.PriorityQueue;

public class BSTNode implements Comparable{

    int data;
    BSTNode left;
    BSTNode right;
    public static void main(String[] args) {
        BSTNode root = null;
        root = insert(root,15);
        root = insert(root,10);
        root = insert(root,5);
        root = insert(root,20);
        root = insert(root,25);
        root = insert(root,1);
        System.out.println(search(root,25));
        System.out.println(root.data);
        findMinBSTNode(root);
        System.out.println("Height of the tree is:"+ findHeight(root));
        System.out.print("BreadthFirstOrder is:");
        BreadthFirstSearch(root);
        System.out.println();
        System.out.print("PreOrder is:");        preOrder(root);
        System.out.println();
        System.out.print("InOrder is:");        inOrder(root);
        System.out.println();
        System.out.print("PostOrder is:");        postOrder(root);
        root = delete(root,20);
        System.out.println();
        System.out.print("InOrder is:");        inOrder(root);

    }

    private static BSTNode delete(BSTNode root, int data) {
        if(root==null)
            return root;
        else if(data < root.data)
            root.left = delete(root.left,data);
        else if(data>root.data)
            root.right = delete(root.right,data);
        else
        {
            if(root.left==null && root.right==null){
                root = null;
            }
            else if(root.left == null){
                BSTNode right = root.right;
                root.right=null;
                root = right;
            }
            else if(root.right==null)
            {
                BSTNode left = root.left;
                root.left = null;
                root = left;
            }
            else{
                BSTNode rightMinNode =findMinBSTNode(root.right);
                root.data = rightMinNode.data;
                root.right = delete(root.right,root.data);
            }
        }
        return root;
    }

    private static void postOrder(BSTNode root) {
        if(root==null)return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    private static void inOrder(BSTNode root) {
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    private static void preOrder(BSTNode root) {
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    private static void BreadthFirstSearch(BSTNode root) {
        PriorityQueue<BSTNode> queue = new PriorityQueue<>();
        if(root==null) return;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            BSTNode currentNode = queue.peek();
            System.out.print(currentNode.data+" ");
            if(currentNode.left!=null)
                queue.offer(currentNode.left);
            if(currentNode.right!=null)
                queue.offer(currentNode.right);
            queue.poll();
        }
    }

    private static int findHeight(BSTNode root) {
        if(root==null)
            return -1;
        return max(findHeight(root.left),findHeight(root.right))+1;
    }

    private static BSTNode findMinBSTNode(BSTNode root) {

        if(root==null){
            System.out.println("BST is empty");
            return null;
        }
        if(root.left==null){
            System.out.println("Min of BST is:"+ root.data);
            return root;
        }
        return findMinBSTNode(root.left);
        /* Iterative solution
        while(root.left!=null)
            root = root.left;
        System.out.println("Min of BST is:"+ root.data);*/

    }

    private static boolean search(BSTNode root, int i) {
        if(root==null)
            return Boolean.FALSE;
        else if (i == root.data)
            return Boolean.TRUE;
        else if(i <= root.data)
            return search(root.left,i);
        else
            return search(root.right,i);

    }

    private static BSTNode insert(BSTNode root, int data) {
        if(root==null){
            root = getNode(data);
        }
        else if(data <= (root.data))
        {
            root.left = insert(root.left,data);
        }
        else if(data > (root.data))
        {
            root.right = insert(root.right,data);
        }
        return root;
    }
    private  static BSTNode getNode(int data){
        BSTNode node = new BSTNode();
        node.data = data;
        return node;
    }
    private static int max(int leftHight, int rightHeight) {
        if(leftHight <= rightHeight)
            return rightHeight;
        else
            return leftHight;
    }

    @Override
    public int compareTo(Object o) {
        return 1;
    }
}
