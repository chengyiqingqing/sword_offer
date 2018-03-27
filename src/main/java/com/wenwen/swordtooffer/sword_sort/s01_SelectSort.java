package com.wenwen.swordtooffer.sword_sort;

import java.util.HashSet;

/**
 * Created by Administrator on 2018/3/19.
 * 选择最小的元素，放在余下数组总最小的位置；
 */

public class s01_SelectSort {

    public static void main(String[] args){

    }

    /**
     * 选择排序；
     * @param array
     */
    public static void selectSort(int[] array){
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i=0;i<array.length;i++){
            int min=i;
            for (int j=0;j<array.length;j++){
                /*if (array[min]-array[j]== K){//temp[1]是小的。
                    if (!hashSet.contains(array[j])){
                        hashSet.add(temp[1]);
                        count++;
                    }
                }else if (temp[1]-temp[0]== K){//temp[0]是小的。
                    if (!hashSet.contains(temp[0])){
                        hashSet.add(temp[0]);
                        count++;
                    }
                }*/
                /*if (array[min]>array[j]){
                    min=j;
                }*/
            }
//            swap(array,min,i);
        }
    }

    public static void swap(int[] array,int index_m,int index_n){
        int temp=array[index_m];
        array[index_m]=array[index_n];
        array[index_n]=temp;
    }

}
