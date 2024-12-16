package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class maxWidthOfTree {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int ans= Integer.MIN_VALUE;
        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(root, 0));
        while(!q.isEmpty()){
            int size = q.size();
            int mmin = q.peek().num;
            int first=0, last=0;
            for(int i=0;i<size;i++){
                Pair pair = q.poll();
                TreeNode node = pair.root;
                int cur_id = pair.num - mmin;
                if(i==0) first = cur_id;
                if(i==size-1) last = cur_id;
                if(node.left != null)
                    q.offer(new Pair(node.left, cur_id*2+1));
                if(node.right !=null)
                    q.offer(new Pair(node.right, cur_id*2+2));
                ans=Math.max(ans, last-first+1);
            }
        }
        return ans;
    }
}
class Pair{
    TreeNode root;
    int num;
    Pair(TreeNode root, int num){
        this.root=root;
        this.num=num;
    }
}
