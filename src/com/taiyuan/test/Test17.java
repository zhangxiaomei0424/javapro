package com.taiyuan.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test17 {
    public static void main(String[] args) {
      /*
      * 分别用Arraylist和linkedlist添加100万个元素对比性能差异
      *  添加之前获取一个当前时间  添加之后获取一个当前时间 再用添加后的减去添加前的
      *
      *
      *
      * */
        List arraylist = new ArrayList();
        List linkedlist = new LinkedList();
        Date startarray = new Date();
        for(int i=0;i<10000;i++){
            arraylist.add(0,i);
        }
        Date endarray = new Date();
        System.out.println("arraylist添加用时："+(endarray.getTime()-startarray.getTime()));
        Date startlinked = new Date();
        for(int i=0;i<10000;i++){
            linkedlist.add(0,i);
        }
        Date endlinked = new Date();
        System.out.println("linkedlist添加用时："+(endlinked.getTime()-startlinked.getTime()));
        Date startreadarray = new Date();
        for(int i=0;i<arraylist.size();i++){
            Object obj = arraylist.get(i);
        }
        Date endreadarray = new Date();
        System.out.println("arraylist读取用时："+(endreadarray.getTime()-startreadarray.getTime()));
        Date startreadlinked = new Date();
        for(int i=0;i<linkedlist.size();i++){
            Object obj2 = linkedlist.get(i);
        }
        Date endreadlinked = new Date();
        System.out.println("linkedlist读取用时："+(endreadlinked.getTime()-startreadlinked.getTime()));
    }
}
