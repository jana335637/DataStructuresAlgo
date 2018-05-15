package HackerEarth;

import java.util.Scanner;

public class BinaryTreeNode{
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    static BinaryTreeNode root;
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String firstLine = in.nextLine();
        String[] firstLineChars = firstLine.split(" ");
        int noOfNodes = Integer.parseInt(firstLineChars[0]);
        int rootData = Integer.parseInt(firstLineChars[1]);
        root = new BinaryTreeNode();
        root.data= rootData;
        String[] paths = new String[noOfNodes-1];
        for (int i = 0; i < (noOfNodes-1) ; i++) {
            String path = in.nextLine();
            int nodeData = Integer.parseInt(in.nextLine());
            addNode(root,path,nodeData);
        }
        System.out.println(diameterOfTree(root));
    }
    public static void addNode(BinaryTreeNode root,String path,int data){
        BinaryTreeNode newNode = new BinaryTreeNode();
        newNode.data=data;
        BinaryTreeNode currentNode=root;
        int i;
        for (i = 0; i < (path.length()-1); i++) {
            if(path.charAt(i) == 'L'){
                currentNode = currentNode.left;
            }
            else if(path.charAt(i) == 'R'){
                currentNode = currentNode.right;
            }
        }
        if(path.charAt(i) == 'L'){
            currentNode.left = newNode;
        }
        else if(path.charAt(i) == 'R'){
            currentNode.right= newNode;
        }
    }
    public static int heightOfTree(BinaryTreeNode root){
        if(root==null)
            return -1;
        else
        {
            return max(heightOfTree(root.left),heightOfTree(root.right))+1;
        }
    }
    public static int diameterOfTree(BinaryTreeNode root){
        if(root==null)
            return 0;
        int lheight = heightOfTree(root.left);
        int rheight = heightOfTree(root.right);
        int ldiameter = diameterOfTree(root.left);
        int rdiameter = diameterOfTree(root.right);
        return max(max(ldiameter,rdiameter),lheight+rheight+1);
    }

    private  static int max(int i, int i1) {
        if(i<i1) return i1;
        else return i;
    }
}
