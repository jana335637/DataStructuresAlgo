package Trees;

public class isSubTree {
    static boolean matched=false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot == null) return true;
        if(root == null) return false;
        if(areIdentical(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean areIdentical(TreeNode root, TreeNode subRoot) {
        if(root==null && subRoot==null) return true;
        if(root==null || subRoot==null) return false;
        return (root.val == subRoot.val &&
                areIdentical(root.left, subRoot.left ) &&
                areIdentical(root.right, subRoot.right));
    }


}
