package com.wenwen.swordtooffer.sword21_30;

import java.util.HashMap;

/**
 * Created by Administrator on 2018/3/18.
 */

public class s29_findNumberMoreThanHalfArray {

    public static void main(String[] args){
        int[] array=new int[]{1,4,3,4,6,4,7,4,4};
        System.out.println(findNumber(array));
    }

    public static Integer findNumber(int[] array){

        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int arrIndex=0;arrIndex<array.length;arrIndex++){
            if (!hashMap.containsKey(array[arrIndex])){//不含有；
                hashMap.put(array[arrIndex],1);
            }else {//含有；
                hashMap.put(array[arrIndex],hashMap.get(array[arrIndex])+1);
                //先加，加完再去判断；×！！！
                if (hashMap.get(array[arrIndex])>array.length/2)
                    return array[arrIndex];
            }
        }
        /*//for循环去遍历，判断value大于一半，然后取出；
        Set<Integer> set= hashMap.keySet(); //遍历Set要使用迭代器啊Iterator<String> =set.iterator();
        for (Integer num:set){
            if (hashMap.get(num)>(array.length/2)){
                return num;
            }
        }*/
        return 0;

    }

}
