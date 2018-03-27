package com.wenwen.swordtooffer.toutiao;

/**
 * Created by Administrator on 2018/3/24.
 *
 * 字符串变量：s和m;
 * 联众操作
 *  m=s;
 *  s=s+s;前后翻倍；
 *
 *  s=s+m;前后相加；
 *
 * s=‘a’;
 * m=s;

 *
 * 求最小操作步骤数；可以将s长度为n;
 */

public class Main2 {

    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//
//        int n=scanner.nextInt();
        for (int i=0;i<20;i++){
            System.out.println(""+i+" ----------- "+st(i));//4

        }
    }

    public static int st(int n){
        int count=0;
        if (n==0||n==1)
            return 0;
        while (n%2==0){
            n=n/2;
            count++;
        }
        return count+f(n);
    }

    //递归；
    public static int f(int size){
        if (size==1||size==0){
            return 0;
        }
        if (size%2==0)
            return size/2;
        else
            return size-1;
    }

}
