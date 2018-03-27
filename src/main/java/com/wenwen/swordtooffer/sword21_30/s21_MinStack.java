package com.wenwen.swordtooffer.sword21_30;

import java.util.Stack;

/**
 * Created by Administrator on 2018/3/18.
 */

public class s21_MinStack {

    static Stack<Integer> stack=new Stack<>();
    static Stack<Integer> minStack=new Stack<>();

    public static void main(String[] args){
        s21_MinStack.push(3);
        s21_MinStack.push(4);
        s21_MinStack.push(5);
        s21_MinStack.push(2);
        s21_MinStack.push(1);//还是1
        s21_MinStack.push(6);//min是1
        s21_MinStack.push(0);
        System.out.println(s21_MinStack.min());
        s21_MinStack.pop();
        System.out.println(s21_MinStack.min());
        s21_MinStack.pop();
        System.out.println(s21_MinStack.min());
        s21_MinStack.pop();
        System.out.println(s21_MinStack.min());
        s21_MinStack.pop();
        System.out.println(s21_MinStack.min());
        s21_MinStack.pop();
        System.out.println(s21_MinStack.min());
        s21_MinStack.pop();
        System.out.println(s21_MinStack.min());

    }

    public static void push(Integer num){
        stack.push(num);
        while (minStack.isEmpty()||num<minStack.peek()){
            minStack.push(num);
        }
    }

    public static Integer pop(){
        if (stack.isEmpty())
            return null;
        Integer target= stack.pop();
        if (target==minStack.peek()){
            minStack.pop();
        }
        return target;
    }

    public static Integer min(){
        return minStack.peek();
    }

}
