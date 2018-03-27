package com.wenwen.swordtooffer.sword31_40;

/**
 * Created by Administrator on 2018/3/19.
 */

public class s36_reverseOrder {

    public static void main(String[] args){
        int[] array=new int[]{1,3,5,2,4,6,1};
        System.out.println("逆序："+reverse(array));
    }

    public static int reverse(int[] array){
        int count=0;
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j]){
                    count++;
                }
            }
        }
        return count;
    }

}
