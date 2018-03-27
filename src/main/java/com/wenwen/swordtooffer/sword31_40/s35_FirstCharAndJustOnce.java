package com.wenwen.swordtooffer.sword31_40;

import java.util.LinkedHashMap;

/**
 * Created by Administrator on 2018/3/19.
 */

public class s35_FirstCharAndJustOnce {

    public static void main(String[] args){
        System.out.println(" "+firstChar("asdfasdfasdfasdfbasdfasdfasdf"));
    }

    public static char firstChar(String str){
        char[] charArray=str.toCharArray();
        LinkedHashMap<Character,Integer> hashMap=new LinkedHashMap<>();
        for (char ch:charArray){
            if (hashMap.containsKey(ch)){//包含；+1
                hashMap.put(ch,hashMap.get(ch)+1);
            }else {//不包含；设置为1；
                hashMap.put(ch,1);
            }
        }
        //
        for (char ch:hashMap.keySet()){
            if (hashMap.get(ch)==1)
                return ch;
        }
        return '0';
    }

}
