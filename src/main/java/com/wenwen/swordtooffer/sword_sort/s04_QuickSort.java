package com.wenwen.swordtooffer.sword_sort;

/**
 * Created by Administrator on 2018/3/20.
 * 小的放左侧，大的放右侧。最后mid和最右侧的小的换一换，放中间就行了。
 *
 * 快速排序过程：
 *  .........*........
 *  ...*.....*....*...
 *  .*.*..*..*..*.*.*.
 *  就这样partion是关键；
 *  if(low>=high) return;
 *  i==high,i==low;
 *  swap(arr,low,j)记得要换回来。最后的i和j可能不相等呢。
 *  -->将数组的第一个元素作为midValue开始进行左小，右大排序；
 *
 *  在递归调用中一定要有终止条件；if(low>=high) return;
 *  quickSort(int[] array,int low,int high)
 *          -->先埋下终止条件,if(low>=high);
 *          -->mid=partition(array,low,high);  //该mid已经排好序，不必再参与以下的排序；如*花图
 *          -->quickSort(array,low,mid-1);
 *          -->quickSort(array,mid+1,high)
 *  partition(int[] array,int low,int high)
 *          -->初始化数据：两个首尾指针i(low),j(high+1)及midVaule=array[low]；  后面while参与--i(首个);--j;
 *          -->while(true) 一直循环判断midValue和array[i,j]的关系
 *                  while(arr[++i]<midValue) if(i==high) break停止;  否则arr[i]就准备交换
 *                  while(midValue<arr[--j]) if(i==high) break停止;  否则arr[j]就准备交换
 *                  再判断一下if(i>=j) break; 终止循环；
 *                  前面都不成立:i比midValue大，j比midValue小，那么swap(arr,i,j)交换；
 *          -->最后也要再做一下交换：把low和j交换一下，因为mid=array[low]未参与交换；（为什么是j，看上一行）
 */

public class s04_QuickSort {

    public static void main(String[] args){
        int[] arr=new int[]{2,3,5,7,9,1,4,6,8,10};
        quickSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }

    /**
     * @param array
     */
    public static void quickSort(int[] array){
        sort(array,0,array.length-1);//传进去的下标；
    }

    public static void sort(int[] array,int low,int high){
        if(low>=high) //差了这一句；
            return;
        int mid=partition(array,low,high);
        sort(array,low,mid-1);
        sort(array,mid+1,high);
    }

    public static int partition(int[] array,int low,int high){
        int i=low;
        int j=high+1;
        int midValue=array[low];
        //34012678 3 2014678 4不符合；
        while (true){
            while (array[++i]<midValue){
                if (i==high) break; //这里有个坑；i==high 别写成i==j了。
            }
            while (midValue<array[--j]){
                if (j==low) break;
            }
            if (i>=j)
                break;//此时找到arr[j]是小于midValue的。因为是从while那里过来的。
            swap(array,i,j);
        }
        swap(array,low,j);  //此时刚好。
        return j;
    }

    public static void swap(int[] array,int m,int n){
        int temp=array[m];
        array[m]=array[n];
        array[n]=temp;
    }

}
