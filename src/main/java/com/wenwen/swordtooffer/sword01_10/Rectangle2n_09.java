package com.wenwen.swordtooffer.sword01_10;

/**
 * Created by Administrator on 2018/3/17.
 * 我们可以用2*1的小矩形，横着或竖着去覆盖更大的矩形。请问用n个2*1的小矩形去覆盖无重叠的2*n的
 * 大矩形，总共有多少种方法；。
 *      if()
 *      n==1   f(n)=1
 *      n==2   f(n)=2
 *      else
 *             f(n)=f(n-1)+f(n-2);
 */

public class Rectangle2n_09 {

    public static int f(int n){
        if (n==0|n==1||n==2){
            return n;
        }else {
            return f(n-1)+f(n-2);
        }
    }

}
