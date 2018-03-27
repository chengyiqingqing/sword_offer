package com.wenwen.swordtooffer.sword11_20;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2018/3/17.
 * 反转链表的两种方式：
 *  队列；其实队列也是一个原链；
 *  原链；
 */

public class ReverseLinkedNode_16 {

    public static void main(String[] args){
        //构造链表；
        Node node6=new Node(6,null);
        Node node5=new Node(5,node6);
        Node node4=new Node(4,node5);
        Node node3=new Node(3,node4);
        Node node2=new Node(2,node3);
        Node head=new Node(1,node2);
//        head=reverseLinkedList2(head);
        head=reverseNode3(head);

        while (head!=null){
            System.out.println("---  "+head.getData());
            head=head.next;
        }
    }

    /**
     * 使用队列的方式；
     * @param head
     * @return
     */
    public static Node reverseLinkedList2(Node head){
        //1.链表判空，为空则返回null;
        //2.reverse即可；
        Queue<Node> queue=new LinkedList<>();
        while (head!=null){
            queue.add(head);
            head=head.next;
        }
        Node preNode=null;
        while (!queue.isEmpty()){
            head=queue.poll();
            head.next=preNode;
            preNode=head;
        }
        return head;
    }

    public static Node reverseNode3(Node head){
        //判空操作；
        Node preNode=null;
        while (head!=null){
            Node nextNode=head.next;//之后取出的结点肯定是它；
            head.next=preNode;
            preNode=head;
            head=nextNode;
        }
        return preNode;
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
