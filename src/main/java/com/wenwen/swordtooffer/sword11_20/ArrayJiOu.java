package com.wenwen.swordtooffer.sword11_20;

/**
 * Created by Administrator on 2018/3/17.
 * 对数组的奇，偶进行排序。奇数在左边，偶数在右边，同时奇数偶数的相对顺序不发生改变。
 * 利用插入排序的特点：
 */

public class ArrayJiOu {

    public static void main(String[] args){
        int[] array=new int[]{2,1,3,4,5,6,8,7};
//        sort(array);
        array=sorts(array);

        for (int i=0;i<array.length;i++){
            System.out.println(""+array[i]);
        }
    }

    /**
     * 插入排序的思想；
     * @param array
     * @return
     */
    public static int[] sort(int[] array){
        for (int i=0;i<array.length;i++){//
            for (int j=i+1;j>0&&j<array.length;j--){//
                if(array[j]%2!=0&&array[j-1]%2==0){//是奇数；
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }else {
                    break;
                }
            }
        }
        return array;
    }

    /**
     * 借助辅助数组的思想；
     * @param array
     * @return
     */
    public static int[] sorts(int[] array){
        int count=0;
        int[] arrayList=new int[array.length];
        for (int i=0;i<array.length;i++){
            if (array[i]%2!=0){
                arrayList[count++]=array[i];
            }
        }
        for (int i=0;i<array.length;i++){
            if (array[i]%2==0){
                arrayList[count++]=array[i];
            }
        }
        return arrayList;
    }

}
