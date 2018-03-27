package com.wenwen.swordtooffer.sword01_10;

/**
 * Created by Administrator on 2018/3/16.
 * 输入n,求出斐波那契数列的第n项；
 */

public class FebArray_09 {

    public static void main(String[] args) {
        for (int i=1;i<8;i++){
//            System.out.println(test(i));
            System.out.println(f(i));
        }
    }

    /**
     * 使用递归的方式；
     * @return
     */
    public static int test(int n){
        if (n==1||n==2)
            return 1;
        else
            return test(n-1)+test(n-2);
    }

    public static int f(int n){
        int n1=1;
        int n2=1;
        int n3=0;
        if (n==1||n==2){
            return 1;
        }else {
            for (int i=3;i<=n;i++){
                n3=n1+n2;
                n1=n2;
                n2=n3;
            }
            return n3;
        }

    }

}
