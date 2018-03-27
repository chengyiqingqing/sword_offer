package com.wenwen.swordtooffer.sword41_50;

/**
 * Created by Administrator on 2018/3/21.
 * 问题描述：
 *      求1+2+3+......+n，要求不能使用“*，/，for,while,if,else,switch,case”等关键字及条件判断语句；
 * 本体思路：
 *      采用递归的方式：boolean类型定义模拟循环体：左边为终止条件，右边为要递归的内容；
 */

public class s46_restrictSum {

    public static void main(String[] args){
        //1,2,3,4,5
        System.out.println("3: "+getSum(3));
        System.out.println("4: "+getSum(4));
        System.out.println("5: "+getSum(5));
    }

    /**
     * 利用递归的方式；
     * boolean类型定义模拟循环体：左边为终止条件，右边为要递归的内容；
     * @param n
     * @return
     */
    public static int getSum(int n){
        //1.定义返回值；
        int sum=n;
        //2.定义&&模拟循环体:循环终止条件n>0不成立的时候。
        boolean result=(n>0)&&((sum+=getSum(n-1))>0);
        return sum;
    }

}
