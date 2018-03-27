package com.wenwen.swordtooffer.sword01_10;

/**
 * Created by Administrator on 2018/3/16.
 * 使用静态内部类实现单例模式；
 * 优点：1.实现懒加载；
 *      2.实现线程安全；
 *      3.性能上没有可优化的地方了。
 * 原理机制：静态内部类的特点是在被getInstance的才会被调用；
 *          此时才会去加载静态属性，实例化外部类的单例对象，实现“懒加载”
 *          又因为它是final类型，所以对象只会被初始化一次，实现“线程安全”；
 *          性能上，相比由锁来实现的线程安全，因为锁机制是单线程访问的，所以这里
 *          在多线程访问单例时又省略了发生阻塞时所带来的性能消耗
 */

public class StaticInstance_02 {

    private StaticInstance_02(){}

    public static StaticInstance_02 getInstance(){
        return InnerStaticClass.instance;
    }

    public static class InnerStaticClass{
        public final static StaticInstance_02 instance=new StaticInstance_02();
    }
}
