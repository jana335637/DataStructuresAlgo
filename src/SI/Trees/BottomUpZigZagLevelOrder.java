package SI.Trees;

import java.io.IOException;
import java.util.*;

public class BottomUpZigZagLevelOrder {

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
        zigZagLevelOrder(root);
    }

    private static void zigZagLevelOrder(TreeNode root) {
        int num=1;
        Queue<TreeNode> q =new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> array = new ArrayList<>();
        StringBuilder sb  =  new StringBuilder();
        StringBuilder sb1  =  new StringBuilder();
        if(root!=null) {
            q.add(root);
            q.add(null);
        }
        while(q.size()>=1){
            TreeNode current = q.poll();
            if(current!=null){
                stack.push(current);
                sb.append(current.val+" ");
            }
            else{
                sb1 = sb.append(sb1);
                sb = new StringBuilder();
                ans.add(array);
                array = new ArrayList<>();
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
/*
        if(array.size()>0)
            ans.add(array);
        for (int i = ans.size()-1; i >=0 ; i--) {
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j)+" ");
            }
        }
*/
        System.out.println(sb1.toString());
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

