package SI.Trees;

import java.io.IOException;
import java.util.Scanner;

public class BalancedBST {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases =in.nextInt();
        for (int i = 0; i < testCases; i++) {
            traversals();
        }
    }

    private static void traversals() throws IOException {
        int n = in.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        TreeNodeHight root=null;
        for (int i = 0; i < n; i++) {
            root=insert(root,a[i]);
        }
        fillHight(root);
        if(checkBalancedBST(root))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    private static int fillHight(TreeNodeHight root) {
        if(root==null) return -1;
        int h = 1+Math.max(fillHight(root.left),fillHight(root.right));
        root.hight = h;
        return h;
    }

    private static boolean checkBalancedBST(TreeNodeHight root) {
        if(root!=null){
            int lHight = getHight(root.left),rHight = getHight(root.right);
            int d = lHight-rHight;
            if(d>1 || d<-1)
                return false;
            return checkBalancedBST(root.left) && checkBalancedBST(root.right);
        }
        return true;
    }

    private static int getHight(TreeNodeHight root) {
        if(root!=null)
            return root.hight;
        return 0;
    }

    private static TreeNodeHight insert(TreeNodeHight root, int x) {
        if(root==null)
            return new TreeNodeHight(x);
        if(x<root.val)
            root.left=insert(root.left,x);
        else
            root.right=insert(root.right,x);
        return root;
    }
}
class TreeNodeHight {
    int val,hight;
    TreeNodeHight left,right;
    public TreeNodeHight(int val){
        this.val = val;
        left=null;
        right=null;
    }
}
