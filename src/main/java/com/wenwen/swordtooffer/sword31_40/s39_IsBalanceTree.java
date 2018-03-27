package com.wenwen.swordtooffer.sword31_40;

/**
 * Created by Administrator on 2018/3/21.
 */

public class s39_IsBalanceTree {

    public static void main(String[] args){
        TreeNode right11=new TreeNode(1,null,null);
        TreeNode left11=new TreeNode(1,null,null);
        TreeNode right1=new TreeNode(1,null,null);
        TreeNode left1=new TreeNode(1,left11,right11);
        TreeNode root1=new TreeNode(1,left1,right1);
        boolean it= isBalanceTree(root1);
        System.out.println(""+it);
    }

    public static boolean isBalanceTree(TreeNode root){
        if (root==null){
            return true;
        }
        int leftDepth=getTreeDepth(root.left);
        int rightDepth=getTreeDepth(root.right);
        System.out.println(" "+leftDepth);
        System.out.println(" "+rightDepth);
//        int depth=leftDepth>rightDepth?leftDepth:rightDepth;
        if (leftDepth-rightDepth>=-1&&leftDepth-rightDepth<=1)
            return true;
        else
            return false;
    }

    public static int getTreeDepth(TreeNode root){
        if (root==null)
            return 0;
        int leftDepth=getTreeDepth(root.left);
        int rightDepth=getTreeDepth(root.right);
        int depth=leftDepth>rightDepth?leftDepth:rightDepth;
        return depth+1;
    }

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data,TreeNode left,TreeNode right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

}
