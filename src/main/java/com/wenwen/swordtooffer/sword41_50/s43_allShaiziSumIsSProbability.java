package com.wenwen.swordtooffer.sword41_50;

/**
 * Created by Administrator on 2018/3/21.
 */

public class s43_allShaiziSumIsSProbability {

    public static void main(String[] args){

    }

    public static void printProbability(int number){
        if(number<1){
            return;
        }
        //创建一个二维数组；
        int g_maxValue=6;
        int[][] probabilities=new int[2][];
        //第一次掷筛子有6种可能；
        probabilities[0]=new int[g_maxValue*number+1];
        probabilities[1]=new int[g_maxValue*number+1];
        int flag=0;
        //当第一次抛掷筛子时，有六种可能，每种可能出现一次；
        for(int i=1;i<=g_maxValue;i++){
            probabilities[0][i]=1;
        }


    }

}
