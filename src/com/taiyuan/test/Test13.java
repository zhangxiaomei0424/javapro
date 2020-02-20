package com.taiyuan.test;

public class Test13 {
    public static void main(String[] args) {
        //int[] array={1,2,3,4};
        System.out.println(add(1,2,3,4));
    }
    public static int add(int... array){
        int sum = 0;
        for (int a:array){
            sum+=a;
        }
        return sum;
    }
}
