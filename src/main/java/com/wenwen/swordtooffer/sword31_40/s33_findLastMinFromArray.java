package com.wenwen.swordtooffer.sword31_40;

/**
 * Created by Administrator on 2018/3/19.
 * 从一个正整数数组中，把所有数值拼接起来，找到最小的数字。
 * 思路：先排序：快速排序
 *       然后在组成字符串：String.valueOf(array);
 */

public class s33_findLastMinFromArray {

    public static void main(String[] args){
        int[] array=new int[]{6,7,8,9,1,2,3,4,5};
//        findMin(array);
        StringBuilder sb=new StringBuilder();
        findMin(array);
        for (int i=0;i<array.length;i++){
            sb.append(array[i]);
        }
        System.out.println(sb.toString());
    }

    /**
     *
     */
    public static void findMin(int[] array){
//        快速排序?写不出来暂时；下午看看；先写选择排序吧。
        for (int i=0;i<array.length;i++){
            int min=i;//主要不要写成：int min=array[i];
            for (int j=i;j<array.length;j++){
                if (array[min]>array[j])
                    min=j;
            }
            swap(array,min,i);
        }
    }

    public static void swap(int[] array,int m,int n){
        int temp=array[m];
        array[m]=array[n];
        array[n]=temp;
    }

}
