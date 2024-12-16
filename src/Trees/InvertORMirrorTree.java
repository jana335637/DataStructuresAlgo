package Trees;

public class InvertORMirrorTree {
    public TreeNode invertTree(TreeNode root) {
        if(root ==  null) return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
    }
}
