package com.wenwen.swordtooffer.sword_sort;

/**
 * Created by Administrator on 2018/3/21.
 * 主题：基数排序(radix)
 * 概念：基数排序已经不再是一种常规的排序方式，它更多地像一种排序方法的应用，基数排序必须依赖于另外的排序方法。
 *      基数排序的总体思路就是将待排序数据拆分成多个关键字进行排序，也就是说，基数排序的实质是多关键字排序。
 */

public class s08_RadixSort {

    public static void main(String[] args){

    }

    public static void radixSort(int[] array,int radix,int d){
        //缓存数组；
        int[] tempArray=new int[array.length];
        //bucket用来记录待排序元素的信息；定义了max-min个桶；
        int[] buckets=new int[radix];
        for(int i=0,rate=i;i<d;i++){

        }
    }

}
