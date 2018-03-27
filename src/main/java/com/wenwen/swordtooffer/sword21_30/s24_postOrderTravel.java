package com.wenwen.swordtooffer.sword21_30;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Administrator on 2018/3/18.
 */

public class s24_postOrderTravel {

    public static void main(String[] main){
        TreeNode treeLeft1=new TreeNode(4,null,null);
        TreeNode treeRight1=new TreeNode(5,null,null);
        TreeNode tree3=new TreeNode(3,null,null);
        TreeNode tree2=new TreeNode(2,treeLeft1,treeRight1);
        TreeNode root=new TreeNode(1,tree2,tree3);

//        System.out.println(isPostOrderTravel(root,array));
        System.out.println(postOrderTravelRecursionResult(root,arrayList));


    }
    static int[] array=new int[]{4,5,2,3,1};
    static ArrayList<Integer> arrayList=new ArrayList<>();
    public static boolean postOrderTravelRecursionResult(TreeNode root,ArrayList<Integer> arrayList){
        arrayList=postOrderTravelRecursion(root);
        for (int i=0;i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
            if (arrayList.get(i)!=array[i])
                return false;
        }
        return true;
    }

    public static ArrayList<Integer> postOrderTravelRecursion(TreeNode root){
        if (root==null)
            return null;
        postOrderTravelRecursion(root.left);
        postOrderTravelRecursion(root.right);
        arrayList.add(root.data);
        return arrayList;
    }


    /**
     * 非递归的形式；
     * @param root
     * @param array
     */
    public static boolean isPostOrderTravel(TreeNode root,int[] array){
        if (root==null||array.length<=0)
            return false;
        Stack<TreeNode> stack=new Stack<>();
        Stack<TreeNode> realStack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
             root=stack.pop();
             realStack.push(root);
            if (root.left!=null)
                stack.push(root.left);
            if (root.right!=null)
                stack.push(root.right);
        }
        int index=0;
        while(!realStack.isEmpty()){
            if (realStack.pop().data!=array[index++]){
                return false;
            }
        }
        return true;
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
