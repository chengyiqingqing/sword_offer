package com.wenwen.swordtooffer.sword11_20;

/**
 * Created by Administrator on 2018/3/17.
 */

public class LastKNumberFromLinkedNode_15 {

    public static void main(String[] main){
        Node node4=new Node(4,null);
        Node node3=new Node(3,node4);
        Node node2=new Node(2,node3);
        Node head=new Node(1,node2);

        System.out.println(findLastK(head,4).data);
    }

    public static Node findLastK(Node head,int lastK){
        if (head==null||lastK<=0)
            return null;
        int count=0;
        Node cur=head;
        while (head!=null){
            if (count>=lastK){
                cur=cur.next;
            }
            head=head.next;
            count++;
        }
        return cur;
    }

    static class Node{
        int data;
        Node next;
        public Node(int data,Node next){
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
