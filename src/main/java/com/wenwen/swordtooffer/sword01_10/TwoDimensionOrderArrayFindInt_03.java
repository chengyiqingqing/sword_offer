package com.wenwen.swordtooffer.sword01_10;

/**
 * Created by Administrator on 2018/3/16.
 * 题目描述
    在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
    请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    思路：
 *      具体实现就是从左到右有序，从上到下有序。左边<右边，上边<下边；
 *      那么就从右上角开始，arr[row][column]>target 说明target值应该在该行左边；那么就column--左移
 *                          ar[row][column]<target 应该在它的下面； 那么就row++下移一行;
 *      但是，还有一个问题；就是它只是找到一个，说明了含有的问题。可能有多个。
 *
 *  延伸：提取关键词提取（二维数组，左右上下有序，查找操作）
 */

public class TwoDimensionOrderArrayFindInt_03 {

    public static void main(String[] args){
        int[][] array=new int[][]{
                {1,2,3,4},
                {2,3,4,5},
                {3,4,5,6},
                {4,5,8,9}
        };
        find(array,4);

    }

    public static boolean find(int[][] array,int target){
        int rowNum=array.length;// 就是行的长度；
        int columnNum=array[0].length; //就是列的长度；

        int rowIndex=0;
        int columnIndex=columnNum-1;
        while (rowIndex<rowNum&&columnIndex>=0){//直到这个条件完成就可以了。
            if (array[rowIndex][columnIndex]==target){
                System.out.println("rowIndex,columnIndex  -- ("+rowIndex+","+columnIndex+")");
                return true;//此时array[row][column]要找的值；
            }else if (array[rowIndex][columnIndex]>target){//大于
                columnIndex--;
            }else {
                rowIndex++;
            }
        }
        return false;
    }


}
