package com.wenwen.swordtooffer.sword31_40;

/**
 * Created by Administrator on 2018/3/19.
 */

public class s32_OneNumberFromOneToN {

    public static void main(String[] args){
        System.out.println(""+findOneNumbberFromN(23));
    }

    /**
     * my way:循环递归的方式；
     */
    public static int findOneNumbberFromN(int n){
        int count=0;
        for (int i=1;i<n;i++){
            count+=findOneNumber(i);
        }
        return count;
    }

    /**
     * 查看1的个数；
     * 先对10取余；
     * 然后除10；减位
     * @param m
     * @return
     */
    public static int findOneNumber(int m){
        int count=0;
        while(m!=0){
            if (m%10==1)
                count++;
            m=m/10;
        }
        return count;
    }

    //=================================高效====================================================

}
