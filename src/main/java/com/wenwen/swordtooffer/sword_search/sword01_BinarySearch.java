package com.wenwen.swordtooffer.sword_search;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/3/26.
 */

public class sword01_BinarySearch {

    public static void main(String[] args){
//        int[] arr=new int[]{1,3,5,7,9,2,4,6,8,10};
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10,11};
        Arrays.sort(arr);
        System.out.println("---已找到位于数组下标为："+binarySearch1(arr,3));
    }

    /**
     *
     * @param arr
     * @param target
     * @return
     */
    public static int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        return binarySearch(arr,low,high,target);
    }

    /**
     *
     * @param arr
     * @param low
     * @param high
     * @param target
     * @return
     */
    public static int binarySearch(int[] arr,int low,int high,int target){
        if (low>=high){
            return -1;
        }
        int result=-1;
        int mid=(low+high)/2;
        if (arr[mid]<target){
            result= binarySearch(arr,mid+1,high,target);
        }else if (arr[mid]>target){
            result= binarySearch(arr,low,mid-1,target);
        }else {
            result=mid;
        }
        return result;
    }

    /**
     * 就使用这个了；
     */
    public static int binarySearch1(int[] arr,int target){
        int result=-1;
        int low=0;
        int high=arr.length-1;
        while (low<high){
            int mid=(low+high)/2;
            if (target<arr[mid]){
                high=mid-1;
            }else if (target>arr[mid]){
                low=mid+1;
            }else {
                result=mid;
                break;
            }
        }
        return result;
    }
}
