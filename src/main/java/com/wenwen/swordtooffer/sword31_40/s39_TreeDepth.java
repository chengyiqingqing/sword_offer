package com.wenwen.swordtooffer.sword31_40;

/**
 * Created by Administrator on 2018/3/20.
 * 和TreeNode没有关系。
 * 核心：递归，终止条件root==null, 左右子树判断,返回值；
 * （树的深度，是相对于树来说的；树的高度也是相对于树来说的；
 *              但是结点的高度，就是相对于结点而说的；从下向上。）
 * getTreeDepth(TreeNode root)
 *      -->1.终止条件；root==null 返回0；该层结点高度为0；
 *      -->2.返回左右子节点返回的高度；int left=getTreeDepth(root.left)
 *      -->3.判断左右子节点的高度谁的大，让谁加1=父节点的高度。答案出来了
 */

public class s39_TreeDepth {

    public static void main(String[] args){
        TreeNode left2=new TreeNode(0,null,null);
        TreeNode right2=new TreeNode(0,null,null);
        TreeNode root1=new TreeNode(0,left2,right2);
        int depth=getTreeDepth(root1);
        System.out.println(" "+depth);
    }

    public static int getTreeDepth(TreeNode root){
        if (root ==null){
            return 0;
        }
        int left= getTreeDepth(root.left);
        int right=getTreeDepth(root.right);
        int depth;
        if (left>right)
            depth=left+1;
        else
            depth=right+1;
        return depth;
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
