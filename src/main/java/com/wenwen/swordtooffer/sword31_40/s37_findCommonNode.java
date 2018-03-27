package com.wenwen.swordtooffer.sword31_40;

import java.util.HashSet;

/**
 * Created by Administrator on 2018/3/19.
 * 问题描述：
 * 思路：使用HashMap的方式；先将head1全部放入hashmap,然后遍历hashmap2;
 *
 */

public class s37_findCommonNode {

    public static void main(String[] args){
        Node node5=new Node(5,null);
        Node node4=new Node(4,node5);
        Node node3=new Node(3,node4);
        Node node2=new Node(2,node3);
        Node node1=new Node(1,node2);

        Node node22=new Node(2,node3);
        Node node11=new Node(1,node22);

        System.out.println(findCommonNode(node1,node11).data);
    }

    public static Node findCommonNode(Node head1,Node head2){
        HashSet<Node> hashSet=new HashSet<>();
        while (head1!=null){
            hashSet.add(head1);
            head1=head1.next;
        }
        while (head2!=null){
            if (hashSet.contains(head2)){
                return head2;
            }
            hashSet.add(head2);
            head2=head2.next;
        }
        return null;
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
