package Trees;

public class KthSmallestInBST {
    public int kthSmallest(TreeNode root, int k) {
        int[] counter = new int[1], kSmallest = new int[1];
         kSmall(root, counter, k, kSmallest);
         return kSmallest[0];
    }

    private void kSmall(TreeNode root, int[] counter, int k, int[] kSmallest) {
        if(root==null || k<=counter[0]) return ;
        kSmall(root.left, counter, k, kSmallest);
        counter[0]++;
        if(counter[0]==k){
            kSmallest[0]=root.val;
            return;
        }
        kSmall(root.right, counter, k, kSmallest);
    }
}
