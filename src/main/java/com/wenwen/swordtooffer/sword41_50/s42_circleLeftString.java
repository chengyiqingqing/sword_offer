package com.wenwen.swordtooffer.sword41_50;

/**
 * Created by Administrator on 2018/3/21.
 */

public class s42_circleLeftString {

    public static void main(String[] args){
        String str="123456789";
        circleLeftString(str,3);
    }

    public static void circleLeftString(String str,int k){
        char[] charArr=str.toCharArray();
        reverseCharArray(charArr,0,k-1);
        reverseCharArray(charArr,k,charArr.length-1);
        reverseCharArray(charArr,0,charArr.length-1);
        System.out.println(String.valueOf(charArr));
    }

    public static void reverseCharArray(char[] charArr,int fromIndex,int toIndex){
        //1.先将反转当前字符；
        while (fromIndex<toIndex){
            char temp=charArr[fromIndex];
            charArr[fromIndex]=charArr[toIndex];
            charArr[toIndex]=temp;
            fromIndex++;
            toIndex--;
        }
    }

}
