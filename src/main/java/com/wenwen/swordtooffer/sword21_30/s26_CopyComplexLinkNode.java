package com.wenwen.swordtooffer.sword21_30;

/**
 * Created by Administrator on 2018/3/18.
 */

public class s26_CopyComplexLinkNode {

    public static void main(String[] args){

    }

    /**
     * 复制这个复制链表。其实无所谓复杂，就是建立一个临时结点存一下当前的值；
     * 然后依次往下就可以了。
     * @param root
     * @return
     */
    public static Node copyComplexLinkNode(Node root){
        if (root!=null){
            return null;
        }
        //复制头结点；
        Node head=new Node(root.data,root.next,root.random);
        Node temp=head;
        while (root.next!=null){
            temp.next=new Node(root.next.data,root.next.next,root.next.random);
            root=root.next;
            temp=temp.next;
        }
        return head;
    }

    static class Node{
        int data;
        Node next;
        Node random;
        public Node(int data,Node next,Node random){
            this.data=data;
            this.next=next;
            this.random=random;
        }
    }

}
