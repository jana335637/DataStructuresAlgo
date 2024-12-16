package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserialize {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root == null ) return "";
        StringBuilder res = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(! queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if(tmp !=null){
                    res.append(tmp.val + ",");
                    queue.offer(tmp.left);
                    queue.offer(tmp.right);
            } else {
                res.append("#,");
            }
        }
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == "") return null;
        StringBuilder stringBuilder = new StringBuilder(data);
        int commaIndex = stringBuilder.indexOf(",");
        TreeNode root = new TreeNode(Integer.parseInt(stringBuilder.substring(0,commaIndex)));
        stringBuilder.delete(0, commaIndex+1);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            commaIndex = stringBuilder.indexOf(",");
            String str = stringBuilder.substring(0, commaIndex);
            stringBuilder.delete(0, commaIndex+1);
            if(!str.equals("#")){
                tmp.left = new TreeNode(Integer.parseInt(str));
                queue.offer(tmp.left);
            }
            commaIndex = stringBuilder.indexOf(",");
            str = stringBuilder.substring(0, commaIndex);
            stringBuilder.delete(0, commaIndex+1);
            if(!str.equals("#")){
                tmp.right = new TreeNode(Integer.parseInt(str));
                queue.offer(tmp.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        SerializeDeserialize ser = new SerializeDeserialize();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.right.left = new TreeNode(4);
        treeNode.right.right = new TreeNode(5);
        System.out.println(ser.serialize(treeNode));

// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
        String s = "##-3";
        System.out.println(s.charAt(0)!='#');
        System.out.println(s.substring(0,1));
        System.out.println(s.substring(1,2));

    }


}
