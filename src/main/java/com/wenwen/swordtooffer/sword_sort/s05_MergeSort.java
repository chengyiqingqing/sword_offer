package com.wenwen.swordtooffer.sword_sort;

/**
 * Created by Administrator on 2018/3/20.
 * 借助了一个辅助数组；
 * 使用这个辅助数组就可以了。
 * mergeSort(int[] array)-->初始化数据：辅助数组aux，low,high;  调用mergeSort(array,aux,low,high);
 * mergeSort(array,aux,low,high)-->将数组“一分为二mergeSort(自身)，归并merge（归并调用）”。
 * merge(array,aux,low,mid,high)-->利用辅助数组，将数组按照[low,mid],[mid+1,high]进行归并。
 */

public class s05_MergeSort {

    public static void main(String[] args){
        int[] arr=new int[]{10,7,3,8,2,9,4,6,5,1,11};
        mergeSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }

    /**
     * 归并排序的思想；
     * 先分成若干个子数组。一分二，二分四。
     * 然后再两两有序合并，最后合而为一。
     * @param array
     */
    public static void mergeSort(int[] array){//1.初始化数据:辅助数组aux,low,high,调用mergeSort;
        int[] aux=new int[array.length];
        for (int i=0;i<array.length;i++){
            aux[i]=array[i];
        }
        int low=0;
        int high=array.length-1;
        mergeSort(array,aux,low,high);
    }

    /**
     * 借助了辅助数组；
     *
     * @param array
     * @param aux
     * @param low
     * @param high
     */
    public static void mergeSort(int[] array,int[] aux,int low,int high){
        if (low>=high)
            return;
        int mid=(low+high)/2;
        mergeSort(array,aux,low,mid);//因为自身不是有序的。只是将一个数组分开两份，对两份进行比较排序；
        mergeSort(array,aux,mid+1,high);
        merge(array,aux,low,mid,high);
    }

    /**
     * 它一次merge比较不完，因为它可能不是有序的。{1,5,4,3,2,12,9,8,7}
     */
    public static void merge(int[] array,int[] aux,int low,int mid,int high){
        //1.同步一下数组和辅助数组的信息
        for (int k=low;k<=high;k++){
            aux[k]=array[k];
        }
        //2.将[low,high]分成[low,mid],[mid+1,high]两个子数组；并借助辅助数组aux，合并到array中；
        int i=low;//子数组[i,mid]
        int j=mid+1;//子数组[j,high]
        for (int k=low;k<=high;k++){
            if (i>mid){//说明子数组aux[i,mid]用完了i，剩下子数组aux[j,high]
                array[k]=aux[j++];
            }else if (j>high){
                array[k]=aux[i++];
            }else if (array[i]<array[j]){//否则就比较大小了，选小的放入就可以了。
                array[k]=aux[i++];
            }else {
                array[k]=aux[j++];
            }
        }
    }

}
