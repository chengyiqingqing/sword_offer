package com.wenwen.swordtooffer.sword41_50;

/**
 * Created by Administrator on 2018/3/21.
 */
public class s49_StringTranslateNumber {

    public static void main(String[] args){
        System.out.println(" "+stringTranslateNumber("12"));
    }

    /**
     * 先照着一个简单的顺序，输出这个int值；不考虑临界条件；
     * //'0'==48   '9'==57
     * @param str
     * @return
     */
    public static int stringTranslateNumber(String str){
        int sum=0;
        int count=0;
        char[] charArr=str.toCharArray();
        for (int i=charArr.length-1;i>=0;i--){
            //到i=0的时候，判断是否是正，负，number;
            if (charArr[i]>='0'&&charArr[i]<='9'){
                sum+=Math.pow(10,count++)*(charArr[i]-48);
            }else if (i==0){
                if (charArr[i]=='+'){
                    sum=+sum;
                }else if(charArr[i]=='-'){
                    sum=-sum;
                }else {
                    System.out.println("not int");
                    return 0;
                }
            }else {
                System.out.println("not int");
                return 0;
            }
        }
        return sum;
    }

}
