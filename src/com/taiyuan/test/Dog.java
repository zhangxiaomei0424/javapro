package com.taiyuan.test;

public class Dog extends Animal{
    /*private String name;
    private int age;*/
    private int type;
    private char sex;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("狗狗四脚跑");
    }
    /* public void setAge(int age){
        if(age>15||age<0){
            age = 0;
        }else{
            this.age = age;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if (sex != '公' && sex != '母') {
            System.out.println("输入错误，必须是公或者母");
        } else {
            this.sex = sex;
        }
    }*/

}
