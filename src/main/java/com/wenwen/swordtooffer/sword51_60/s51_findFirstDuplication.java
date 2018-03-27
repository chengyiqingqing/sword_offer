package com.wenwen.swordtooffer.sword51_60;

import java.util.HashSet;

/**
 * Created by Administrator on 2018/3/21.
 * 描述：
 *      在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，
 *      但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 *      例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 * 思路：
 *      可以使用桶排序；也可以使用HashSet;
 *
 */

public class s51_findFirstDuplication {

    public static void main(String[] args){
        int[] array=new int[]{2,3,1,0,2,5,3};
//        findDuplication(array);
        findFirstUsrHashSet(array);
    }

    /**
     * 使用桶排序的方式，进行
     * @param array
     */
    public static void findDuplication(int[] array){
        int[] bucket=new int[array.length];
        for (int i=0;i<bucket.length;i++){
            bucket[i]=0;
        }
        for (int i=0;i<array.length;i++){
            if (bucket[array[i]]!=0){//如果bucket[i]为0，那么让它++； （犯了一个错，bucket里面放入array[i]）
                System.out.println(i);
                break;
            }else {//如果不为0；那么让它输出；
                bucket[i]++;
//                System.out.println(bucket[i]);
            }

        }
    }

    public static void findFirstUsrHashSet(int[] array){
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i=0;i<array.length;i++){
            if (hashSet.contains(array[i])){//包含，就是说重复了；
                System.out.println(""+array[i]);
                break;
            }else {
                hashSet.add(array[i]);
            }
        }
    }

}
