package com.wenwen.swordtooffer.sword01_10;

/**
 * Created by Administrator on 2018/3/17.
 * 青蛙跳台阶，一次可以跳一阶，也可以跳两阶，问n个台阶有多少种跳法。
 *      if(n==1||n==2) f(n)=n;
 *      else    f(n)=f(n-1)+f(n-2);
 *      解释：(跳到n-1阶的跳法)+（最后一次跳1阶）
 *           (跳到n-2阶的跳法)+（最后一次跳2阶）
 *
 * 变形：如果一次可以跳，3,4，... n个台阶呢，问n个台阶有多少种跳法。
 *      if(n==1)   f(n)=1
 *      if(n==2)   f(n)=2
 *      if(n==3)   f(n)=4
 *      if(n==4)   f(n)=8
 *      ...
 *      f(n)=f(n-1)+f(n-2)+...f(1)+1=2^(n-1);
 *      (跳到n-1阶的总跳法)+（最后一次跳1阶,一次跳完）
 *      (跳到n-2阶的总跳法)+（最后一次跳2阶,一次跳完）
 *      (跳到n-m阶的总跳法)+（最后一次跳m阶,一次跳完）
 *      n-1阶的总跳法会不会包括n-2呢？不会，因为n-2之后，就直接一步跳完了。
 */

public class FebArray_Wa_09 {

    public static void main(String[] args){
        for (int i=1;i<8;i++){
            System.out.println(" "+f(i));
        }
    }

    /**
     * 递归；
     * @return
     */
    public static int f(int n){
        if (n==1||n==2)
            return n;
        else
            return f(n-1)+f(n-2);
    }

}
