package com.wenwen.swordtooffer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String string1=scanner.next().trim();
        String string2=scanner.next().trim();
        int len=string2.length();
        int sum=0;
        for (int i=0;i<string1.length()-len+1;i++){
            String str=string1.substring(i,i+len);//0,,1,2
            sum+=countMatch(str,string2);
        }
        System.out.println(sum);
    }

    public static int countMatch(String str1,String str2){
        int count=0;
        for (int i=0;i<str1.length();i++){
            if (str1.charAt(i)!=str2.charAt(i))
                count++;
        }
        return count;
    }

}
