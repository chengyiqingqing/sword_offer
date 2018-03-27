package com.wenwen.swordtooffer.sword41_50;

import java.util.LinkedList;

/**
 * Created by Administrator on 2018/3/21.
 * 题目：
 *      给定一个数组[0......n-1]，从第一个元素开始，每次都删除第m的元素。问最后剩下的元素；
 *
 * 解题思路：
 *      利用LinkedList的方式，将数组装入LinkedList，依次累加reId=(reId+interval-1)%LinkedList.size();
 *      并移除list.remove(removeId);
 */

public class s45_circleRemainNumber {

    public static void main(String[] args){
        //1,2,3,4,5
        int number=5;
        int removeNumber=3;
        System.out.println(remainNumber(number,removeNumber));
    }

    public static int remainNumber(int number,int removeNumber){
        //1.初始化array;
        int[] array=new int[number];
        //2.链表LinkedList;//做循环链表的话，取余就可以了。
        LinkedList<Integer> linkedList=new LinkedList<>();
        for (int i=0;i<number;i++){
            array[i]=i+1;
            linkedList.add(array[i]);
        }
        //3.对取余进行移除就好了。
        int removeId=0;
        while(linkedList.size()>1){
            removeId=(removeId+removeNumber-1)%linkedList.size();
            linkedList.remove(removeId);
        }
        int remain= linkedList.get(0);
        return remain;
    }

}
