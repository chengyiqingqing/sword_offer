package com.wenwen.swordtooffer.sword11_20;

/**
 * Created by Administrator on 2018/3/17.
 */

public class ChangeLaskMAndLastNFromLinkedNode {

    public static void main(String[] args){
        //构造链表；
        Node node6=new Node(6,null);
        Node node5=new Node(5,node6);
        Node node4=new Node(4,node5);
        Node node3=new Node(3,node4);
        Node node2=new Node(2,node3);
        Node head=new Node(1,node2);
        Node reHead=change(head,1,6);
        while (reHead!=null){
            System.out.println("---  "+reHead.getData());
            reHead=reHead.next;
        }
    }

    public static Node change(Node head,int lastM,int lastN){
        //链表判空；m,n判断是否符合常规条件；
        int count=0;
        Node cur=head;
        Node curM=head;
        Node curN=head;
        while(cur!=null){
            if (count>=lastM)
                curM=curM.next;
            if (count>=lastN)
                curN=curN.next;
            cur=cur.next;
            count++;
        }
        int temp=curM.data;
        curM.data=curN.data;
        curN.data=temp;
        return head;
    }

    static class Node{
        int data;
        Node next;
        public Node(int data, Node next){
            this.data=data;
            this.next=next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

    }

}
