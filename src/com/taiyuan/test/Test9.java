package com.taiyuan.test;

public class Test9 {
    public static void main(String[] args) {
        /*
        * 冒泡排序：
        *       相邻两个数比较大小  然后交换位置
        * 选择排序
        *       用第一个数和每一个数比较 然后交换位置
        * 二分搜索
        *       在数组中快速查找的一种方式 前提是 必须是有序的数组
        * */
       // int[] arrary = {11,32,3,24,65,27,38,98,22,16,10};
        /*选择排序
        for(int i=0;i<=arrary.length-1;i++){
            int flag = 0;
            for(int j=i+1;j<arrary.length;j++){
                if(arrary[i]>arrary[j]){
                    int temp=arrary[j];
                    arrary[j]=arrary[i];
                    arrary[i]=temp;
                    flag++;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(int a:arrary){
            System.out.print("  "+a);
        }*/
        /*冒泡排序
        for(int i=0;i<=arrary.length-1;i++){
            int flag = 0;
            for(int j=0;j<arrary.length-1-i;j++){
                if(arrary[j]>arrary[j+1]){
                    int temp=arrary[j+1];
                    arrary[j+1]=arrary[j];
                    arrary[j]=temp;
                    flag++;
                }
            }
            if (flag==0){
                break;
            }
        }
        for (int a:arrary){
            System.out.print("  "+a);
        }*/

        int[] array =new int[100000];

        for (int i=0;i<array.length;i++){
             array[i] = i+1;
        }
        int b = 60000;
        int index = find(array,b);
        System.out.println(index);
       /* int index = find(array,b);
        System.out.println(index);*/

    }
    /*穷举法
    public static int find(int[] array,int value){
        int count = 0;
        for (int i=0;i<array.length;i++){
            count++;
            if(array[i]==value){
                System.out.println("查找了"+count+"次");
                return i;
            }
        }
        return -1;
    }*/
    //二分搜索
    public static int find(int[] array,int value){
        int min = 0;
        int max = array.length-1;
        int mid = (min+max)/2;
        int count = 0;
        while(min<=max){
            count++;
            mid = (min+max)/2;
            if(value==array[mid]){
                System.out.println("查找了"+count+"次");
                return mid;
            }else if(value<array[mid]){
                max = mid-1;
            }else{
                min = mid+1;
            }
        }
        return -1;
    }
}
