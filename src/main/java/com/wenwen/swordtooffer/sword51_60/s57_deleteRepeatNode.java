package com.wenwen.swordtooffer.sword51_60;

/**
 * Created by Administrator on 2018/3/22.
 */

public class s57_deleteRepeatNode {

    public static void main(String[] args){
        Node node6=new Node(6,null);
        Node node5=new Node(4,node6);
        Node node4=new Node(4,node5);
        Node node3=new Node(2,node4);
        Node node2=new Node(2,node3);
        Node node1=new Node(1,node2);
        Node head=new Node(0,node1);
        Node result=deleteRepeatNode(head);
        while (result!=null){//0,1,6
            System.out.println(" "+result.data);
            result=result.next;
        }
    }

    public static Node deleteRepeatNode(Node head){
        Node firstNode=new Node(-1,head);//保存一份头结点；
        //建立头结点；如果头结点存在；
        Node curNode=head;
        Node preNode =head;
        //循环判断是否重复；
        while (curNode!=null&&curNode.next!=null){
            if (curNode.data==curNode.next.data){//2.这才是重点:有相等的，做删除操作；
                int data =curNode.data;
                //看一下后面还有没有相等的。
                while (curNode!=null&&data==curNode.data){
                    curNode=curNode.next;
                }
                preNode.next=curNode;
            }else {//1.没有相等的，那么做
                preNode=curNode;
                curNode=curNode.next;
            }
        }
        return firstNode.next;
    }

    static class Node{
        int data;
        Node next;
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

    }

}
