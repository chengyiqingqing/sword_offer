package com.wenwen.swordtooffer.sword01_10;

/**
 * Created by Administrator on 2018/3/17.
 * 原理描述：
 *      Java中&叫做按位与，&&叫做短路与。
 *          关于&：
 *              &两侧是int数据时，要先把两侧的数转化为2进制，再进行运算。(也可以是boolean两侧)
 *              &&两侧必须是boolean.
 *         记住口诀：（位运算：先int转成二进制，两个要一样长，补0）
 *              &（按位与）----同1则1否则为0；   12&5---1100&101=0100  结果再转int为4；
 *              |（按位或）----有1则为1；
 *              ^ (异或) ----  同为0不同为1；
 *              >>---左移除2
 *              <<---右移乘2；
 *      求-1的补码为例。
 *     原码：将整数部分化为32进制  0000 0000 0000 0001
 *     反码：0变1,1变0      1111 1111 1111 1110
 *     补码：+1             1111 1111 1111 1111
 *
 * 问题描述：
 *     输入一个整数，输出该数二进制中1的个数。其中负数用补码表示。
 * 解题思路：
 *     1.使用“按位与&”，同1为1，否则为0的思路。每次消除原数中最右边的1，直至全部消除，结果为0位置.
 *     2.使用循环取余法，在转换成二进制的时候，就把1取出来。但是负数的时候，这种方式取不出来（×）
 */

public class PrintOneNumFromIntTransformBinary_10 {
//PrintOneNumFromIntTransformBinary_10
    public static void main(String[] args){
        System.out.println("1001:"+f(9));//8,1
        System.out.println("1101:"+f(13));//8,4,1
        System.out.println("-1:"+f(-1));
    }

    public static int f(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n&(n-1);//它俩谁（按位与）谁都是一样的。
        }
        return count;
    }

}
