package com.taiyuan.test;

public class Test18 {
   /* public static final int[] a = {1,2,3,4};*/
    public static void main(String[] args) {
        //String是java中的字符串类
        //是由一个或由多个字符组成   定义时用""包裹
        /*for(int i:a){
            System.out.println(i);
        }*/
        /*String a = "dwuebfuw";
        method(a);
        System.out.println(a);
*//*
        String a = new String("asd");
        String b = new String("asd");
        System.out.println(a.equals(b));*/
        /*String a = "abc";
        a=a+"d";
        System.out.println(a);*/
        /*StringBuffer buffer = new StringBuffer("a");
        buffer.append("b");
        buffer.append("c");
        System.out.println(buffer);*/
        StringBuilder builder = new StringBuilder("a");
        builder.append("b");
        builder.append("c");
        System.out.println(builder.toString());
    }
    /*public static void method(String a){
        a = "jlisfho";
    }*/
}
