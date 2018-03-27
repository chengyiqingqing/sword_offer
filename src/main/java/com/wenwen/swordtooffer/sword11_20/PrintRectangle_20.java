package com.wenwen.swordtooffer.sword11_20;

import java.util.ArrayList;

/**
 * Created by Administrator on 2018/3/17.
 */

public class PrintRectangle_20 {

    public static void main(String[] args){
        int[][] matrix=new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
//                {1,2,3},
//                {5,6,7},
//                {9,10,11},
//                {13,14,15}
        };
        ArrayList<Integer> list=printCircleMatrix(matrix);
        for (int i=0;i<list.size();i++){
            System.out.print(" "+list.get(i));
        }

    }


    /**
     * 打印循环矩阵；
     * @param matrix
     */
    public static ArrayList<Integer> printCircleMatrix(int[][] matrix){
        ArrayList<Integer> list=new ArrayList<>();
        if (matrix==null)
            return list;
        int row=matrix.length;//行数；
        int column=matrix[0].length;//列数；
        int start=0;
        while (row>start*2&&column>start*2){
            printOneCircle(matrix,start,list);
            start++;
        }
        return list;
    }

    /**
     * 打印一个circle；
     * @param matrix
     */
    public static void printOneCircle(int[][] matrix,int start,ArrayList<Integer> list){
        //开始的rowIndex=ColumnIndex=start;
        int rowEndIndex=matrix.length-1;//行数；
        int columnEndIndex=matrix[0].length-1;//列数；
        int endX=rowEndIndex-start;
        int endY=columnEndIndex-start;
        //从左往右；start代表不变的一项
//        if (start<endX&&start<endY){
            for (int columnIndex=start;columnIndex<=endX;columnIndex++){ //让列数index++；
                list.add(matrix[start][columnIndex]);
            }
//        }

        //从上往下；start代表不变的一项
        if (start<endY){
            for (int rowIndex=start+1;rowIndex<=endY;rowIndex++){
                list.add(matrix[rowIndex][endY]);
            }
        }
        //从右往左；
        if (start<endX&&start<endY){
            for (int columnIndex=endX-1;columnIndex>=start;columnIndex--){
                list.add(matrix[endX][columnIndex]);
            }
        }
        //从下往上；
        if (start<endX&&start<endY-1){
            for (int rowIndex=endY-1;rowIndex>=start+1;rowIndex--){
                list.add(matrix[rowIndex][start]);
            }
        }

    }

    //print;
    /*public static ArrayList<Integer> print(int[][] array){
        int row=array.length;
        int column=array[0].length;
        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++) {
                if (j>=i&&j<=column-i)
                    System.out.println(array[i][j]);
            }
            System.out.print(" "+column);
        }
        //应该定义四种；---- 从左往右；从上往下；从右往左；从下往上；
        return null;
    }*/

}
