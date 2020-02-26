package com.taiyuan.test;

public class Test16 {
    public static void main(String[] args) {
       /* Wanglaoshi w1 = new Wanglaoshi();
        method(w1);*/
        I5 i5 = new I5();
        I3 i3 = new I3();
        MainBoard mainBoard = new MainBoard();
        //setCpu参数需要传cpu类型
        //i3 i5 都可以传递
        mainBoard.setCpu(i5);
        mainBoard.method();
    }
  /*  public static void method(Teacher teacher){

    }*/
}
