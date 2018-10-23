package SI.Trees;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CompleteBinaryTree {
    static Queue<TreeNodeDepth> queue;
    static int maxDepth=0;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases =in.nextInt();
        for (int i = 0; i < testCases; i++) {
            traversals();
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
        maxDepth=0;
        queue = new LinkedList<TreeNodeDepth>();
        fillDepth(root,0);
        if(checkLeafNodes(root) && checkLeafParents()){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }

    private static boolean checkLeafParents() {
        boolean complete = false;
        while (!queue.isEmpty()){
            TreeNodeDepth node = queue.poll();
            if(complete && (node.left!=null || node.right!=null))
                return false;
            if(!complete && (node.left==null | node.right==null))
                complete=true;
        }
        return true;
    }

    private static boolean checkLeafNodes(TreeNodeDepth root) {
        if(root==null)
            return true;
        if(root.depth==(maxDepth-1))
            queue.add(root);
        if(root.left==null && root.right==null)
            return root.depth==maxDepth-1 || root.depth==maxDepth;
        if(root.left==null && root.right!=null)
            return false;
        return checkLeafNodes(root.left) && (checkLeafNodes(root.right));
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
        if(d>maxDepth)
            maxDepth=d;
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
}
