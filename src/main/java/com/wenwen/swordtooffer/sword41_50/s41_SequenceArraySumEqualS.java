package com.wenwen.swordtooffer.sword41_50;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/3/21.
 */

public class s41_SequenceArraySumEqualS {

    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> arrayLists=sequenceSum(15);
        for (int i=0;i<arrayLists.size();i++){
            ArrayList list=arrayLists.get(i);
            for (int j=0;j<list.size();j++){
                System.out.print(" "+list.get(j));
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> sequenceSum(int s){
        ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        if (s<3)
            return arrayLists;
        //1.设置最小small和最大big区间；
        int small=1;
        int big=(s+1)/2;
        //2.判断最小区间是否大于(sum+1)/2;  这个是终止条件；
        while (small<=big){
            int sum=0;
            for (int i=small;i<=big;i++){
                sum+=i;
                if (sum==s){
                    for (int j=small;j<=i;j++){
                        list.add(j);
                    }
                    arrayLists.add(new ArrayList<Integer>(list));
                    list.clear();
                    //我在这里对list进行clear会怎样呢？
                    break;
                }
            }
            small++;
        }
        return arrayLists;
        //3.从small一直相加，等于。则将small---的值加入list；将list加入arraylists；清空list;
        //4.不等于，那么small就加加

    }

}
