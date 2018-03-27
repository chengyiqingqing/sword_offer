package com.wenwen.swordtooffer.sword31_40;

/**
 * Created by Administrator on 2018/3/18.
 * 求最大子数组的和；
 *  两种方式：一种简单直接遍历；
 *            一种直接使用
 */

public class s31_continuous {

    public static void main(String[] args){
        int[] arr=new int[]{0,1,-1,2,3,0,-8,1,5,0,-1};
        System.out.println(findMax(arr));
    }

    public static int findMax(int[] array){
        int max=array[0];   //1.保存当前子数组的最大值；
        int cur=array[0];   //2.当前子数组的和；
        for (int i=1;i<array.length;i++){
            if (cur<0){     //3.如果当前子数组和<0，那么不要再把它加到后续的“数”上，对。
                cur=array[i];
            }else {
                cur+=array[i];//4.如果>0,那么就直接加上后续的数；
            }
            if (cur>max)
                max=cur;   //5.就是把最大的值存起来。
        }
        return max;
    }

}
