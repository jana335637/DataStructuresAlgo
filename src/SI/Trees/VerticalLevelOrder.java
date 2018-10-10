package SI.Trees;

import java.io.IOException;
import java.util.*;

public class VerticalLevelOrder {
    static HashMap<Integer,TreeSet<Integer>> map = new HashMap<>();
    static StringBuilder sb = new StringBuilder();
    static int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
    static Scanner in = new Scanner(System.in);
    static TreeSet<Integer> set = new TreeSet<>();
    public static void main(String[] args) throws IOException {
        int testCases =in.nextInt();
        for (int i = 0; i < testCases; i++) {
            traversals();
            System.out.println();
        }
    }

    private static void traversals() throws IOException {
        int n = in.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
        }
        TreeNode root=null;
        for (int i = 0; i < n; i++) {
            root=insert(root,a[i]);
        }
        min=Integer.MAX_VALUE;max=Integer.MIN_VALUE;
        map = new HashMap<>();
        verticalZigZagLevelOrder(root,0);
        for (int i = min; i <= max; i++) {
            printArrayList(map.get(i));
            System.out.println();
        }
    }

    private static void printArrayList(Set<Integer> treeNodes) {
        Iterator iterator = treeNodes.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");
    }

    private static void verticalZigZagLevelOrder(TreeNode root,int v) {
        set= new TreeSet<>();
        if(root==null)
            return;
        if(min>v)
            min=v;
        if(max<v)
            max=v;
        if(map.get(v)==null){
            set.add(root.val);
            map.put(v,set);
        }
        else
            map.get(v).add(root.val);
        verticalZigZagLevelOrder(root.left,v-1);
        verticalZigZagLevelOrder(root.right,v+1);
    }

    private static TreeNode insert(TreeNode root, int x) {
        if(root==null)
            return new TreeNode(x);
        if(x<root.val)
            root.left=insert(root.left,x);
        else
            root.right=insert(root.right,x);
        return root;
    }
}
