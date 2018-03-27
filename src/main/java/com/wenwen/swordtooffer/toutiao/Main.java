package com.wenwen.swordtooffer.toutiao;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static int[] ori = null;
    public static int[] temp = null;
    public static final int TWO = 2;
    public static int N = 6;
    public static int K = 2;//差值；
    public static long count=0;
    public static HashSet<Integer> hashSet=new HashSet<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        N=scanner.nextInt();
        K=scanner.nextInt();
        ori=new int[N];
        //循环输入数字；1 2 3 4 3 5
        for (int i=0;i<N;i++){
            ori[i]=scanner.nextInt();
        }
        temp = new int[TWO];
        reCombine(N, TWO);
        System.out.println(count);
        return;
    }

    public static void selectSort(int[] array){
        Arrays.sort(array);
        HashSet<Integer> hashSet=new HashSet<>();
        for (int i=0;i<array.length;i++){
            int min=i;
            for (int j=i+1;j<array.length;j++){
                if (array[min]-array[j]== K){//temp[1]是小的。
                    if (!hashSet.contains(array[j])){
                        hashSet.add(array[j]);
                        count++;
                    }
                }else if (array[j]-array[min]== K){//temp[0]是小的。
                    if (!hashSet.contains(array[min])){
                        hashSet.add(array[min]);
                        count++;
                        break;
                    }
                }
            }
        }
    }

    public static void reCombine(int n,int r){
        if (n<r){
            return;
        }else if (r==0){//这里是得出了一个temp的组合。
            //1.在这里对temp进行一次有序的排列。那么就可以了，如果首个数字相同，那么就舍去；
            if (temp[0]-temp[1]== K){//temp[1]是小的。
                if (!hashSet.contains(temp[1])){
                    hashSet.add(temp[1]);
                    count++;
                }
            }else if (temp[1]-temp[0]== K){//temp[0]是小的。
                if (!hashSet.contains(temp[0])){
                    hashSet.add(temp[0]);
                    count++;
                }
            }
        }else{
            reCombine(n-1,r);
            temp[r-1]=ori[n-1];
            reCombine(n-1,r-1);
        }
        return;
    }

//    public static void

}
