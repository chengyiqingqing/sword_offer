package com.wenwen.swordtooffer.sword51_60;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Administrator on 2018/3/22.
 * 打印之字形二叉树！！！
 */

public class s60_lrlPrintTreeNode {

    public static void main(String[] args){
        TreeNode right4=new TreeNode(7,null,null);
        TreeNode left4=new TreeNode(6,null,null);
        TreeNode right3=new TreeNode(5,null,null);
        TreeNode left3=new TreeNode(4,null,null);
        TreeNode right2=new TreeNode(3,left4,right4);
        TreeNode left2=new TreeNode(2,left3,right3);
        TreeNode root1=new TreeNode(1,left2,right2);
        print(root1);
    }

    /**
     * @param root  二叉树的首节点；
     * @return  返回为之字形的每行二叉树结点集合的集合ArrayList<ArrayList></ArrayList>
     */
    public static ArrayList<ArrayList<Integer>> print(TreeNode root){
        //1.初始化这个集合容器；
        ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<>();
        //2.初始化两个栈：stack1装奇数,stack2装偶数;（1层，2层，3层，4层......）
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        //3.向stack1栈中加入root结点；初始化层级level=1；奇数层放在栈1，偶数层放在栈2；
        stack1.add(root);
        int level=1;
        //4.while循环，循环条件是栈1不为空或者栈2不为空；终止条件是栈1栈2都未空；那还循环个屁啊
        while (!stack1.isEmpty()||!stack2.isEmpty()){
            //5.判断是否是奇数层；-->是，取值；并把子节点（偶数层）放入栈2中（先左left后右right）
            if (level%2!=0){
                ArrayList<Integer> list=new ArrayList<>();
                while (!stack1.isEmpty()){
                    TreeNode curNode=stack1.pop();
                    //☆注意结点判空；
                    if (curNode!=null){
                        list.add(curNode.data);
                        System.out.println(" "+curNode.data);
                        stack2.push(curNode.left);
                        stack2.push(curNode.right);
                    }
                }
                if (!list.isEmpty()){
                    arrayLists.add(list);
                    level++;
                }
            }
            //6.判断是否是奇数层；-->否，取值；并把子节点（奇数层）放入栈1中（先右right后左left）
            else{
                ArrayList<Integer> list=new ArrayList<>();
                while (!stack2.isEmpty()){
                    TreeNode curNode= stack2.pop();
                    if (curNode!=null){
                        list.add(curNode.data);
                        System.out.println(" "+curNode.data);
                        stack1.push(curNode.right);
                        stack1.push(curNode.left);
                    }
                }
                //☆两个点：1是判空，2是在while外面，等while循环完毕了不然数据没加完呢；
                if (!list.isEmpty()){
                    arrayLists.add(list);
                    level++;
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
