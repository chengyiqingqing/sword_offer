package com.wenwen.swordtooffer.sword61_67;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/3/23.
 */

public class s65_slideWindow {

    public static void main(String[] args){
        int[] array=new int[]{9,8,7,6,5,4,3,2,1};
        ArrayList<Integer> list= getMaxFromWindow(array,3);
        for (int i=0;i<list.size();i++){
            System.out.print(" "+list.get(i));
        }
    }

    /**
     * 1234
     * @param array
     * @param windowSize
     * @return
     */
    public static ArrayList<Integer> getMaxFromWindow(int[] array,int windowSize){
        ArrayList<Integer> list=new ArrayList<>();
        //1.外层for循环控制窗口的个数；
        for (int i=0;i<=array.length-windowSize;i++){
            int max=array[i];
            //2.内层for循环对一个窗口的最大值直接求解；选择最大值；那就选择排序；
            for (int j=i+1;j<i+windowSize;j++){
                if (max<array[j])
                    max=array[j];
            }
            list.add(max);
        }
        return list;
    }

}
