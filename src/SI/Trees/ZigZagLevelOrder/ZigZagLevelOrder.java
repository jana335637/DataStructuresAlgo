package SI.Trees.ZigZagLevelOrder;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ZigZagLevelOrder {

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
        zigZagLevelOrder(root);
    }

    private static void zigZagLevelOrder(TreeNode root) {
        int num=1;
        Queue<TreeNode> q =new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root!=null) {
            q.add(root);
            q.add(null);
        }
        while(q.size()>=1){
            TreeNode current = q.poll();
            if(current!=null){
                stack.push(current);
                System.out.print(current.val+" ");
            }
            else{
                while(!stack.isEmpty()){
                    TreeNode stackCurrent = stack.pop();
                    if((num&1)==1){
                        if(stackCurrent.left!=null)
                            q.add(stackCurrent.left);
                        if(stackCurrent.right!=null)
                            q.add(stackCurrent.right);
                    }
                    else{
                        if(stackCurrent.right!=null)
                            q.add(stackCurrent.right);
                        if(stackCurrent.left!=null)
                            q.add(stackCurrent.left);
                    }
                }
                if(q.size()>0)
                q.add(null);
                num++;
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
