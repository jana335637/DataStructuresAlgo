package Trees;

public class MaxDepth {
    public static void main(String[] args) {

    }
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        if(leftDepth>rightDepth)
            return leftDepth+1;
        return rightDepth+1;
    }
}
