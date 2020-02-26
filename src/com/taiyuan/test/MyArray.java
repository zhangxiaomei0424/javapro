package com.taiyuan.test;

public class MyArray {
    //作为存储数据的的数组
    private Object[] array;
    //作为实际数据的个数
    private int size;
    public MyArray(){
        size = 0;
        array = new Object[10];
    }
    public int getSize(){
        return size;
    }
    public void add(Object i){
        //如果存放的个数 大于数组长度则需要扩大容量
        if (size>=array.length){
            //扩大容量的方式：定义一个长度更大的数组 把之前的数组复制进去 扩大1.5倍
            Object [] newarray = new Object[size+size/2];
            for(int j=0;j<array.length;j++){
                newarray[j]=array[j];
            }
            array = newarray;
            System.out.println("扩容完成，新数组的长度为："+array.length);
        }
        array[size++] = i;
    }
    //通过下标取值
    public Object get(int i){
        //取值范围为0--  size-1
        if(i<0||i>=size){
            System.out.println("索引错误");
            return -1 ;
        }else{
            return array[i];
        }
    }
}
