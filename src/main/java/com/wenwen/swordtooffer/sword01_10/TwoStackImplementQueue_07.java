package com.wenwen.swordtooffer.sword01_10;

import java.util.Stack;

/**
 * Created by Administrator on 2018/3/16.
 */

public class TwoStackImplementQueue_07 {

    public static Stack<Integer> stackIn=new Stack<>();
    public static Stack<Integer> stackOut=new Stack<>();

    public static void push(Integer i){
        stackIn.push(i);
    }

    public static Integer pop(){
        if (stackIn.isEmpty()&&stackOut.isEmpty()){
            System.out.println("没有元素了哟");
            return null;
//                throw new Exception("队列没有元素了");
        }
        if (stackOut.isEmpty()){
            while (!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
        return stackOut.pop();
    }


}
