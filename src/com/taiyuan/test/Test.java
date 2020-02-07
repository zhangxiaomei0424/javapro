package com.taiyuan.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List arraylist = new ArrayList();
        List linkedlist = new LinkedList();
        Date startarray = new Date();
        for(int i=0;i<1000000;i++){
            arraylist.add(0,i);
        }
        Date endarray = new Date();
        System.out.println("ArrayList添加用时="+(endarray.getTime()-(startarray.getTime())));
        Date startlinked = new Date();
        for(int i=0;i<1000000;i++){
            linkedlist.add(0,i);
        }
        Date endlinked = new Date();
        System.out.println("LinkedList添加用时="+(endlinked.getTime()-(startlinked.getTime())));
    }
}
