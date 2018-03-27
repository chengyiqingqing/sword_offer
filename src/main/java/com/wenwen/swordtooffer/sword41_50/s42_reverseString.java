package com.wenwen.swordtooffer.sword41_50;

/**
 * Created by Administrator on 2018/3/21.
 * 反转字符串；
 *
 */

public class s42_reverseString {

    public static void main(String[] args){
        String str="I love programming";
        System.out.println(str.substring(2,6));
//        reverseString(str);
//        reverseStringEveryword(str);
//        reverseStringEverywordBySelf(str);
    }

    public static void reverseString(String str){
        //1.先劈开；反转里面的单词；
        String[] strArr=str.split(" ");
        int low=0;
        int high=strArr.length-1;
        while (low<high){
            String temp=strArr[low];
            strArr[low]=strArr[high];
            strArr[high]=temp;
            low++;
            high--;
        }
        //2.再拼接成字符串；
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<strArr.length;i++){
            sb.append(strArr[i]+" ");
        }
        System.out.println(sb.toString());
    }

    /**
     * 1.字符串转换为“字符数组”，反转每一个字符；
     * @param str
     */
    public static void reverseStringEveryword(String str){
        char[] charArr=str.toCharArray();
        int low=0;
        int high=str.length()-1;
        while (low<high){
            char temp=charArr[low];
            charArr[low]=charArr[high];
            charArr[high]=temp;
            low++;
            high--;
        }
        System.out.println(String.valueOf(charArr));
    }

    public static void reverseStringEverywordBySelf(String str){
        StringBuilder sb=new StringBuilder();
        //charAt(索引),subString(索引，索引不包含)都是从0开始的。
        for (int i=0;i<str.length();i++)
            sb.append(str.substring(str.length()-i-1,str.length()-i));
        System.out.println(sb.toString());
    }

}
