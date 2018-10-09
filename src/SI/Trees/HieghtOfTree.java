package SI.Trees;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by pillutja on 10/8/2018.
 */
public class HieghtOfTree {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases =in.nextInt();
        for (int i = 0; i < testCases; i++) {
            constuctTreeandHeight();
        }
    }

    private static void constuctTreeandHeight() throws IOException {
        int n = in.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        TreeNode root=null;
        for (int i = 0; i < n; i++) {
            root=insert(root,a[i]);
        }
        System.out.println(height(root));
    }
    private static int height(TreeNode root) {
        if(root==null) return -1;
        return 1+Math.max(height(root.left),height(root.right));
    }
    private static void preOrder(TreeNode root) {
        if(root==null)
            return;
        System.out.print(root.val +" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    private static void inOrder(TreeNode root) {
        if(root==null)
            return;
        inOrder(root.left);
        System.out.print(root.val +" ");
        inOrder(root.right);
    }
    private static void postOrder(TreeNode root) {
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val +" ");
    }
    private static TreeNode insert(TreeNode root, int x) {
        if(root==null)
            return new TreeNode(x);
        if(x<root.val)
            root.left=insert(root.left,x);
        else
            root.right=insert(root.right,x);
        return root;
    }
}
/*
class TreeNode {
    int val;
    TreeNode left,right;
    public TreeNode(int val){
        this.val = val;
        left=null;
        right=null;
    }
}*/
