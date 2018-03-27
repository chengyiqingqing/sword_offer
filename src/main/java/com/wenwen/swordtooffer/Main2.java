package com.wenwen.swordtooffer;

import java.util.HashSet;

/**
 * Created by Administrator on 2018/3/22.
 */

public class Main2 {

    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
//        String str=scanner.next().trim();
        String str="123456789";
        char[] charArr=str.toCharArray();
        int[] arr=new int[charArr.length];
        int[] bucket=new int[10];
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i=0;i<charArr.length;i++){
            arr[i]=(charArr[i]-48);
            hashSet.add(arr[i]);
        }
        for (int i=1;i<=9;i++){
            if (!hashSet.contains(i)){
                System.out.println(i);
                break;
            }
        }
//        bucketSort(arr,bucket);
    }

    public static void bucketSort(int[] arr,int[] bucket){//aux是辅助数组；
        //1.初始化记录；
        for (int i=0;i<10;i++){//里面存放0.9；
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
            if (bucket[i]>=1){
                int m=1;
                while (true){
                    if (m<i){
                        System.out.println(m);
                        break;
                    }else if (m==i){
                        break;
                    }else {
                        m++;
                    }
                }
                break;
            }
        }
    }

}
