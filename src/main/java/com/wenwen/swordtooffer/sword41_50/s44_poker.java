package com.wenwen.swordtooffer.sword41_50;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/3/21.
 */

public class s44_poker {

    public static void main(String[] args){
        int[] numbers=new int[]{1,2,0,0,5};
        if (isSequence(numbers)){
            System.out.println("is sequence");
        }else{
            System.out.println("is not sequence");
        }
    }

    public static boolean isSequence(int[] numbers){
        //去判断是否是顺子；numbers[i]<numbers[i+1]; 0的个数；diff;
        Arrays.sort(numbers);
        int count=0;
        int diff=0;
        for (int i=0;i<numbers.length-1;i++){
            if (numbers[i]==0){
                count++;
                continue;//continue;
            }
            if (numbers[i]!=numbers[i+1]){
                diff+=numbers[i+1]-numbers[i]-1;
            }else {//相等还顺子个屁啊；
                return false;
            }
        }
        if (count>=diff)
            return true;
        return false;
    }

}
