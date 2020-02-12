package com.taiyuan.test;

public class Persion {
    private int age;
    private int no;
    public void add(int a,int b){
        int c = a+b;
        System.out.println(c);
    }
    public void setAge(int age) {
        if(age>=100||age<0) {
            age = 0;
        }else{
            this.age = age;
        }
    }
    public int getAge() {
        return age;
    }

}
