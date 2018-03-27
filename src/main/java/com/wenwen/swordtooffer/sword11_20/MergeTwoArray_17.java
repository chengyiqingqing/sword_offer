package com.wenwen.swordtooffer.sword11_20;

import java.util.Stack;

/**
 * Created by Administrator on 2018/3/17.
 */

public class MergeTwoArray_17 {

    public static void main(String[] args){
        Node node4=new Node(4,null);
        Node node3=new Node(3,node4);
        Node node2=new Node(2,node3);
        Node head1=new Node(1,node2);

        Node node22=new Node(3,null);
        Node head2=new Node(1,node22);
//        Node node=merge(head1,head2);
        Node node=merge2(head1,head2);
        while (node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

    /**
     * 递归的方式；
     * @param head1
     * @param head2
     * @return
     */
    public static Node merge(Node head1,Node head2){
        if (head1==null){
            return head2;
        }
        if (head2==null){
            return head1;
        }
        Node newHead=null;
        if (head1.data<head2.data){
            newHead=head1;
            newHead.next=merge(newHead.next,head2);
        }else {
            newHead=head2;
            newHead.next=merge(head1,newHead.next);
        }
        return newHead;
    }

    /**
     * 非递归的方式；
     * 借助Stack可以很清晰简洁的完成merge。
     * @param head1
     * @param head2
     * @return
     */
    public static Node merge2(Node head1,Node head2){
        if (head1==null){
            return head2;
        }
        if (head2==null){
            return head1;
        }
        Node newNode=null;
        Node preNode=null;
        Stack<Node> stack=new Stack<>();
        while (head1!=null||head2!=null){
            //两个有值那就比较；
            if (head1!=null&&head2!=null){
                if (head1.data<head2.data){
                    //建一个栈；
                    stack.push(head1);
                    head1=head1.next;
                }else {
                    stack.push(head2);
                    head2=head2.next;
                }
            }else{
                if (head1!=null){
                    preNode=head1;
                }else {
                    preNode=head2;
                }
                while (!stack.isEmpty()){
                    newNode=stack.pop();
                    newNode.next=preNode;
                    preNode=newNode;
                }
                break;//终止最外层循环；因为head1和head2并没有全部用上；
            }
        }
        return newNode;
    }

    static class Node{
        int data;
        Node next;
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

    }

}
