package com.wenwen.swordtooffer.sword01_10;

/**
 * Created by Administrator on 2018/3/16.
 * 注意一些api的使用：
 *  取字符：String.charAt();
 *  取子字符串：String.subString(startIndex,num); //startIndex从0开始，包括startIndex.不包括num;
 *  == :比较字符串一定要使用String.equals()。
 */

public class BlankInStringIsReplaced_04 {

    public static void main(String[] args){
        String str=replace("shao wen wen"," ","hh");
        System.out.println(str);
    }

    public static String replace(String str,String ori,String replace){
        if (str==null)
            return null;
//        char[] chArr=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (String.valueOf(str.charAt(i)).equals(ori)){
                sb.append(replace);
            }else {
                sb.append(str.charAt(i));
            }
        }
        return  sb.toString();
//        return  String.valueOf(sb);
    }
}
