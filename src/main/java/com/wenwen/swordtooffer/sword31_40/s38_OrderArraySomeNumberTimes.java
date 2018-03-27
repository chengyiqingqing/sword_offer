package com.wenwen.swordtooffer.sword31_40;

/**
 * Created by Administrator on 2018/3/21.
 */

public class s38_OrderArraySomeNumberTimes {

    public static void main(String[] args){
        int[] array=new int[]{1,2,3,4,4,4,4,4,4,4,4,5,5,6,7};
        System.out.println(" "+binarySearch(array,4));
    }

    /**
     * 使用二分查找的方式；
     * @param array
     * @param target
     * @return
     */
    public static int binarySearch(int[] array,int target){//k是要找的这个值；
        int result=0;
        int low=0;
        int high=array.length-1;
        while (low<high){
            int mid=(low+high)/2;
            if (target<array[mid]){
                high=mid-1;
            }else if (array[mid]<target){
                low=mid+1;
            }else {//此时呢 target==array[mid];
                result++;
                for (int i=mid+1;i<array.length;i++){
                    if (array[i]==target)
                        result++;
                    else
                        break;
                }
                for (int i=mid-1;i>=0;i--){
                    if (array[i]==target)
                        result++;
                    else
                        break;
                }
                break;
            }
        }
        return result;
    }

}
