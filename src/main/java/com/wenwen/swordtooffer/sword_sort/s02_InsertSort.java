package com.wenwen.swordtooffer.sword_sort;

/**
 * Created by Administrator on 2018/3/19.
 * 在插入的当前节点，之前全部都是有序的。
 * 比较往前插入，然后再比较，再往前插入；
 */

public class s02_InsertSort {

    public static void main(String[] args){
        int[] arr=new int[]{10,7,3,8,2,9,4,6,5,1};
        insertSort(arr);
        for (int i=0;i<arr.length;i++)
            System.out.print(" "+arr[i]);
    }

    public static void insertSort(int[] array){

        for (int i=1;i<array.length;i++){
            for (int j=i;j>0;j--){
                if (array[j-1]>array[j])
                    swap(array,j-1,j);
                else
                    break;
            }
        }

    }

    public static void swap(int[] array,int m,int n){
        int temp=array[m];
        array[m]=array[n];
        array[n]=temp;
    }

}
