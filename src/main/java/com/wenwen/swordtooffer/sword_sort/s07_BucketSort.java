package com.wenwen.swordtooffer.sword_sort;

/**
 * Created by Administrator on 2018/3/20.
 * 桶排序：{5,2,5,2,8}  数字范围为0-10；
 *      创建array[0...10]把上面的数array[k]++。记录每个数出现的次数；
 *      然后进行从小到大遍历按照出现次数遍历即可；
 *
 * 编码顺序：
 *      -->初始化“数据，桶”
 *      -->遍历数据，将数据放入桶；
 *      -->遍历桶，将桶内数据取出；
 */

public class s07_BucketSort {

    public static void main(String[] args){
        int[] arr=new int[]{5,2,5,2,8};
        int[] bucket=new int[11];
        bucketSort(arr,bucket);
    }

    public static void bucketSort(int[] arr,int[] bucket){//aux是辅助数组；

        //1.初始化记录；
        for (int i=0;i<bucket.length;i++){
            bucket[i]=0;
        }
        //2.遍历数据，把数据放入桶内；
        int t;
        for (int i=0;i<arr.length;i++){
            t=arr[i];
            bucket[t]++;
        }
        //3.遍历桶，把桶内的数据拿出来；
        for (int i=0;i<bucket.length;i++){//遍历所有桶；
            for (int j=0;j<bucket[i];j++){//针对当前桶，取出数据；
                System.out.print(" "+i);
            }
        }
    }

}
