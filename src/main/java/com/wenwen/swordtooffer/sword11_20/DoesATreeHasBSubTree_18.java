package com.wenwen.swordtooffer.sword11_20;

/**
 * Created by Administrator on 2018/3/17.
 */

public class DoesATreeHasBSubTree_18 {

    public static boolean hasSubTree(TreeNode root1, TreeNode root2){
        boolean result=false;
        if (root1!=null&&root2!=null){//root2不为null。但是后面可以。
            if (root1.data==root2.data){ //这个点判断完之后，后面还有
                result= isEqualTree(root1,root2);
            }
            if (!result){
                result= hasSubTree(root1.left,root2)|| hasSubTree(root1.right,root2);
            }
        }
        return result;
    }

    public static boolean isEqualTree(TreeNode root1, TreeNode root2){
        if (root1==null){
            return false;
        }
        if (root2==null){  //是包含关系就行。没有必要root1==root2;
            return true;
        }
        if (root1.data==root2.data){
            return isEqualTree(root1.left,root2.left)&& isEqualTree(root1.right,root2.right);
        }else {
            return false;
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
