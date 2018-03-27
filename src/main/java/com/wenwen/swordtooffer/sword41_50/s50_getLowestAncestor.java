package com.wenwen.swordtooffer.sword41_50;

/**
 * Created by Administrator on 2018/3/21.
 * 树是二叉搜索树
 */

public class s50_getLowestAncestor {

    public static void main(String[] args){
        //给出一些节点，实现一个二叉搜索树；
    }

    /**
     *  二叉搜索树的特点：是拍过序的，当前节点大于左节点，小于右节点；
     * @return
     */
    public static BinaryTreeNode getLowestParentAncestor(BinaryTreeNode parentsNode, BinaryTreeNode curNode
                                            , BinaryTreeNode node1, BinaryTreeNode node2){
        //1.判空；
        //2.比较当前节点和两个节点，如果大于一个结点，小于另一个结点。那么就是对的，直接返回当前节点。
        if ((curNode.data-node1.data)*(curNode.data-node2.data)<0){
            return curNode;
        }
        //3.否则，看当天结点是不是和两个节点中的其中一个结点值相等。如果相等，返回当前节点的父节点。
        else if ((curNode.data-node1.data)*(curNode.data-node2.data)==0){
            return parentsNode;
        }
        //4.否则，看当天结点是不是同时小于或者同时大于两个节点。小于则递归cur.right，大于递归cur.left
        else{
            parentsNode=curNode;
            if (curNode.data>node1.data&&curNode.data>node2.data){//大于；
                curNode=curNode.left;
            }else {
                curNode=curNode.right;
            }
            return getLowestParentAncestor(parentsNode,curNode,node1,node2);
        }

    }

    static class BinaryTreeNode{
        int data;
        BinaryTreeNode left;
        BinaryTreeNode right;
        public BinaryTreeNode(int data,BinaryTreeNode left,BinaryTreeNode right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

}
