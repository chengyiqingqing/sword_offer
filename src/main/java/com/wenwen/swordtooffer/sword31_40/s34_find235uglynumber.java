package com.wenwen.swordtooffer.sword31_40;

/**
 * Created by Administrator on 2018/3/19.
 * (1).规定1为第一个丑数;
 * (2).只含2,3,5三个因子；
 */

public class s34_find235uglynumber {

    public static void main(String[] args){
        for (int i=1;i<8;i++){
            System.out.print(" "+f(i));
        }
        System.out.println();
        for (int i=1;i<8;i++){
            System.out.print(" "+getUglyNumber(i));
        }
    }

    /**
     * 找到因子只有2,3或者5的数；
     * 使用for循环遍历的特点；
     */
    public static int f(int n){
        int count=0;
        int num=1;
        while (true){
            if (isUgly(num)){
                count++;
                if (count==n){
                    return num;
                }
            }
            num++;
        }
    }

    /**
     * 判断某个数是否是丑数；
     * @param m
     * @return
     */
    public static boolean isUgly(int m){
        while (m!=1){
            if (m%2==0)
                m=m/2;
            else if (m%3==0)
                m=m/3;
            else if (m%5==0)
                m=m/5;
            else
                return false;
        }
        return true;
    }

    /**
     * 新的方式；
     * @param n
     * @return
     */
    public static int getUglyNumber(int n){
        int[] array=new int[n];
        array[0]=1; //丑数规定；1为第一个丑数；
        int multiply2=0;
        int multiply3=0;
        int multiply5=0;
        for (int i=1;i<n;i++){
            //只含有2,3,5；
            int min=Math.min(array[multiply2]*2,Math.min(array[multiply3]*3,array[multiply5]*5));
            array[i]=min;//这是第i个最小的ugly；
            if (array[multiply2]*2==min){ //往上补齐； array[multiply]就是取arr[i]中的值；
                multiply2++;
            }
            if (array[multiply3]*3==min){
                multiply3++;
            }
            if (array[multiply5]*5==min){
                multiply5++;
            }
        }
        return array[n-1];
    }

}
