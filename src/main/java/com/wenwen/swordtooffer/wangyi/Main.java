package com.wenwen.swordtooffer.wangyi;

/**
 * Created by Administrator on 2018/3/27.
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        ArrayList<ArrayList<Integer>> arrayList=new ArrayList<>();
        //时间：x时，x分；=x*60+分；
        while (num--!=0) {//注意while处理多个case 3 2 1
            ArrayList<Integer> list=new ArrayList<>();
            int a = in.nextInt();
            int b = in.nextInt();
            list.add((a*60+b));
            list.add(a);
            list.add(b);
            arrayList.add(list);
        }
        int times=3;
        int[] arr=new int[times];
        int index=0;
        while(times--!=0){
            arr[index++]=in.nextInt();
        }
        int result=arr[1]*60+arr[2]-arr[0];
        //接下来使用这个东西;进行比较；
        for (int i=0;i<arrayList.size();i++){
            if (arrayList.get(i).get(0)==result){
                System.out.println(arrayList.get(i).get(1)+" "+arrayList.get(i).get(2));
                break;
            }
        }
    }
}
