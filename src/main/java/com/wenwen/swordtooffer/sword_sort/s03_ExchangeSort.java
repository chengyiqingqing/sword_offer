package com.wenwen.swordtooffer.sword_sort;

/**
 * Created by Administrator on 2018/3/19.
 * 交换排序，每次都从头到尾两两比较，两两交换。
 */

public class s03_ExchangeSort {

    public static void main(String[] args){
        int[] arr=new int[]{10,7,3,8,2,9,4,6,5,1};
        exchangeSort(arr);
        for (int i=0;i<arr.length;i++)
            System.out.print(" "+arr[i]);
    }

    /**
     * 进行n趟；
     * 主要是两两比较，两两交换排序；
     * @param array
     */
    public static void exchangeSort(int[] array){
        for (int i=0;i<array.length;i++){
            for (int j=1;j<array.length;j++){//j不等于1的话，下标会溢出；
                if (array[j-1]>array[j]){
                    swap(array,j,j-1);
                }
            }
        }
    }

    public static void swap(int[] array,int m,int n){
        int temp=array[m];
        array[m]=array[n];
        array[n]=temp;
    }

}
