package com.wenwen.swordtooffer.sword11_20;

/**
 * Created by Administrator on 2018/3/17.
 * 打印从1到N位数；
 */

public class PrintOneToNNumber {

    public static void main(String[] args){
        f(6);
    }

    public static void printtoMax(int n){
        int[] array=new int[n];
        if (n<=0)
            return;
        printArray();
        
    }

    private static void printArray() {
//        for (int i=0;i<)
    }


    /**
     * int有限；
     * @param n
     */
    public static void f(int n){
        int max=0;
        for (int i=0;i<n;i++){
            max = max*10+9;
        }
        //max就是最大数了。
        for(int i=1;i<=max;i++){
            System.out.println(i);
        }
    }

    /**
     * 使用String去拼接；
     * 创建一个数组[0,9];
     * @param n
     */
    /*public static void printStr(int n){
        int[] intArray=new int[]{1,2,3,4,5,6,7,8,9,0};
        for (int i=0;i<intArray.length;i++){//外层循环控制位数，从1位开始；
            for (int j=0;j<n;j++){

            }
        }
    }*/

}
