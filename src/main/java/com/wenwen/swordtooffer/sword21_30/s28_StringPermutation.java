package com.wenwen.swordtooffer.sword21_30;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by Administrator on 2018/3/18.
 * 将char[] chars转换为String.valueOf(chars);
 * 将String转化为char[] chars转换为String.toCharArray();
 * 整数转化为字符串String.valueOf(int);
 * 自动按照字典序排列，TreeSet是完全可以做到的。
 *
 * 全排列有三个函数。
 * permutation(String)  //或者char类型也是可以的。
 * getResult(char[],startIndex,endIndex,TreeSet)
 * swap(char[],m,n) //m,n作为char数组的下标；
 */

public class s28_StringPermutation {

    public static void main(String[] args){
//        arrays=new int[]{1,2,3,4,5};
//        temp=new int[r];
//        combine(arrays.length,temp.length);
        //这个题的输入条件，输入str行。输入数组也行。
        String str="123";
        ArrayList<String> arrayList= strPermutation(str);
        for (int arrayIndex=0;arrayIndex<arrayList.size();arrayIndex++){
            System.out.println(" "+arrayList.get(arrayIndex));
        }
    }

    /**
     * 全排列有三个函数。
     * permutation(String)  //或者char类型也是可以的。
     * getResult(char[],startIndex,endIndex,TreeSet)
     * swap(char[],m,n) //m,n作为char数组的下标；
     */
    public static ArrayList<String> strPermutation(String str){
        if (str==null)
            return null;
        ArrayList<String> arrayList=new ArrayList<>();
        TreeSet<String> treeSet=new TreeSet<>();
        char[] chars=str.toCharArray();
        getResult(chars,0,chars.length-1,treeSet);
        arrayList.addAll(treeSet);//直接一下子加完；
        return arrayList;
    }

    /**
     * 1.列出所有字符串用递归求解。
     *  对于n个字符串的排列问题。如果能生成n - 1个元素的全部排列结果，
     *  就能生成n个元素的全部排列结果。
     * @param chars
     * @param startIndex
     * @param endIndex
     * @param treeSet
     */
    public static void getResult(char[] chars,int startIndex,int endIndex,TreeSet<String> treeSet){
        if (startIndex==endIndex){
            String str=String.valueOf(chars);
            treeSet.add(str);
        }else {
            for (int i=startIndex;i<=endIndex;i++){
                swap(chars,startIndex,i);//交换一位；
                getResult(chars,startIndex+1,endIndex,treeSet);//递归
                swap(chars,startIndex,i);//再换回来；
            }
        }

    }

    public static void swap(char[] chars,int m,int n){
        if (m!=n){
            char temp=chars[m];
            chars[m]=chars[n];
            chars[n]=temp;
        }
    }

//===================================组合；===============================
    static int[] arrays;
    static int r=3;
    static int[] temp;
    /**
     * 组合；
     * @param n
     * @param r
     */
    public static void combine(int n,int r){
        if (n<r){
            return;
        }else if (r==0){
            for (int tempIndex=0;tempIndex<temp.length;tempIndex++){
                System.out.print(" "+temp[tempIndex]);
            }
            System.out.println();
        }else {
            combine(n-1,r);
            temp[r-1]=arrays[n-1];
            combine(n-1,r-1);
        }
    }

}
