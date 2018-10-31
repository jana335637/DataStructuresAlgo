package SI.Trees;

import java.io.IOException;
import java.util.*;

public class LeftView {

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
        int level=0;
        boolean nodeNull = false;
        Map<Integer,Number> map = new HashMap<>();
        Queue<TreeNode> q =new LinkedList<>();
        if(root!=null) {
            q.add(root);
            q.add(null);
            map.put(level++,root.val);
        }
        while(q.size()>1){
            TreeNode current = q.poll();
            if(current!=null){
                if(nodeNull==true)
                    map.put(level++,current.val);
                nodeNull=false;
                if(current.left!=null)
                    q.add(current.left);
                if(current.right!=null)
                    q.add(current.right);
            }
            else{
                nodeNull=true;
                q.add(null);
            }
        }
        for (int index:map.keySet()) {
            System.out.print(map.get(index)+" ");
        }
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

