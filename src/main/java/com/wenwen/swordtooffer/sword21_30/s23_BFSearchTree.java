package com.wenwen.swordtooffer.sword21_30;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2018/3/18.
 * 创建一个Stack将结点root加入；循环取出就可以了。
 *
 */

public class s23_BFSearchTree {

    public static void main(String[] args){
        TreeNode treeLeft1=new TreeNode(4,null,null);
        TreeNode treeRight1=new TreeNode(5,null,null);
        TreeNode tree3=new TreeNode(3,null,null);
        TreeNode tree2=new TreeNode(2,treeLeft1,treeRight1);
        TreeNode tree1=new TreeNode(1,tree2,tree3);
        bfSearch(tree1);
    }

    /**
     * 宽度优先遍历，从左往右；
     * 用到Queue的数据结构。先压入，先出并打印；
     * @param root
     */
    public static void bfSearch(TreeNode root){
        if (root==null)
            return ;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()&&root!=null){
            root=queue.poll();
            if (root!=null){ //还要进行一步root判空操作；
                System.out.print(" "+root.data);//创建list把它装进list中也是可以的。
                queue.add(root.left);
                queue.add(root.right);
            }
        }
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
