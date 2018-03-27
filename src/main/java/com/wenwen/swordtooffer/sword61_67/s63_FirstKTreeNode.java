package com.wenwen.swordtooffer.sword61_67;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/3/23.
 * 有关某一个解题类型，那么先把它的解题类型先给出来了。
 * 然后再进行商讨要解的题目；
 */

public class s63_FirstKTreeNode {

    public static ArrayList<TreeNode> arrayList=new ArrayList<>();
    public static void main(String[] args){
        TreeNode right4=new TreeNode(7,null,null);
        TreeNode left4=new TreeNode(6,null,null);
        TreeNode right3=new TreeNode(5,null,null);
        TreeNode left3=new TreeNode(4,null,null);
        TreeNode right2=new TreeNode(3,left4,right4);
        TreeNode left2=new TreeNode(2,left3,right3);
        TreeNode root1=new TreeNode(1,left2,right2);
        TreeNode target=findFirstKTreeNode(orderTreeNode(root1),2);
        System.out.println(target.data);
    }

    /**
     * 获得第k大值；
     * @param list
     * @param k
     * @return
     */
    public static TreeNode findFirstKTreeNode(ArrayList<TreeNode> list,int k){
        return list.get(list.size()-k);
    }

    /**
     * 中序遍历，获得由小到大的arraylist数据；
     * @param root
     * @return
     */
    public static ArrayList<TreeNode> orderTreeNode(TreeNode root){
        if (root==null){
            return null;
        }
        //1.首先中序遍历；遍历到第k个就是它了；
        orderTreeNode(root.left);
        arrayList.add(root);
        orderTreeNode(root.right);
        return arrayList;
    }

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        public TreeNode(int data){
            this.data=data;
        }
        public TreeNode(int data,TreeNode left,TreeNode right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

}
