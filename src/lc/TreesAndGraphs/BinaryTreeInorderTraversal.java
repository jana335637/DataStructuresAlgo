package lc.TreesAndGraphs;

import HackerEarth.TreeNode;
import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        boolean done= false;
        if(root == null)
            return res;
        while(!done){
            if(current != null){
                stack.push(current);
                current = current.left;
            } else {
                if(stack.isEmpty()){
                    done=true;
                }
                TreeNode tmp = stack.pop();
                res.add(tmp.data);
                current = tmp.right;
            }
        }
        return res;
    }
}
