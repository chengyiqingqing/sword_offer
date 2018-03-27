package com.wenwen.swordtooffer.sword61_67;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2018/3/23.
 */

public class s61_printTreeNodeFromLeftToRightByLayer {

    public static void main(String[] args){
        TreeNode right4=new TreeNode(7,null,null);
        TreeNode left4=new TreeNode(6,null,null);
        TreeNode right3=new TreeNode(5,null,null);
        TreeNode left3=new TreeNode(4,null,null);
        TreeNode right2=new TreeNode(3,left4,right4);
        TreeNode left2=new TreeNode(2,left3,right3);
        TreeNode root1=new TreeNode(1,left2,right2);
        ArrayList<ArrayList<Integer>> arrayLists= printFromLeftToRightByLayer(root1);
        for (int i=0;i<arrayLists.size();i++){
            ArrayList<Integer> list=arrayLists.get(i);
            for (int j=0;j<list.size();j++){
                System.out.print(" "+list.get(j));
            }
            System.out.println();
        }
    }

    /**
     * @param root 传入要打印的二叉树根节点；
     * @return  返回按层从左到右打印的结果；
     */
    public static ArrayList<ArrayList<Integer>> printFromLeftToRightByLayer(TreeNode root){
        //1.初始化集合，初始化队列Queue，并将跟结点压入栈中；
        ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
//        Stack<TreeNode> stack=new Stack<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        //2.初始化当前行和下一行的最后一个结点；
        TreeNode curRowNode=root;
        TreeNode nextRowNode=root;
        //3.开始while循环遍历->循环条件栈不为空；
        while (!queue.isEmpty()){
            TreeNode curNode=queue.poll();
            if (curNode!=null){
                System.out.print(" "+curNode.data);
                list.add(curNode.data);
                if (curNode.left!=null) {
                    queue.add(curNode.left);
                    nextRowNode=curNode.left;
                }
                if (curNode.right!=null){
                    queue.add(curNode.right);
                    nextRowNode=curNode.right;//会被下面的覆盖吧。
                }
                if (curRowNode==curNode){
                    curRowNode=nextRowNode;
                    if (!list.isEmpty()){
                        arrayLists.add(list);
                    }
                    list=new ArrayList<>();
                    System.out.println();//该行已经打完了，该进行换行操作了；
                }
            }
        }
        return arrayLists;
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
