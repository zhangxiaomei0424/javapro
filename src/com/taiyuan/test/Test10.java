package com.taiyuan.test;

public class Test10 {
    /*
    * 构造方法：
    *       1.一旦被调用  则会返回一个对象
    *       2.为私有属性赋值
    *构造方法写法
    *       访问修饰符 方法名（ps:方法名必须和类名一样）(参数列表){
    *            代码不用写返回值
    *       }
    *如果不写 则默认生成一个没有参数的构造方法
    * 如果写了，子不会生成无参的  会生成写的那个构造方法
    *
    *
    * 给私有属性赋值的方法：
    *       1.构造方法
    *       2.set方法
    * */
    public static void main(String[] args) {
        Test10 t10 = new Test10(10,20);
        Test10 t11 =new Test10();
        System.out.println(t10.getA());
    }
    public Test10(){

    }
    public Test10(int a,int b){
        this.a = a;
        this.b = b;
    }
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
