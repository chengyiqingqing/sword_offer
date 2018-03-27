package com.wenwen.swordtooffer.sword01_10;

import java.util.Stack;

/**
 * Created by Administrator on 2018/3/16.
 * 这里编译的时候出现的问题：在遍历链表并加入stack中时用head!=null判断，不要用head.next!=null；
 * 使用Stack栈来操作类似反转的东西。
 *
 * 反转链表的时候不用stack不如用队列。
 */

public class ReversePrintLinkedNodeVal_05 {
    public static void main(String[] args){
        //构造链表；
        Node node4=new Node(4,null);
        Node node3=new Node(3,node4);
        Node node2=new Node(2,node3);
        Node head=new Node(1,node2);
//        reversePrint(head);
//        reversePrint(reverseLinkedNode(head));
        reverseLinkedNode(head);
    }

    public static void reversePrint(Node head){//1234->4321
        Stack<Node> stack=new Stack<>();
        while (head!=null){
            stack.push(head);
            head=head.next;
        }
        while (!stack.isEmpty()){
            Node node=stack.pop();
            System.out.print(" -- "+node.getData());
        }
    }

    public static Node reverseLinkedNode(Node head){//1234->4321
        Stack<Node> stack=new Stack<>();
        while(head!=null){
            stack.push(head);
            head=head.next;
        }
        Node preNode=null;
        while (!stack.isEmpty()){
            head=stack.pop();
            head.next=preNode;
            preNode=head;
        }
        while(head!=null){
            stack.push(head);
            System.out.println(" "+head.data);
            head=head.next;
        }
        return head;
    }

    public static class Node {
        int data;
        Node next;
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }

}
