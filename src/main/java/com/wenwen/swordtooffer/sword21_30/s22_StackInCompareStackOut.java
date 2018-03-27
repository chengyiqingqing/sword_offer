package com.wenwen.swordtooffer.sword21_30;

import java.util.Stack;

/**
 * Created by Administrator on 2018/3/18.
 */

public class s22_StackInCompareStackOut {

    public static void main(String[] args){
        int[] pushArr=new int[]{1,2,3,4,5};
        int[] popArr=new int[]{4,5,3,2,1};
        System.out.print(compareStackInOut(pushArr,popArr));
    }

    public static boolean compareStackInOut(int[] pushArr,int[] popArr){
        if (pushArr==null){
            return false;
        }
        if (popArr==null){
            return false;
        }
        int index=0;
        Stack<Integer> stack=new Stack<>();
        for (int i=0;i<pushArr.length;i++){
            stack.push(pushArr[i]);//压入原来序列：1.2.3.4.5
            while (!stack.isEmpty()&&stack.peek()==popArr[index]){//和带比较序列popArr 4.5.3.2.1
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }

}
