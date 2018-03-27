package com.wenwen.swordtooffer.sword_sort;

/**
 * Created by Administrator on 2018/3/20.
 * 希尔排序；需要记住步长的排序；
 * 让插入排序变为由固定的步长h=1,j--;  变为while(h<n/3) h=h*3+1；
 * 然后进行while（h>=1） 两个for循环做步长为h的插入排序；  h=h/3;
 */

public class s06_ShellSort {

    public static void main(String[] args){
        int[] arr=new int[]{1,3,5,7,9,2,4,6,8,10};
        shellSort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }

    /**
     *
     * @param array
     */
    public static void shellSort(int[] array){
        //1.记录步长：有初始长度array.length和array==1决定；
        int n=array.length;
        int h=1;
        while (h<n/3){
            h=h*3+1;
        }
        //2.由大步到小步，剩余的就是插入排序了。
        while(h>=1){//和h=h/3是一体的。下面两个for循环就是一个插入排序（只不过，步长为h，而不是1）
            for (int i=h;i<n;i++){//这里是i++，因为这里确定是每个元素都要走h步长的插入排序；
                for (int j=i;j>=h;j-=h){//j确保补偿为h的插入排序； j>=h,确保j-h>=0;
                    if (array[j-h]>=array[j]){
                        swap(array,j-h,j);
                    }else {
                        break;
                    }
                }
            }
            h=h/3;
        }
    }

    public static void swap(int[] array,int m,int n){
        int temp=array[m];
        array[m]=array[n];
        array[n]=temp;
    }

}
