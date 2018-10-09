package SI.Trees;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by pillutja on 10/8/2018.
 */
public class DepthofTreeNodes {

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
        TreeNodeDepth root=null;
        for (int i = 0; i < n; i++) {
            root=insert(root,a[i]);
        }
        fillDepth(root,0);
        for (int i = 0; i < n; i++) {
            TreeNodeDepth node = search(root,a[i]);
            System.out.print(node.depth+" ");
        }
    }

    private static TreeNodeDepth search(TreeNodeDepth root, int x) {
        if(root==null)
            return null;
        if(root.val==x)
            return root;
        else if(root.val>x)
            return search(root.left,x);
        return search(root.right,x);
    }

    private static void fillDepth(TreeNodeDepth root,int d) {
        if(root==null)
            return;
        root.depth=d;
        fillDepth(root.left,d+1);
        fillDepth(root.right,d+1);

    }

    private static TreeNodeDepth insert(TreeNodeDepth root, int x) {
        if(root==null)
            return new TreeNodeDepth(x);
        if(x<root.val)
            root.left=insert(root.left,x);
        else
            root.right=insert(root.right,x);
        return root;
    }

    private static void preOrder(TreeNodeDepth root) {
        if(root==null)
            return;
        System.out.print(root.val +" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    private static void inOrder(TreeNodeDepth root) {
        if(root==null)
            return;
        inOrder(root.left);
        System.out.print(root.val +" ");
        inOrder(root.right);
    }
    private static void postOrder(TreeNodeDepth root) {
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val +" ");
    }
}
class TreeNodeDepth {
    int val,depth;
    TreeNodeDepth left,right;
    public TreeNodeDepth(int val){
        this.val = val;
        left=null;
        right=null;
    }
}
