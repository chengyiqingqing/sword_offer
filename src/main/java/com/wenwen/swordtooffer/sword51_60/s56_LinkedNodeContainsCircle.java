package com.wenwen.swordtooffer.sword51_60;

import java.util.HashSet;

/**
 * Created by Administrator on 2018/3/22.
 */

public class s56_LinkedNodeContainsCircle {

    public static void main(String[] args){
        Node node4=new Node(4,null);
        Node node3=new Node(3,node4);
        Node node2=new Node(2,node3);
        Node node1=new Node(1,node2);
        Node head=new Node(0,node1);
        node4.next=node2;
//        Node result=findCircleNode(head);
        Node result=findCircleNode2(head);
        System.out.println(result.data);
    }

    /**
     * 1.使用快慢结点的方式；
     * @param head
     * @return
     */
    public static Node findCircleNode(Node head){
        if (head==null)
            return head;
        Node resultNode=null;
        //1.定义快慢结点；
        Node fastNode=head;
        Node slowNode=head;
        //2.找快慢结点首次相遇；
        while (fastNode!=null&&fastNode.next!=null){
            fastNode=fastNode.next.next;
            slowNode=slowNode.next;
            if (fastNode==slowNode){
                //3.让快结点=首节点head；重新期待相遇；
                fastNode=head;
                while (fastNode!=slowNode){
                    fastNode=fastNode.next;
                    slowNode=slowNode.next;
                }
                return fastNode;
            }
        }
        return resultNode;
    }

    public static Node findCircleNode2(Node head){
        Node result=null;
        HashSet<Node> hashSet=new HashSet<>();
        while (head!=null){
            if (hashSet.contains(head)){
                return head;
            } else {
                hashSet.add(head);
                head=head.next;
            }
        }
        return result;
    }

    static class Node{
        int data;
        Node next;
        public Node(int data, Node next){
            this.data=data;
            this.next=next;
        }


    }
}
