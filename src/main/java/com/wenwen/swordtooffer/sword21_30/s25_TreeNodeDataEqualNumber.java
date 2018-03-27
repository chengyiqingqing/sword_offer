package com.wenwen.swordtooffer.sword21_30;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Administrator on 2018/3/18.
 */

public class s25_TreeNodeDataEqualNumber {

    public static void main(String[] args){
        TreeNode treeLeft1=new TreeNode(4,null,null);
        TreeNode treeRight1=new TreeNode(5,null,null);
        TreeNode tree3=new TreeNode(3,null,null);
        TreeNode tree2=new TreeNode(2,treeLeft1,treeRight1);
        TreeNode root=new TreeNode(1,tree2,tree3);
//        dfs(root,12);
        stackFinishDfs(root,12);
    }

    static ArrayList<Integer> arrayList=new ArrayList<>();
    static int sum=0;

    /**
     * 前序遍历，把这个路径的值加起来就可以了。
     * 1.递归的形式
     * @param root
     * @return
     */
    public static void dfs(TreeNode root,int target){
        if (root==null)
            return ;
        if (sum<target){
            arrayList.add(root.data);
            sum+=root.data;
            dfs(root.left,target);
            dfs(root.right,target);
        }else if (sum==target){
            for (int i=0;i<arrayList.size();i++)
                System.out.println(" "+arrayList.get(i));
        }
    }

    /**
     * 使用Stack式完成前序遍历，完成前n个和为target；
     * @param root
     * @param target
     */
    public static void stackFinishDfs(TreeNode root,int target){
        if (root==null)
            return;
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode curNode= stack.pop();
            if (sum<target){
                sum+=curNode.data;
                arrayList.add(curNode.data);
                if (curNode.right!=null)  //前序遍历，先压右，再压左！！！
                    stack.push(curNode.right);
                if (curNode.left!=null)
                    stack.push(curNode.left);
            } else if (sum==target){
                for (int i=0;i<arrayList.size();i++)
                    System.out.println(" "+arrayList.get(i));
                break;
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
