package com.wenwen.swordtooffer.sword51_60;

/**
 * Created by Administrator on 2018/3/22.
 */

public class s52_AAndBMultiply {

    public static void main(String[] args){
        int[] arrayA=new int[]{1,2,3,4};
        mulp(arrayA);
    }

    public static void mulp(int[] arrayA){
        int[] arrayB=new int[arrayA.length];
        for (int indexB=0;indexB<arrayA.length;indexB++){
            arrayB[indexB]=getB(arrayA,indexB);
        }
        for (int i=0;i<arrayB.length;i++){
            System.out.println(" "+arrayB[i]);
        }
    }

    public static int getB(int[] arrayA,int i){
        int result=1;
        for (int index=0;index<arrayA.length;index++){
            if (index!=i){
                result*=arrayA[index];
            }
        }
        return  result;
    }

}
