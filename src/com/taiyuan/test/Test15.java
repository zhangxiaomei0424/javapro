package com.taiyuan.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test15 {
    public static void main(String[] args) {
       /* Persion p1 = new Persion();
        p1.setAge(20);
        System.out.println(p1.getAge());
        Dog d1 = new Dog();
        d1.setName("小五");
        System.out.println(d1.getName());
        p1.setNo(01);
        System.out.println(p1.getNo());
        p1.run();
        d1.run();
        Wanglaoshi w1 = new Wanglaoshi();
        w1.teach();
        w1.setAge(30);
        System.out.println(w1.getAge());*/
        /*int[] array = new int[6];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        int[] array2 = new int[10];
        array2[0] = array[0];
        array2[6] = 7;*/
        /*MyArray myArray = new MyArray();
        myArray.add("张晓梅");
        myArray.add(12345);

        *//*for(int i=1;i<=100;i++){
            myArray.add(i);
        }
        System.out.println(myArray.getSize());*//*
        for(int i=0;i<myArray.getSize();i++){
        System.out.println(myArray.get(i));}*/
        List list = new ArrayList();
        list.add(22);
        list.add(20);
        list.add(33);
        list.add(0,30);
        /*for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));}
        System.out.println(list.size());*/
        List list2 = new ArrayList();
        list2.add("gfdyg");
        list2.add("aweds");
        list.addAll(list2);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));}
        System.out.println(list.indexOf(20));
        List linkedlist = new LinkedList();
        linkedlist.add(20);
    }
}
