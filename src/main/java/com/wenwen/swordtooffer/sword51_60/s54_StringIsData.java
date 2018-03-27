package com.wenwen.swordtooffer.sword51_60;

/**
 * Created by Administrator on 2018/3/22.
 * 描述：
 *      字符串是否标识数值；（整型和小数）
 * 思路：
 *      234234，   +-234,    324.34
 *      逐个字符进行判断；先toCharArray一下;
 *      从后，往前；
 *      也可以直接使用正则表达式。
 */

public class s54_StringIsData {

    public static void main(String[] args){
        String str="-1.23";
        boolean isIntOrFloat=isIntOrFloat(str);
        System.out.println(isIntOrFloat);
    }

    public static boolean isIntOrFloat(String str){
        boolean result=true;
        char[] charArray=str.toCharArray();
        int mark=0;//无符号；
        int pointCount=0;
        for (int i=0;i<charArray.length;i++){
            //先判断有没有正负；
            if (i==0){
                if(!(charArray[i]>='0'&&charArray[i]<='9'||(charArray[i]=='+')||(charArray[i]=='-'))){
                    return false;
                }else if (charArray[i]>='0'&&charArray[i]<='9'){//是的

                }else {
                    mark=1;//代表有符号；
                }
            }else if (mark==1&&(i==1||i==charArray.length-1)&&charArray[i]=='.'){//有符号的时候,1，-0这个位置不能是.
                    return false;
            }else if (charArray[i]>='0'&&charArray[i]<='9'){
            }else if (charArray[i]=='.'){
                if (pointCount==1)
                    return false;
                else
                    pointCount++;
            }else {
                return false;
            }
        }

        return result;
    }

}
