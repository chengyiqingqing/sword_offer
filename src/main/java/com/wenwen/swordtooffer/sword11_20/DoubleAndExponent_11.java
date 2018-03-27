package com.wenwen.swordtooffer.sword11_20;

/**
 * Created by Administrator on 2018/3/17.
 * 将double类型的base的整数exponent次方。
 * 1，base不能为0（0.000 001）；
 * 2，整数次方大于0，整数次方小于0；
 *
 */

public class DoubleAndExponent_11 {

    public static void main(String[] args){
        double base=2;
        int exponent=-1;
        System.out.println(f(base,exponent));

    }

    public static double f(double base,int exponent){
        if (isSquareZero(base,0))
            return 0;
        else if (exponent==0){
            return base;
        }else if (exponent>0){
            return  mulp(base,exponent);
        }else {
            return mulp(1/base,-exponent);
        }
    }

    public static double mulp(double base,int exponent){
        double sum=1;
        for (int i=1;i<=exponent;i++){
            sum*=base;
        }
        return sum;
    }

    public static boolean isSquareZero(double n,double m){
        if (n-m<0.000001&&n-m>-0.000001){
            return true;
        }else {
            return false;
        }

    }

}
