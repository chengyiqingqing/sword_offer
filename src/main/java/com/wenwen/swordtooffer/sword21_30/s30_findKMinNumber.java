package com.wenwen.swordtooffer.sword21_30;

/**
 * Created by Administrator on 2018/3/18.
 * 建议思路，是使用堆排序；
 *
 * 我的思路：是使用冒泡排序，即为选择排序，每次都去选择最小的进行排序！！！
 */

public class s30_findKMinNumber {

    public static void main(String[] args){
        int[] array=new int[]{8,7,9,6,5,4,3,2,1};
        findKNumberMin(array,3);
        for (int i=0;i<array.length;i++){
            System.out.print("  "+array[i]);
        }
    }

    public static void findKNumberMin(int[] array,int k){
        for (int index=0;index<k;index++){
            int min=index;
            for (int j=index;j<array.length;j++){
                //通过遍历j找到最小的，同index进行交换；
                if (array[j]<array[min]){
                    min=j;
                }
            }
            swap(array,min,index);
        }
    }

    public static void swap(int[] array,int m,int n){
        int temp=array[m];
        array[m]=array[n];
        array[n]=temp;
    }

}
