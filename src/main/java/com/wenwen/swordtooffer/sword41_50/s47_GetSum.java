package com.wenwen.swordtooffer.sword41_50;

/**
 * Created by Administrator on 2018/3/21.
 */

public class s47_GetSum {

    public static void main(String[] args){
        int number1=1;
        int number2=2;
        System.out.println(add(number1,number2));
    }

    public static int add(int number1,int number2){
        while (number2!=0){
            int temp=number1^number2;
            number2=(number1&number2)<<1;
            number1=temp;
        }
        return number1;
    }

}
