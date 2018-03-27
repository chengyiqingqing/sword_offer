package com.wenwen.swordtooffer.sword51_60;

/**
 * Created by Administrator on 2018/3/22.
 */

public class s59_isMirrorTreeNode {

    public static void main(String[] args){

    }

    public static boolean isMirrorTreeNode(TreeNode root){
        //1.判空，为空也是true;
        if (root==null)
            return true;
        return isLeftAndRightCommon(root.left,root.right);
    }

    public static boolean isLeftAndRightCommon(TreeNode leftNode,TreeNode rightNode){
        //1.判空，两者都为空，为true是镜像的。
        if (leftNode==null&&rightNode==null)
            return true;
        if (leftNode!=null&&rightNode!=null){
            if (leftNode.data!=rightNode.data)
                return false;
            return isLeftAndRightCommon(leftNode.left,leftNode.right)
                    &&isLeftAndRightCommon(rightNode.left,rightNode.right);
        }
        return false;
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
