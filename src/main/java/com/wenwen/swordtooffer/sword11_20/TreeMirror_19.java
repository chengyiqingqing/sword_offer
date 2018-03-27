package com.wenwen.swordtooffer.sword11_20;

/**
 * Created by Administrator on 2018/3/17.
 */

public class TreeMirror_19 {

    public static void getMirror(TreeNode root){
        if (root==null){
            return ;
        }
        while (root!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            getMirror(root.left);
            getMirror(root.right);
        }
        return ;
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

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

        public TreeNode getRight() {
            return right;
        }


    }
}
