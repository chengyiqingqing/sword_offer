package com.wenwen.swordtooffer.sword01_10;

/**
 * Created by Administrator on 2018/3/16.
 */

public class FindMinFromNotDecreaseArray_08 {

    public static void main(String[] args){
        int[] array1=new int[]{3,4,5,1,2};
        int[] array2=new int[]{4,4,4,1,4};
        int[] array3=new int[]{4,4,0,1,2,3,4};
        int[] array4=new int[]{3,4,5,0,0,0,0,1,2,3};
        int min1=findMin(array1);
        System.out.println(""+min1);
        int min2=findMin(array2);
        System.out.println(""+min2);
        int min3=findMin(array3);
        System.out.println(""+min3);
        int min4=findMin(array4);
        System.out.println(""+min4);
    }

    public static int findMin(int[] array){
        //第一步：判空；
        int left=0;
        int right=array.length-1;
        int mid=(left+right)/2;
        int count=0;
        while (array[left]>=array[right]){
            if (right-left<=1){
                mid=right;
                System.out.println("1---"+array[mid]);
                break;
            }
            mid=(left+right)/2;//欠了；得使用debug调一下，看看是哪里走岔道了。
            if (array[left]<=array[mid]){
                left=mid;
            }else{// if (array[mid]<array[right]) 这句话可以不要；一定是这样；
                right=mid;
            }
            count++;
            if (count==5)
                break;
        }
        return array[mid];
    }

}
