package IB;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by pillutja on 8/17/2018.
 */
public class TreeTraversals {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            traversals();
            System.out.println();
        }
    }

    ArrayList<Integer> ans = new ArrayList<>();

    /*public ArrayList<Integer> preorderTraversal(Trees.TreeNode A) {
        if (A == null)
            return new ArrayList<>();
        ans.add(A.val);
        preorderTraversal(A.left);
        preorderTraversal(A.right);
        return ans;
    }
    public ArrayList<Integer> postorderTraversal(Trees.TreeNode A) {
        if (A == null)
            return new ArrayList<>();
        postorderTraversal(A.left);
        postorderTraversal(A.right);
        ans.add(A.val);
        return ans;
    }
    public ArrayList<Integer> inorderTraversal(Trees.TreeNode A) {
        if (A == null)
            return new ArrayList<>();
        inorderTraversal(A.left);
        ans.add(A.val);
        inorderTraversal(A.right);
        return ans;
    }*/

    private static void traversals() throws IOException {
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, a[i]);
        }
       /* ans=new ArrayList<>();
        ArrayList<Integer> ans = inorderTraversal(root);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();*/
/*
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
*/
    }

    private static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    private static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    private static Node insert(Node root, int x) {
        if (root == null)
            return new Node(x);
        if (x < root.val)
            root.left = insert(root.left, x);
        else
            root.right = insert(root.right, x);
        return root;
    }

}

class Node {
    int val;
    Node left;
    Node right;

    Node(int x) {
        val = x;
        left = null;
        right = null;
    }
}