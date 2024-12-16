package Trees;

public class MaxPathSum {
    public int maxPathSum(TreeNode root) {
        if(root==null) return 0;
        int[] maxi = new int[2];
        maxi[0]= Integer.MIN_VALUE;
        max(root, maxi);
        return maxi[0];
    }
    public int max(TreeNode root, int[]  maxi){
        if(root==null) return 0;
        int left=Math.max(0, max(root.left, maxi));
        int right=Math.max(0, max(root.right, maxi));
        maxi[0] = Math.max(maxi[0], root.val+left+right );
        return Math.max(left, right)+root.val;
    }
}
