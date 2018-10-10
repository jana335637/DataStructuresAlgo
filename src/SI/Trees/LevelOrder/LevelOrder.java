package SI.Trees.LevelOrder;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrder {

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
        levelOrder(root);
    }

    private static void levelOrder(TreeNode root) {
        int num=1;
        Queue<TreeNode> q =new LinkedList<>();
        if(root!=null) {
            q.add(root);
            q.add(null);
        }
        while(q.size()>1){
            TreeNode current = q.poll();
            if(current!=null){
                if(current.left!=null)
                    q.add(current.left);
                if(current.right!=null)
                    q.add(current.right);
                System.out.print(current.val+" ");
            }
            else{
                System.out.println();
                q.add(null);
            }
        }
        System.out.println();
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
class TreeNode {
    int val;
    TreeNode left,right;
    public TreeNode(int val){
        this.val = val;
        left=null;
        right=null;
    }
}
