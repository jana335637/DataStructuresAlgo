package Trees;

public class TreeFromInorderPostOrder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0 || inorder.length != postorder.length)
            return null;
        return buildT(inorder, 0, inorder.length, postorder, 0, postorder.length);

    }
    TreeNode buildT(int[] inorder, int inStart, int inEnd, int[] postOrder, int postStart, int postEnd ){
        if(inStart > inEnd || postStart > postEnd){
            return null;
        }
        int data = postOrder[postEnd];
        TreeNode root = new TreeNode(data);
        int offset=inStart;
        for (; offset < inEnd ; offset++) {
            if(inorder[offset] == data)
                break;
        }
        root.left = buildT(inorder, inStart, offset-1, postOrder, postStart, postStart + offset - inStart-1);
        root.right= buildT(inorder, offset+1, inEnd, postOrder, postStart+offset-inStart, postEnd-1);
        return root;
    }
}
