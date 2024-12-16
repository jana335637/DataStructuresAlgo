package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> curr = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if(tmp != null){
                curr.add(tmp.val);
                if(tmp.left !=null)
                    queue.add(tmp.left);
                if(tmp.right != null )
                    queue.add(tmp.right);
            } else {
                List<Integer> c_curr = new ArrayList<>(curr);
                res.add(c_curr);
                curr.clear();
                if(!queue.isEmpty())
                    queue.add(null);
            }
        }
        return res;
    }
}
