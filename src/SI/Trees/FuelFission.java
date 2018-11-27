package SI.Trees;

import java.io.IOException;
import java.util.Scanner;

public class FuelFission {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int testCases =in.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.println(traversals());
/*            printN();*/
        }
    }

    private static long traversals() throws IOException {
        long n = in.nextInt(),n1,ans=0,n2=0;
        if(n==0)
            return 0;
        if(n==1)
            return 3;
        n1=n;
        n2=n;
        int power = 0;
        while(n>=(Math.pow(3,power))){
            n2=n;
            n-=Math.pow(3,power);
            n1=n;
            power++;
        }
        if(n==0)
            return ((long)n2)*3;
        else
            return (long)(n*3)+((n2-n1)*3-n);
    }

/*
    private static boolean print(){

    }
*/
    private static boolean checkFullBinaryTree(TreeNode root) {
        if(root==null)
            return true;
        if((root.left!=null && root.right==null)||(root.left==null && root.right!=null))
            return false;
        return (checkFullBinaryTree(root.left)&&checkFullBinaryTree(root.right));
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

    private static void printN(){
        int atoms = in.nextInt();
        int nodes =1;
        int acopy = 0;
        int ncopy=0;
        while(atoms>=0){
            if(atoms==0){
                System.out.println(atoms*3);
            }else{
                acopy=atoms;
                ncopy=nodes;
                atoms-=nodes;
                nodes*=3;
            }
        }
        acopy+=(ncopy/3);
        System.out.println(2*acopy*3-acopy);
    }
}
