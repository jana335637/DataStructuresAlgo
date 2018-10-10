package SI.Trees;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BottomUpLevelOrder {

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
        TreeNode root=null;
        for (int i = 0; i < n; i++) {
            root=insert(root,a[i]);
        }
        bottomUpLevelOrder(root);
    }

    private static void bottomUpLevelOrder(TreeNode root) {
        int num=1;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
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
                array.add(current.val);
            }
            else{
                ans.add(array);
                array = new ArrayList<>();
                q.add(null);
            }
        }
        if(array.size()>0)
            ans.add(array);
        for (int i = ans.size()-1; i >=0 ; i--) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
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
