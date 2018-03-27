package com.wenwen.swordtooffer.sword51_60;

/**
 * Created by Administrator on 2018/3/22.
 * 因为它有父节点。所以我不用使用中序遍历了。直接传入该结点就可以了。
 */

public class s58_middleVisitCurnodeNextnode {

    public static void main(String[] args){

    }

    public static TreeNode findNextNode(TreeNode curNode){
        TreeNode result=null;
        //判断当前节点有没有右节点；有-->找该右节点的左叶子结点，返回就是它了。
        if (curNode.right!=null){
            curNode=curNode.right;
            if (curNode.left!=null){
                curNode=curNode.left;
            }
            return curNode;
        }
        //没有右节点-->那就直接找他的父节点-->然后判断父节点的左节点是不是当前节点，-->是，那就返回它了。
        while (curNode.parent!=null){
            if (curNode.parent.left==curNode)
                return curNode.parent;
            curNode=curNode.parent;//不直接返回curNode.parent.parent就是要判空；
        }
        //不是；-->找该父节点的父节点，返回就是了
        return result;
    }

    static class TreeNode{

        int data;
        TreeNode parent;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data,TreeNode parent,TreeNode left,TreeNode right){
            this.data=data;
            this.parent=parent;
            this.left=left;
            this.right=right;
        }

    }
}
