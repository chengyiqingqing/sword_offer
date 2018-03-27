package com.wenwen.swordtooffer.sword31_40;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/3/21.
 */

public class s40_findTwoNumberJustOnce {

    public static void main(String[] args){
        int[] arr=new int[]{1,1,2,2,3,3,4,5};
        findNumFirstAppear(arr);

    }

    public static void findNumFirstAppear(int[] array){
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        for (int i=0;i<array.length;i++){
            if (hashmap.containsKey(array[i])){//包含；
                hashmap.put(array[i],hashmap.get(array[i])+1);
            }else {//不包含；
                hashmap.put(array[i],1);
            }
        }
        for(Integer key:hashmap.keySet()){
            if (hashmap.get(key)==1){
                System.out.print(" "+key);
            }
        }
    }

    /**
     * 第一种解法：使用异或的方式去解决问题；
     * @param array
     * @param num1
     * @param num2
     */
    public static void findNumsAppearOnce(int[] array,int num1[],int num2[]){
        num1[0]=0;
        num2[0]=0;
        //1.让array[0]和里面每一个说进行异或；
        int number=array[0];
        for(int i=0;i<array.length;i++){
            number^=array[i];
        }
        //2.异或后的数1，出现在第几位；
        int index=0;
        while ((number&1)==0){
            number=number>>1;//右移；
            index++;
        }
        //3.循环判断第index位是不是为0
        for(int i=0;i<array.length;i++){
            boolean isBit=((array[i]>>index)&1)==0;
            if (isBit){
                num1[0]^=array[i];
            }else {
                num2[0]^=array[i];
            }
        }

    }

}
