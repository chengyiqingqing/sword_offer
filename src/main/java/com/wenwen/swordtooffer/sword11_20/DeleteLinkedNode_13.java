package com.wenwen.swordtooffer.sword11_20;

import java.util.Stack;

/**
 * Created by Administrator on 2018/3/17.
 */

public class DeleteLinkedNode_13 {

    public static void main(String[] args){
        //构造链表；
        Node node4=new Node(4,null);
        Node node3=new Node(3,node4);
        Node node2=new Node(2,node3);
        Node head=new Node(1,node2);
//        Node linkedNode=delete(head,head);
//        Node linkedNode=deleteNodeByValue(head,2);
        Node linkedNode=deleteNodeUsingStack(head,4);
        while (linkedNode!=null){
            System.out.println(linkedNode.data);
//            System.out.println(linkedNode.data);
            linkedNode=linkedNode.next;
        }
    }

    /**
     * head是头结点；不要动它；直接返回。之后，将要删除的结点进行找到并删除就可以了。
     * 出了问题；问题1，使用cur=head结点。返回的是头结点。那么头结点是不变的。头结点的指向，一直没有发生变化；
     *
     * @param head
     * @param deleteNode
     * @return
     */
    public static Node delete(Node head,Node deleteNode){
        if (head==null||deleteNode==null)//对自己的顺序要捋清楚，口到心到；
            return head;
        if (head==deleteNode){//删除头结点；其实是一样的。下边的就已经包含了删除头结点。
            head=head.next;
            return head;
        }
        Node cur=head;
        while (cur.next!=null){
            if (cur.next==deleteNode){ //删除末结点的情况不考虑；
                cur.next=cur.next.next;
                break;
            }
            cur=cur.next;
        }
        return head;
    }

    /**
     * 根据value删除一个结点
     * @param head
     * @param target
     * @return
     */
    public static Node deleteNodeByValue(Node head,int target){
        if (head==null){
            return head;
        }
        if (head.data==target)
            return head.next;
        Node cur=head;
        while (cur.next!=null){//遍历所有的子结点；
            if (cur.next.data==target){
                cur.next=cur.next.next;//因为在cur.next==cur.next.next之后，cur.next就可能为空了
                break;//没有break;就是删除所有的结点了，但是得加上判空cur=cur.next的时候；
            }
            cur=cur.next;
        }
        return head;
    }

    public static Node deleteNodeUsingStack(Node head,int target){
        if (head==null)
            return head;
        Stack<Node> stack=new Stack<>();
        while(head!=null){
            if (head.data!=target){
                stack.push(head);
            }
            head=head.next;
        }
        Node preNode=null;
        while (!stack.isEmpty()){
            head=stack.pop();
            head.next=preNode;
            preNode=head;
        }
        return head;
    }

    static class Node{
        int data;
        Node next;
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
