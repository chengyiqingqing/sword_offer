package com.wenwen.swordtooffer.sword61_67;

/**
 * Created by Administrator on 2018/3/23.
 */

public class s62_SerializeAndDeserializeTreeNode {

    public static void main(String[] args){
        TreeNode right4=new TreeNode(7,null,null);
        TreeNode left4=new TreeNode(6,null,null);
        TreeNode right3=new TreeNode(5,null,null);
        TreeNode left3=new TreeNode(4,null,null);
        TreeNode right2=new TreeNode(3,left4,right4);
        TreeNode left2=new TreeNode(2,left3,right3);
        TreeNode root1=new TreeNode(1,left2,right2);
        String str=serializeTreeNode(root1);
//        System.out.println(str);
        TreeNode treeNode= deserialize(str);
        while (treeNode!=null){
            System.out.println(treeNode.data);
            treeNode=treeNode.left;
        }
    }

    /**
     * 使用前序遍历二叉树，就是让二叉树中所有的值。按照前序遍历的顺序用字符串接起来；
     * 前序遍历：递归；
     * @param root
     * @return
     */
    public static String serializeTreeNode(TreeNode root){
        //1.构建sb类型；
        StringBuilder sb=new StringBuilder();
        //2.二叉树判空； 因为有递归，一定要判空，不然会报空指针和无线循环；
        if (root==null){
            sb.append("#");
            return sb.toString();
        }
        //3.前序遍历三步走；
        sb.append(root.data);
        //☆注意这里是sb.append(serializeTreeNode())  不是serializeTreeNode()
        sb.append(serializeTreeNode(root.left));
        sb.append(serializeTreeNode(root.right));
        return String.valueOf(sb);
    }

    public static int index=-1;

    /**
     * 反序列化，也同样是这个。
     * @param str
     * @return
     */
    public static TreeNode deserialize(String str){
        //1.初始化数据:下标，字符串长度，分割字符串，TreeNode；
        index++;
        int strLength=str.length();
        char[] charArr=str.toCharArray();
        TreeNode node=null;
        //终止条件；
        if (index>strLength)
            return null;
        if (charArr[index]!='#'){//等于#说明为空；不等于#说明不为空，创建结点；
            node=new TreeNode(Integer.valueOf(charArr[index]-48));
            node.left=deserialize(str);
            node.right=deserialize(str);
        }
        return node;
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
