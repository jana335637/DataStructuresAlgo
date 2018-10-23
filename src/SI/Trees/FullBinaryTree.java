package SI.Trees;

import java.io.IOException;
import java.util.*;

public class FullBinaryTree {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases =in.nextInt();
        for (int i = 0; i < testCases; i++) {
            traversals();
            System.out.println();
        }
    }

    private static void traversals() throws IOException {
        int n = in.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        TreeNode root=null;
        for (int i = 0; i < n; i++) {
            root=insert(root,a[i]);
        }
        if(checkFullBinaryTree(root))
            System.out.println("True");
        else
            System.out.println("False");
    }

    private static boolean checkFullBinaryTree(TreeNode root) {
        if(root==null)
            return true;
        if((root.left!=null && root.right==null)||(root.left==null && root.right!=null))
            return false;
        return (checkFullBinaryTree(root.left)&&checkFullBinaryTree(root.right));
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
