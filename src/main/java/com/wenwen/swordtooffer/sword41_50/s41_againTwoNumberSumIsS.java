package com.wenwen.swordtooffer.sword41_50;

/**
 * Created by Administrator on 2018/3/21.
 * 描述：
 *      输入一个递增排序的数组和一个数字S,在数组中查找两个数；两个数的和正好是S,
 *      如果有多组，请输出它们乘积最小的一组；
 * 解法：
 *      定义两个指针，small,big;相加等于S.它们就是最小的了。因为递增排序；
 *
 * 变形：无序的数组。就直接用组合的方式，去看任意两个数是否为S;
 */

public class s41_againTwoNumberSumIsS {

    public static void main(String[] args){
        int[] arr=new int[]{1,3,4,6,7,8,9,10,11,27,33,34};
        findTwoNumber(arr,20);
    }

    /**
     * 思路；定义两个指针，分别从前面和后面进行遍历。间隔越远乘积越小，所以最先出现的乘积最小；
     * @param array
     * @param target
     */
    public static void findTwoNumber(int[] array,int target){
        //定义两个指针small,big;
        int low=0;
        int high=array.length-1;
//        int small=array[0];
//        int big=array[array.length-1];
        while (low<high){
            int sum=low+high;
            if (sum>target){
                high--;
            }else if (sum<target){
                low++;
            }else {
                System.out.println(" "+low+" "+high);
                break;
            }
        }


    }

}
